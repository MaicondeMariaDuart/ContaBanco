import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

      
        Scanner scanner= new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, Digite o nome do cliente? ");
        String nome = scanner.next();

        System.out.println("Por favor, Digite o numero da Agencia? ");
        String agencia = scanner.next();

        System.out.println("Por favor, Digite o numero da conta? ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, Digite seu saldo? ");
        double saldo = scanner.nextDouble();

        
        System.out.println("Olá Sr(a) : " +nome + "  , Obrigado, por criar uma conta neste Banco!");
        System.out.println("Agencia nº : "+agencia);
        System.out.println("Conta de nº : "+numero);
        System.out.println("Saldo de : "+saldo);
    }

    
    
}