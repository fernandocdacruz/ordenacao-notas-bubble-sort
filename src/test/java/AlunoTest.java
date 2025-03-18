import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import model.Aluno;

public class AlunoTest {

	@Test
    public void testConstrutorEGetters() {
        String nome = "Alice";
        Double nota = 9.5;

        Aluno aluno = new Aluno(nome, nota);

        assertEquals(nome, aluno.getNome());
        assertEquals(nota, aluno.getNota());
    }
	
	@Test
    public void testToString() {
        String nome = "Bob";
        Double nota = 7.85;

        Aluno aluno = new Aluno(nome, nota);

        String expected = "Aluno: Bob | Nota: 7.85.";
        String actual = aluno.toString();

        assertEquals(expected, actual);
    }
	
}
