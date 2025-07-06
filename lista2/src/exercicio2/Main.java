package exercicio2;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();

        produto1.setNome("Computador");
        produto1.setPreco(1000);
        produto1.setQuantidadeEstoque(3);

        System.out.println("Nome: " + produto1.getNome()
                + ", Preço: " + produto1.getPreco()
                + ", Quantidade: " + produto1.getQuantidadeEstoque());
    }
}
