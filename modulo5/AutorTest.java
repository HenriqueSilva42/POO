import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioDecoratorTest {

    @Test
    public void testPublicacaoLivro() {
        // Criando um autor com a estratégia de publicação de livros
        Autor autor = new Autor("Jessica Felix", 35, "Usuario");
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());

        // Chamando o método de publicação
        autor.publicar(); // Espera-se que a publicação de um livro seja chamada
    }

    @Test
    public void testPublicacaoArtigo() {
        // Criando um autor com a estratégia de publicação de artigos
        Autor autor = new Autor("Alan Turing", 45, "Tradicional");
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo());

        // Chamando o método de publicação
        autor.publicar(); // Espera-se que a publicação de um artigo seja chamada
    }

    @Test
    public void testPublicacaoSemEstratégia() {
        // Criando um autor sem definir estratégia de publicação
        Autor autor = new Autor("Grace Hopper", 50, "Tradicional");
        
        // Chamando o método de publicação sem definir estratégia
        autor.publicar(); // Espera-se que o sistema informe que não há estratégia definida
    }
}
