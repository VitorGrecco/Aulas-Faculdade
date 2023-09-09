import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        
        double valor;
        int pagamento;

        try (Scanner sc = new Scanner(System.in)) {
            valor = 100;
            System.out.println(" Valor do produto é de: " + valor);

            System.out.println("Digite um numero de 0 a 2:");
            pagamento = sc.nextInt();
        }
        
        if (pagamento == 0 || pagamento <= 2){

            switch(pagamento){

            case 0:
                System.out.println(" compra à vista.");
                valor *= 10/100;
                break;

            case 1:
                System.out.println(" parcelado no cartão.");
                System.out.println(" Será em duas vezes!" ); 
                valor /= 2; 
                break;

            case 2:
                System.out.println(" creditário.");
                break;

            

            }
            
            
        }
    }

    }       
        
            


