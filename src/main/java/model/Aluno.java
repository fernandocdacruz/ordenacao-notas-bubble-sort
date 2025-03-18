package model;

public class Aluno {
	
	private String nome;
	private Double nota;
	
	public Aluno() {
	}
	
	public Aluno(String nome, Double nota) {
		this.nome = nome;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Aluno: " + nome + " | Nota: " + String.format("%.2f", nota) + ".";
	}
	
}
