package leonardo07145_Model;

import java.util.ArrayList;
import leonardo07145_Entity.Leonardo07145_pembeli;

public class Leonardo07145_SoalModelPembeli {
    private ArrayList<Leonardo07145_pembeli> arrpembeli;
    
    public Leonardo07145_SoalModelPembeli(){
        this.arrpembeli = new ArrayList<>();
    }
    public ArrayList<Leonardo07145_pembeli> getArrpembeli() {
        return arrpembeli;
    }
    public void insert(Leonardo07145_pembeli leonardo07145_pembeli) {
        arrpembeli.add(leonardo07145_pembeli);
    }
}
