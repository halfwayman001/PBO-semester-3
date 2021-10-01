import java.util.*;

public class inputoutputdua {
 public static void main(String[] args){
    	Scanner keyboard = new Scanner(System.in);
        String[] kata;
        short[] angka;
	kata = new String[3];
	angka = new short[3];
	Scanner inputan = new Scanner(System.in);
	kata[0] = inputan.next();
	angka[0] = inputan.nextShort();
	kata[1] = inputan.next();
	angka[1] = inputan.nextShort();
	kata[2] = inputan.next();
	angka[2] = inputan.nextShort();
	inputan.close();
        System.out.println("================================");
        int i;
		for(i=0;i<=2; i++) {
			
			System.out.printf("%-15s%03d\n", kata[i], angka[i]);
		}
        System.out.println("================================");            
    }    
}
