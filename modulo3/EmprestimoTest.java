import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

public class EmprestimoTest {

    @Test
    public void testEmprestimoDados() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);
        
        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);
        
        assertEquals(livro, emprestimo.getLivro(), "O livro do empréstimo deve ser 'Java Basics'.");
        assertEquals(usuario, emprestimo.getUsuario(), "O usuário do empréstimo deve ser 'Gabriel'.");
        assertEquals(dataRetirada, emprestimo.getDataRetirada(), "A data de retirada deve ser a data definida.");
        assertEquals(dataDevolucao, emprestimo.getDataDevolucao(), "A data de devolução deve ser a data definida.");
    }
    
    @Test
    public void testEmprestimoLivroEmprestado() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);
        
        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);
        
        livro.emprestar();
        assertFalse(livro.isDisponivel(), "O livro deve estar indisponível após ser emprestado.");
    }
}
