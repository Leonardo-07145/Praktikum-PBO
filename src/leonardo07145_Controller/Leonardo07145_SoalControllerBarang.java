package leonardo07145_Controller;

import leonardo07145_Entity.Leonardo07145_barang;
import leonardo07145_Model.Leonardo07145_SoalModelBarang;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class Leonardo07145_SoalControllerBarang {
   
    public void insert(String nama, int kode, int harga) {
        Leonardo07145_AllObjectModel.barangmodel.insert(new Leonardo07145_barang(nama, kode, harga));
    }
    public ArrayList<Leonardo07145_barang> getArrbarang() {
        return Leonardo07145_AllObjectModel.barangmodel.getArrbarang();
    }
    public void update(int index, Leonardo07145_barang leonardo07145_barang) {
        Leonardo07145_AllObjectModel.barangmodel.update(index, leonardo07145_barang);
    }
    public void remove(int index) {
        Leonardo07145_AllObjectModel.barangmodel.remove_barang(index);
    }
    public DefaultTableModel daftarbarang(){
        DefaultTableModel dftrbarang = new DefaultTableModel();
        Object[] kolom ={"Nama","Kode","Harga"};
        dftrbarang.setColumnIdentifiers(kolom);
        int size = Leonardo07145_AllObjectModel.barangmodel.getArrbarang().size();
        for(int i=0;i<size;i++){
            Object[] data = new Object[3];
            data[0] = Leonardo07145_AllObjectModel.barangmodel.getArrbarang().get(i).getNama();
            data[1] = Leonardo07145_AllObjectModel.barangmodel.getArrbarang().get(i).getKode();
            data[2] = Leonardo07145_AllObjectModel.barangmodel.getArrbarang().get(i).getHarga();
            dftrbarang.addRow(data);
        }
        return dftrbarang;
    }
}