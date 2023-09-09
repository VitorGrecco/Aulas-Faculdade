import java.util.Scanner;

public class Ex5 {
 
    //Escreva um programa que lê três inteiros a partir do teclado e imprime a soma, a média, o produto, o menor e o maior desses números.
    public static void main(String[]Args)
    {
        int num1, num2, num3, result, result2, result3, maior, menor;

        try (Scanner sc = new Scanner (System.in)) {
            System.out.print(" Digite um numero: ");
            num1 = sc.nextInt();

            System.out.print(" Digite outro numero: ");
            num2 = sc.nextInt();

            System.out.print(" Digite outro numero: ");
            num3 = sc.nextInt();
        }

        result = num1 + num2 + num3;
        result2 = result/3;
        result3 = num1 * num2 * num3;

        System.out.println(" A soma é: " + result); 

        System.out.println(" A média é: " + result2);
         
        System.out.println(" O produto é: " + result3);

        if ( num1 > num2 && num1 > num3 )
        { 
         maior = num1; 
         System.out.println(" O numero maior é:" + maior); }
         
         else if ( num2 > num1 && num2 > num3 )
         {
            maior = num2;
         System.out.println(" O numero maior é:" + maior); }
         
            else
            {
                maior = num3;
                System.out.println(" O numero maior é:" + maior);
            
         }

         if ( num1 < num2 && num1 < num3 )
        { 
         menor = num1; 
         System.out.println(" O numero menor é:" + menor); }
         
         else if ( num2 < num1 && num2 < num3 )
         {
            menor = num2;
         System.out.println(" O numero maior é:" + menor); }
         
            else
            {
                menor = num3;
                System.out.println(" O numero maior é:" + menor);
            }
         
        
        
    }
}
