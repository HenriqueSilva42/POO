import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArtigoTest {

    @Test
    public void testArtigoConstrucao() {
        Autor autor = new Autor("Alan Turing", 40, "Tradicional");
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "Tecnologia", true);
        
        assertEquals("Entendendo Compiladores", artigo.getTitulo(), "O título do artigo deve ser 'Entendendo Compiladores'.");
        assertEquals(autor, artigo.getAutor(), "O autor do artigo deve ser Alan Turing.");
        assertEquals("Tecnologia", artigo.getGenero(), "O gênero do artigo deve ser 'Tecnologia'.");
        assertTrue(artigo.isPublicado(), "O artigo deve estar publicado.");
    }

    @Test
    public void testArtigoNaoPublicado() {
        Autor autor = new Autor("Grace Hopper", 45, "Tradicional");
        Artigo artigo = new Artigo("Computação para Todos", autor, "Tecnologia", false);
        
        assertFalse(artigo.isPublicado(), "O artigo não deve estar publicado.");
    }

    @Test
    public void testArtigoAlterarPublicado() {
        Autor autor = new Autor("Tim Berners-Lee", 50, "Tradicional");
        Artigo artigo = new Artigo("A Web e o Futuro", autor, "Tecnologia", true);
        
        artigo.setPublicado(false);
        assertFalse(artigo.isPublicado(), "O artigo deve estar marcado como não publicado.");
    }
}
