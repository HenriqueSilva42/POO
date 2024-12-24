import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa {
    private List<Emprestimo> emprestimos;

    public Usuario(String nome, int idade) {
        super(nome, idade);
        this.emprestimos = new ArrayList<>();
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
}
