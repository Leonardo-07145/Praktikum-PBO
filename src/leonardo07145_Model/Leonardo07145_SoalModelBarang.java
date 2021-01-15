package leonardo07145_Model;

import leonardo07145_Entity.Leonardo07145_barang;
import java.util.ArrayList;

public class Leonardo07145_SoalModelBarang {
    private ArrayList<Leonardo07145_barang> arrbarang;
        
    public Leonardo07145_SoalModelBarang(){
        this.arrbarang = new ArrayList<>();
    }
    public ArrayList<Leonardo07145_barang> getArrbarang() {
        return arrbarang;
    }
    public void insert(Leonardo07145_barang leonardo07145_barang) {
        arrbarang.add(leonardo07145_barang);
    }
    public void update(int index, Leonardo07145_barang leonardo07145_barang) {
        arrbarang.set(index, leonardo07145_barang);
    }
    public void remove_barang(int index){
        arrbarang.remove(index);
    }
    
}