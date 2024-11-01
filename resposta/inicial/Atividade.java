
public class Atividade {
    private String titulo;
    private String horaInicio;
    private int duracao;
    private Palestrante palestrante;

    public Atividade(String titulo, String horaInicio, int duracao, Palestrante palestrante) {
        this.titulo = titulo;
        this.horaInicio = horaInicio;
        this.duracao = duracao;
        this.palestrante = palestrante;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public int getDuracao() {
        return duracao;
    }

    public Palestrante getPalestrante() {
        return palestrante;
    }
}
