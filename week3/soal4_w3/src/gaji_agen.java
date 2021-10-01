import java.util.Scanner;

public class gaji_agen {
    public static void main(String[] args){
        Scanner inputan = new Scanner(System.in);
        int gaji = 500000, denda, bonus, harga = 50000, item_terjual;
        System.out.print("Jumlah Item Terjual: ");
        item_terjual=inputan.nextInt();
        if(item_terjual > 80){
            bonus = harga*item_terjual*35/100;
            gaji = gaji + bonus;
            System.out.println(gaji);
        }else if(item_terjual >= 40 && item_terjual <=80){
            bonus = harga*item_terjual*25/100;
            gaji = gaji + bonus;
            System.out.println(gaji);
        }else if(item_terjual < 15){
            denda = harga*(15 - item_terjual)*15/100;
            gaji = gaji - denda;
            System.out.println(gaji);
        }else{
            bonus = harga*item_terjual*10/100;
            gaji = gaji + bonus;
            System.out.println(gaji);
        }
    }
}
