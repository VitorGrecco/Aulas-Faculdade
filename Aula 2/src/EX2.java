import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int num1, num2, result, opera;

        System.out.println(" Digite um numero: ");
        num1 = sc.nextInt();

        System.out.println(" Digite outro numero: ");
        num2 = sc.nextInt();

        System.out.println(" Digite: 1-Soma, 2-subt, 3-Div, 4-Mult");
        opera = sc.nextInt();

        switch(opera){
            case 1: 
            result = num1 + num2;
            System.out.println(" Resultado " + result);
            break;

             case 2: 
            result = num1 - num2;
            System.out.println(" Resultado " + result);
            break;

             case 3: 
            result = num1 / num2;
            System.out.println(" Resultado " + result);
            break;

             case 4: 
            result = num1 * num2;
            System.out.println(" Resultado " + result);
            break;

            default:
            System.out.println(" opração invalida.");
            break;

        }

        // if (opera == 1){
            
        //     System.out.println(num1 + num2);

        // } else if ( opera == 2){
        //     System.out.println(num1 - num2);
        // } else if ( opera == 3){
        //     System.out.println(num1 * num2);
        // } else if ( opera == 4){
        //     System.out.println(num1 / num2);
        // }
    }
}


