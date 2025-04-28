package calculadora;

import java.util.Scanner;

public class CalculadoraDeMedias {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] alunos =  {"Camila", "Lucas", "Bruna", "Pedro"};
		
		int media = calculadoraMediaDaTurma(alunos, scan);
		
		System.out.printf("Média da turma %d", media);
	}
	
	public static int calculadoraMediaDaTurma(String[] alunos, Scanner scanner) {
		int soma = 0;
		for(String aluno : alunos) {
			System.out.printf("Nota do aluno %s: ", aluno);
			int nota = scanner.nextInt();
			soma += nota;	
		}
		
		return soma / alunos.length;
	}

}
