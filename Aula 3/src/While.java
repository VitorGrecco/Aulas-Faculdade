import java.util.Scanner;

public class While {
    
    public static void main(String[] args) {
        
        int x;
        String resp = "S";

        Scanner sc = new Scanner(System.in);

        while("S".equals(resp))
         {

        System.out.println(" Digite um numero: ");
        x = sc.nextInt();

        for(int i=0; i<=10; i++){

            System.out.println(i + " x " + x + " = " + (i * x));
         
        }

        System.out.println(" Deseja fazer outro calculo? S = sim e N = não");
        resp = sc.next();
        resp = resp.toUpperCase();

         }


      
        


        


    }
}
