import java.util.Scanner;

public class Datatype{


    public static void main(String []argh) {
        long a;

        Scanner sc = new Scanner(System.in);

        for(;;) {
            try {

                a = sc.nextLong();

                System.out.println(a + " can be fitted in:");


                if (a >= -128 && a <= 127) {
                    System.out.println("* byte");
                }
                if (a >= -32768 && a <= 32767) {
                    System.out.println("* short");
                }
                if (a >= -2147483648 && a <= 2147483647) {
                    System.out.println("* int");
                }
                if (a >= -9223372036854775808L && a <= 9223372036854775807L) {
                    System.out.println("* long");
                }
                if (a == 00){
                    System.exit(0);
                }
            } catch (Exception z) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }


}