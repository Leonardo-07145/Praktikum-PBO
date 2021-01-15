package leonardo07145_Entity;

public class Leonardo07145_barang extends Leonardo07145_KasirAbstract{
    private int harga;
    public Leonardo07145_barang(String nama, int kode, int harga){
    super(nama, kode);
    this.harga = harga;
    }
    @Override
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
}