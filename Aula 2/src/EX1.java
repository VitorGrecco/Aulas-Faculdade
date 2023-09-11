import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        
        int num1;

        Scanner sc = new Scanner(System.in);

        System.out.println(" Digite um numero:");
        num1 = sc.nextInt();

        if (num1 >0){
            System.out.println("Positivo");
        } else if (num1 == 0){
            System.out.println("neutro");
        } else
            System.out.println("negativo");
            
            sc.close();
    }
    
}
