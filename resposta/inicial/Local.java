
public class Local {
    private String nome;
    private String endereco;
    private int capacidade;

    public Local(String nome, String endereco, int capacidade) {
        this.nome = nome;
        this.endereco = endereco;
        this.capacidade = capacidade;
    }

    public boolean verificarCapacidade(int numeroDePessoas) {
        return numeroDePessoas <= capacidade;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getCapacidade() {
        return capacidade;
    }
}
