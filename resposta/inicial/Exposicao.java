
public class Exposicao extends Evento {
    private double custoEspaco;

    public Exposicao(String nome, String data, String local, double custoEspaco) {
        super(nome, data, local);
        this.custoEspaco = custoEspaco;
    }

    @Override
    public double calcularCusto() {
        return custoEspaco;
    }
}
