import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String nome, nomeUp;
        int tamanho;

        System.out.println(" Digite seu nome: ");
        nome = sc.nextLine();

        tamanho = nome.length();
        System.out.println("Tamanho: " + tamanho);

        nomeUp = nome.toUpperCase();
        System.out.println("Nome: " + nomeUp);

    
         }
}
