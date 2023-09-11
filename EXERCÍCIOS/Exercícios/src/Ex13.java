import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);

        int n1, n2, n3;

        System.out.println("Digite três numeros:");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
         
         sc.close();
         
        if (n1 == n2 && n1 == n3 && n2 == n3){
            System.out.println("Finalizar");
        }else if (n1 >= n2 && n1 >= n3){
            System.out.println(" n1 é o maior.");
        } else if (n2 >= n1 && n2>= n3){
            System.out.println(" n2 é o maior.");
        } else {
            System.out.println(" n3 é o maior.");
        }




    }
}
