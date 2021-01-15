package leonardo07145_Entity;

public abstract class Leonardo07145_KasirAbstract {
    protected String nama, notelp;
    protected int kode;
    
    public Leonardo07145_KasirAbstract(String nama, String notelp){
        this.nama = nama;
        this.notelp = notelp;
    }
    public Leonardo07145_KasirAbstract(String nama, int kode){
        this.nama = nama;
        this.kode = kode;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setKode(int kode) {
        this.kode = kode;
    }
    public String getNama() {
        return nama;
    }
    public int getKode() {
        return kode;
    }
    public String getNotelp() {
        return notelp;
    }
    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }
}
