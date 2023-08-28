import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem vindo!");

        System.out.println("Por favor, digite o número da sua Conta:");
        int numero = sc.nextInt();
        System.out.println("Por favor, digite o número da sua Agência: ");
        String agencia = sc.next();
        System.out.println("Por favor, digite o seu Nome:");
        String nomeCliente = sc.next();
        double saldo = 237.48;

        System.out.println("Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + " conta " + numero + " e seu saldo " + saldo +  " já está disponível para saque");

        sc.close();

    }
}
