import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
				
		System.out.println("Qual é o seu nome");
		String nomeCliente = scanner.next();
		
		System.out.println("Digite o número da conta");
		int numeroConta = scanner.nextInt();
		
		System.out.println("Digite o número da agencia");
		String agencia = scanner.next();
		
		System.out.println("Digite o saldo da conta");
		Double saldoConta = scanner.nextDouble();
		
		scanner.close();
		
		System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco ,"
				+ "sua agencia é " + agencia + ", conta " + numeroConta + " e o seu saldo " 
				+ saldoConta + " já está disponível para saque.");
	}

}
