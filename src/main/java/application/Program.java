package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.Turma;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bem vindo ao sistema Bubble Grades!!");
		int tamanhoTurma = obterInt(scanner);
		Turma turma = new Turma(tamanhoTurma);
		turma.adicionarAlunosAturma(scanner);
		turma.organizarAlunosPelaMaiorNota();
		turma.listarTodosAluno();
		System.out.println("\nPrograma encerrado. Volte sempre");
		
		scanner.close();

	}
	
	private static int obterInt(Scanner scanner) {
		int valor = 0;
		boolean inputValido = false;
		while (!inputValido) {
			try {
				System.out.print("\nDigite o número de alunos que a sua turma vai ter: ");
				valor = scanner.nextInt();
				testarInt(valor);
				inputValido = true;
			} catch (InputMismatchException e) {
				System.out.println("\nInput inválido. Tente novamente.");
				scanner.next();
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		return valor;
	}
	
	private static void testarInt(int valor) {
		if (valor < 0 || valor > 15) {
			throw new IllegalArgumentException("\nEsse tamanho de turma não é permitido. Tente novamente.");
		}
	}

}
