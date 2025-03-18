package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.Aluno;

public class ObterAluno {

	public static Aluno obterAluno(Scanner scanner) {

		String nome = obterString(scanner);
		Double nota = obterDouble(scanner);
		return new Aluno(nome, nota);
	}

	private static String obterString(Scanner scanner) {
		String str = null;
		boolean inputValido = false;
		while (!inputValido) {
			try {
				System.out.print("Digite o nome: ");
				scanner.nextLine();
				str = scanner.nextLine();
				testarString(str);
				inputValido = true;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		return str;
	}
	
	private static void testarString(String str) {
		if (str.isBlank()) {
			throw new IllegalArgumentException("\nEsse campo não pode ficar em branco.");
		}
	}
		
	private static Double obterDouble(Scanner scanner) {
		Double valor = 0.0;
		boolean inputValido = false;
		while (!inputValido) {
			try {
				System.out.print("Digite a nota: ");
				valor = scanner.nextDouble();
				testarDouble(valor);
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
	
	private static void testarDouble(Double valor) {
		if (valor < 0.0 || valor > 10.0) {
			throw new IllegalArgumentException("\nValor inválido. Tente novamente");
		}
	}

}
