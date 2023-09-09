import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        int num1, num2;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(" Escreva 2 números: ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
        }

        if (num1 > num2){
            System.out.println(num1 + " é o maior.");
        }else if ( num1 == num2){
            System.out.println(num1 + " e " + num2 + " são iguais.");
        }else{
            System.out.println(num2 + " é o maior.");
        }
    
    


    }
}
