
public class Conferencia extends Evento {
    private int numeroDePalestrantes;
    private double custoPorPalestrante;

    public Conferencia(String nome, String data, String local, int numeroDePalestrantes, double custoPorPalestrante) {
        super(nome, data, local);
        this.numeroDePalestrantes = numeroDePalestrantes;
        this.custoPorPalestrante = custoPorPalestrante;
    }

    @Override
    public double calcularCusto() {
        return numeroDePalestrantes * custoPorPalestrante;
    }
}
