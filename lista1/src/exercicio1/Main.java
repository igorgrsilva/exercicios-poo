package exercicio1;

public class Main {

    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", "X6", 2025);

        carro1.exibirDados();

        carro1.setMarca("Fiat");

        carro1.exibirDados();
    }
}
