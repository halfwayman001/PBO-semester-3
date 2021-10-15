package kasus2;
import java.util.*;
public class Restaurant {
    private menuRestaurant menu;
    public static byte id=0;
    public Restaurant(){
        menu = new menuRestaurant();
    }
    
    public void tambahMenuMakanan(String nama, double harga, int stok){
       menu.setNama(nama, id);
       menu.setHarga(harga, id);
       menu.setStok(stok, id);
       id++;
    }
    
    public void tampilMenuMakanan(){
	for(byte i = 0; i <= id;i++){
            if(!isOutOfStock(i)){
		System.out.println(i +"| "+menu.getNama(i) +"["+ menu.getStok(i) +"]"+"\t\tRp. "+ menu.getHarga(i));
		}
            }
	}
    
    public boolean isOutOfStock(byte id){
        return menu.getStok(id) == 0;
    }
    
    public void pesan(int ID, int jumlah_pesanan){
        byte id = (byte) ID;
        if((menu.getStok(id) - jumlah_pesanan) <= 0){
            System.out.println("Stok Tidak Tersedia");
        }else{
            System.out.println("Pesanan :"+ menu.getNama(id)+ "sebanyak" +jumlah_pesanan);
            System.out.println("Total Harga Rp."+menu.getHarga(id)*jumlah_pesanan);
            menu.penguranganStok(id, jumlah_pesanan);
            System.out.println("=======TERIMAKASIH========");
        }
    }
    
    private boolean isOutOfStock(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
