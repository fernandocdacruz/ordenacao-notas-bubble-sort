package model;

import java.util.Scanner;

import utils.ObterAluno;

public class Turma {
	
	private Aluno[] alunos;
	
	public Turma(int tamanho) {
        this.alunos = new Aluno[tamanho];
    }	
	
	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}



	public void adicionarAlunosAturma(Scanner scanner) {
		System.out.println("\nCadastro dos alunos e suas respectivas notas:");
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("\nAluno #" + (i+1) + ":");
			alunos[i] = ObterAluno.obterAluno(scanner);
		}
	}
	
	public void organizarAlunosPelaMaiorNota() {
	    int n = alunos.length;
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - i - 1; j++) {
	            if (alunos[j].getNota() < alunos[j + 1].getNota()) {
	                Aluno temp = alunos[j];
	                alunos[j] = alunos[j + 1];
	                alunos[j + 1] = temp;
	            }
	        }
	    }
	}
	
	public void listarTodosAluno() {
		System.out.println("\nSegue lista de alunos:\n");
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("# " + (i+1) + ": " + alunos[i]);
		}
	}
	
}
