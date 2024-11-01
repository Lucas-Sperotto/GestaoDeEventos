
import java.util.ArrayList;
import java.util.List;

public class Palestrante extends Pessoa {
    private String especialidade;
    private List<Atividade> atividades;

    public Palestrante(String nome, String email, String especialidade) {
        super(nome, email);
        this.especialidade = especialidade;
        this.atividades = new ArrayList<>();
    }

    public void participarAtividade(Atividade atividade) {
        atividades.add(atividade);
    }

    @Override
    public String obterDetalhes() {
        return "Palestrante: " + nome + ", Especialidade: " + especialidade;
    }
}
