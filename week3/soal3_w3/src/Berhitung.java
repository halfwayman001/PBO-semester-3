import java.util.Scanner;

public class Berhitung {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        char operator = sc.next().charAt(0);
        int b = sc.nextInt();
        
        int pertambahan  = a+b;
        int pengurangan  = a-b;
        int perkalian  = a*b;
        int pembagian  = a/b;
        int modulo = a%b;
        
        switch(operator){
            case '+':{
                System.out.println(pertambahan);
                break;
            }
            case '-':{
                System.out.println(pengurangan);
                break;
            } 
            case '*':{
                System.out.println(perkalian);
                break;
            }    
            case '/':{
                System.out.println(pembagian);
                break;
            }
            case '%':{
                System.out.println(modulo);
                break;
            }            
            default:{
                System.out.println("Operasi Matematika yang Anda Inginkan: ");
                break;
            }
        }
        
    }
    
}
