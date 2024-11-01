
public class Workshop extends Evento {
    private double custoMaterial;

    public Workshop(String nome, String data, String local, double custoMaterial) {
        super(nome, data, local);
        this.custoMaterial = custoMaterial;
    }

    @Override
    public double calcularCusto() {
        return custoMaterial;
    }
}
