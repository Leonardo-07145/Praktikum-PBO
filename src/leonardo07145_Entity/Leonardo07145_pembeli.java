package leonardo07145_Entity;

public class Leonardo07145_pembeli extends Leonardo07145_KasirAbstract{
    private String alamat;
    public Leonardo07145_pembeli(String nama, String notelp, String alamat){
        super(nama, notelp);
        this.alamat = alamat;
    }
    @Override
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}