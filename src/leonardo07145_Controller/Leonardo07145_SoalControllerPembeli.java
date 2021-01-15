package leonardo07145_Controller;

import leonardo07145_Model.Leonardo07145_SoalModelPembeli;
import leonardo07145_Entity.Leonardo07145_pembeli;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Leonardo07145_SoalControllerPembeli {
    
    public Leonardo07145_SoalControllerPembeli(){
    }
    public void insert(String nama, String notelp, String alamat) {
        Leonardo07145_AllObjectModel.pembelimodel.insert(new Leonardo07145_pembeli(nama,notelp,alamat));
    }
    public DefaultTableModel daftarpembeli(){
        DefaultTableModel dftrpembeli = new DefaultTableModel();
        Object[] kolom ={"Nama","Alamat","No Telepon"};
        dftrpembeli.setColumnIdentifiers(kolom);
        int size = Leonardo07145_AllObjectModel.pembelimodel.getArrpembeli().size();
        for(int i=0;i<size;i++){
            Object[] data = new Object[3];
            data[0] = Leonardo07145_AllObjectModel.pembelimodel.getArrpembeli().get(i).getNama();
            data[1] = Leonardo07145_AllObjectModel.pembelimodel.getArrpembeli().get(i).getAlamat();
            data[2] = Leonardo07145_AllObjectModel.pembelimodel.getArrpembeli().get(i).getNotelp();
            dftrpembeli.addRow(data);
        }
        return dftrpembeli;
    }
}