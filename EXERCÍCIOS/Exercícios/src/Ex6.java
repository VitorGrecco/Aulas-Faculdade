import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        
        double saldo, saque;

        try (Scanner sc = new Scanner(System.in)) {
            saldo = 1000;

            System.out.println(" Digite o valor que deseja sacar:");
            saque = sc.nextDouble();
        }

        if (saque > saldo){
            System.out.println(" Não há saldo suficiente.");
        }else{
            saldo -= saque;
            System.out.println(" saldo restante: " + saldo);
    
        }

    }
}
