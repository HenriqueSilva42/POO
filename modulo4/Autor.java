public class Autor extends Pessoa {
    private List<Livro> livros;
    private String tipoAutor;  // Indica se o autor é um Usuário ou um Autor tradicional

    public Autor(String nome, int idade, String tipoAutor) {
        super(nome, idade);
        this.livros = new ArrayList<>();
        this.tipoAutor = tipoAutor;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public String getTipoAutor() {
        return tipoAutor;
    }

    public void setTipoAutor(String tipoAutor) {
        this.tipoAutor = tipoAutor;
    }
}
