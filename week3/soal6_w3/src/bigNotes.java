import java.util.Scanner;
import java.math.BigInteger;

public class bigNotes {
    public static void main(String[] args){
     Scanner masukan = new Scanner(System.in);
        
        String A = masukan.nextLine();
        String B = masukan.nextLine();
        
        BigInteger bigA = new BigInteger(A);
        BigInteger bigB = new BigInteger(B);
        
        System.out.println(bigA.add(bigB));
        System.out.println(bigA.multiply(bigB));
}    
}
