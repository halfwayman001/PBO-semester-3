package kasus2;

class menuRestaurant {
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    menuRestaurant(){
        this.harga_makanan = new double[10];
        this.nama_makanan = new String[10];
        this.stok = new int[10];
    }
    public void setNama(String nama, byte id){
        this.nama_makanan[id] = nama;
    }
    public String getNama(byte id){
        return nama_makanan[id];
    }
    public void setHarga(double harga, byte id){
        this.harga_makanan[id] = harga;
    }
    public double getHarga(byte id){
        return harga_makanan[id];
    }
    public void setStok(int stok, byte id){
        this.stok[id] += stok;
    }
    public int getStok(byte id){
        return stok[id];
    }
    public void penguranganStok(byte id, int jumlah_pesanan){
        this.stok[id] -= jumlah_pesanan;
    }
}
