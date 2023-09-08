import java.util.Scanner;
import java.util.Locale;


public class ContaTerminal {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Por favor Digite o número da conta:  ");
		int numero = sc.nextInt();

        System.out.println("Digite o número da agência: ");
		String agencia = sc.next();

        System.out.println("Digite seu nome: ");
        String nomeCliente = sc.next();

        System.out.println("Qual o saldo: ");
        float saldo = sc.nextFloat();
        
        System.out.println();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");
        System.out.println();

    }
}
