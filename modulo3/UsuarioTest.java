import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    public void testAdicionarEmprestimo() {
        Usuario usuario = new Usuario("Gabriel", 21);
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);
        
        usuario.adicionarEmprestimo(emprestimo);
        
        assertEquals(1, usuario.getEmprestimos().size(), "O usuário deve ter 1 empréstimo.");
    }

    @Test
    public void testUsuarioNome() {
        Usuario usuario = new Usuario("Gabriel", 21);
        
        assertEquals("Gabriel", usuario.getNome(), "O nome do usuário deve ser 'Gabriel'.");
    }

    @Test
    public void testUsuarioIdade() {
        Usuario usuario = new Usuario("Gabriel", 21);
        usuario.setIdade(22);
        
        assertEquals(22, usuario.getIdade(), "A idade do usuário deve ser 22.");
    }
}
