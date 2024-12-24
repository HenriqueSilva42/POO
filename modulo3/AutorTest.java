import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    @Test
    public void testAdicionarLivro() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia", true);
        
        autor.adicionarLivro(livro);
        
        assertEquals(1, autor.getLivros().size(), "O autor deve ter 1 livro após adicionar.");
        assertTrue(autor.getLivros().contains(livro), "O livro deve estar na lista de livros do autor.");
    }

    @Test
    public void testAutorNome() {
        Autor autor = new Autor("Jess", "Brasileira");
        
        assertEquals("Jess", autor.getNome(), "O nome do autor deve ser 'Jess'.");
    }

    @Test
    public void testAutorIdade() {
        Autor autor = new Autor("Jess", "Brasileira");
        autor.setIdade(40);
        
        assertEquals(40, autor.getIdade(), "A idade do autor deve ser 40.");
    }
}
