package kasus2;
import java.util.*;
import static javax.swing.text.html.parser.DTDConstants.ID;
public class RestaurantMain {
    private static int jumlah_pesanan;
    public static void main(String[] args){
        Scanner masukan = new Scanner(System.in);
        int x;
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala - Bala", 1_000, 20);
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        
        menu.tampilMenuMakanan();
        System.out.println("Masukan ID Pesanan: ");
        x = masukan.nextInt();
        System.out.println("Mau Berapa Banyak?: ");
        jumlah_pesanan = masukan.nextInt();
        menu.pesan(x, jumlah_pesanan);
    }
}
