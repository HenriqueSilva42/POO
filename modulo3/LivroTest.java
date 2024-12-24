import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

public class LivroTest {

    @Test
    public void testLivroDisponivel() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia", true);
        
        assertTrue(livro.isDisponivel(), "O livro deve estar disponível inicialmente.");
    }

    @Test
    public void testLivroEmprestado() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia", true);
        
        livro.emprestar();
        assertFalse(livro.isDisponivel(), "O livro deve estar indisponível após empréstimo.");
    }

    @Test
    public void testLivroDevolvido() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia", true);
        
        livro.emprestar();
        livro.devolver();
        assertTrue(livro.isDisponivel(), "O livro deve estar disponível após devolução.");
    }
}
