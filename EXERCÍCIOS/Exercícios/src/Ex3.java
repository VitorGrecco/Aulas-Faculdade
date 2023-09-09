import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        
        int num1, num2;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(" Digite um numero: ");
            num1 = sc.nextInt();

            System.out.println(" Digite outro numero:");
            num2 = sc.nextInt();
        }

        if (num1 > num2){
          System.out.println(" numero 1 é maior que o numero 2.");
        }else{
            System.out.println(" numero 2 maior que o numero 1.");
        }
    }
}
