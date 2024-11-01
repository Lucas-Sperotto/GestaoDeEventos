
import java.util.ArrayList;
import java.util.List;

public abstract class Evento {
    protected String nome;
    protected String data;
    protected String local;
    protected String status;
    protected List<Atividade> atividades;

    public Evento(String nome, String data, String local) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.status = "Aberto para inscrições"; // Status inicial
        this.atividades = new ArrayList<>();
    }

    public abstract double calcularCusto();

    public void adicionarAtividade(Atividade atividade) {
        atividades.add(atividade);
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public String getLocal() {
        return local;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }
}
