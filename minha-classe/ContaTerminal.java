import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
        String agencia, nomeCliente;
        float saldo;
		
        System.out.println("Por favor Digite o número da conta:  ");
		numero = sc.nextInt();

        System.out.println("Digite o número da agência: ");
		agencia = sc.nextString();

        System.out.println("Digite seu nome: ");
        nomeCliente = sc.nextString();

        System.out.println("Qual o saldo: ");
        saldo = sc.nextFloat();


		System.out.println("PROD = " +  PROD   );
}
