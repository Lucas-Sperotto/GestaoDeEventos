
import java.util.ArrayList;
import java.util.List;

public class Participante extends Pessoa {
    private List<Evento> eventosInscritos;

    public Participante(String nome, String email) {
        super(nome, email);
        this.eventosInscritos = new ArrayList<>();
    }

    public void inscreverEvento(Evento evento) {
        eventosInscritos.add(evento);
    }

    @Override
    public String obterDetalhes() {
        return "Participante: " + nome + ", Inscrições: " + eventosInscritos.size();
    }
}
