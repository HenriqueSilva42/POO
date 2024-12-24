public class Autor extends Pessoa {
    private List<Livro> livros;
    private String tipoAutor;
    private EstrategiaPublicacao estrategiaPublicacao;

    public Autor(String nome, int idade, String tipoAutor) {
        super(nome, idade);
        this.livros = new ArrayList<>();
        this.tipoAutor = tipoAutor;
    }

    // Método para setar a estratégia de publicação
    public void setEstrategiaPublicacao(EstrategiaPublicacao estrategia) {
        this.estrategiaPublicacao = estrategia;
    }

    // Método para realizar a publicação
    public void publicar() {
        if (estrategiaPublicacao != null) {
            estrategiaPublicacao.publicar();
        } else {
            System.out.println("Nenhuma estratégia de publicação definida.");
        }
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
