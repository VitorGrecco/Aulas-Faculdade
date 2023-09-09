import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) 
    {
      float num1;
      int num2;
    

      try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Digite Numero 1: ");
        num1 = sc.nextFloat();
        
        System.out.print("Digite Numero 2: ");
        num2 = sc.nextInt();
      }

      if (num1 > num2 ) {
       System.out.println(" O numero 1 é maior que o numero 2 ");
    }
  
    }
}
