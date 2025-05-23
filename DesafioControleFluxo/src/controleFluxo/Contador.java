package controleFluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		}catch (ParametrosInvalidosException e) {
			System.err.println("O segundo número precisa ser maior que o primeiro");
			e.printStackTrace();
		}
	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm < parametroDois) {
			int valorContador = parametroDois - parametroUm;
			
			for(int i = 1; i <= valorContador; i++) {
				System.out.println("Imprimindo o número: " + i);
			}
		}else {
			throw new ParametrosInvalidosException();
		}
		
	}
}
