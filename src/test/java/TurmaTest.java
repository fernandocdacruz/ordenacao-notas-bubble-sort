import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import model.Aluno;
import model.Turma;

public class TurmaTest {

	@Test
    public void testOrganizarAlunosPelaMaiorNota() {
        Turma turma = new Turma(3);
        Aluno aluno1 = new Aluno("Carlos", 7.5);
        Aluno aluno2 = new Aluno("Ana", 9.0);
        Aluno aluno3 = new Aluno("Bruno", 8.0);

        turma.getAlunos()[0] = aluno1;
        turma.getAlunos()[1] = aluno2;
        turma.getAlunos()[2] = aluno3;

        turma.organizarAlunosPelaMaiorNota();

        assertEquals(aluno2, turma.getAlunos()[0]); 
        assertEquals(aluno3, turma.getAlunos()[1]); 
        assertEquals(aluno1, turma.getAlunos()[2]); 
    }
	
}
