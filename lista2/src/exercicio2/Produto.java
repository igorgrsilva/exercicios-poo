package exercicio2;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        if(novoNome == "") {
            System.out.println("Nome do produto não pode ser vazio.");
            return;
        }
        this.nome = novoNome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double novoPreco) {
        if(novoPreco < 0) {
            System.out.println("Preço informado deve ser maior do que zero.");
            return;
        }
        this.preco = novoPreco;
    }

    public int getQuantidadeEstoque() {
        return this.quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int novaQuantidade) {
        if(novaQuantidade < 0) {
            System.out.println("Quantidade não deve ser menor que zero.");
            return;
        }

        this.quantidadeEstoque = novaQuantidade;
    }
}
