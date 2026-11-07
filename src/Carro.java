
public class Carro {

    // Atributos
    private String nome;
    private double preco;

    // Construtor
    public Carro(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    // Representação textual do objeto
    @Override
    public String toString() {
        return "Carro: " + nome + " | Preço: R$ " + preco;
    }
}
