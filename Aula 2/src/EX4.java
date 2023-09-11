import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int num;

        System.out.println(" Digite um numero:");
        num = sc.nextInt();

        if (num >=1 && num <=7){
            
         switch(num){
            case 1:
            System.out.println(" domingo ");
            break;

            case 2:
            System.out.println(" segunda ");
            break;

            case 3:
            System.out.println(" terça");
            break;

            case 4:
            System.out.println(" quarta ");
            break;

            case 5:
            System.out.println(" quinta ");
            break;

            case 6:
            System.out.println(" sexta ");
            break;

            case 7:
            System.out.println(" sab ");
            break;
            

         }
         sc.close();

        }
    }
}
