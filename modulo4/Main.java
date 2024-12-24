import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando o autor com tipo "Usuario"
        Autor autor = new Autor("Jessica Felix", 35, "Usuario");
        
        // Criando o livro
        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia");

        // Adicionando o livro ao autor
        autor.adicionarLivro(livro);
        
        // Criando o usuário
        Usuario usuario = new Usuario("Lucas Rafael", 25);
        
        // Criando o empréstimo
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);

        // Adicionando o empréstimo ao usuário
        usuario.adicionarEmprestimo(emprestimo);
        
        // Emprestando o livro
        livro.emprestar();

        // Criando o artigo
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "Tecnologia", true);

        // Imprimindo as informações
        System.out.println("O livro não está disponível");
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome() + " (" + livro.getAutor().getTipoAutor() + ")");
        System.out.println("Genero: " + livro.getGenero());
        System.out.println("Usuario: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolucao: " + emprestimo.getDataDevolucao());

        // Imprimindo as informações do artigo
        System.out.println("Artigo: " + artigo.getTitulo());
        System.out.println("Autor: " + artigo.getAutor().getNome());
        System.out.println("Genero: " + artigo.getGenero());
        System.out.println("Publicado: " + (artigo.isPublicado() ? "Sim" : "Não"));
    }
}
