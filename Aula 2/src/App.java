import java.util.Scanner;

public class App {
    public static void main(String[] args) 
    {
        float nota;

        Scanner sc = new Scanner(System.in);

        System.out.println(" Digite a nota:");
        nota = sc.nextFloat();

        if (nota >= 70){
            System.out.println("Aprovado");
        } else if (nota<70 && nota>=40) {
            float notaAI;
            System.out.println("Digite a nota da AI:");
            notaAI = sc.nextFloat();
        if (notaAI + nota >= 70){
           System.out.println(" PASSOU ");
        } else {
            System.out.println(" Não passou");
        }

        }
        sc.close();
    }
}
