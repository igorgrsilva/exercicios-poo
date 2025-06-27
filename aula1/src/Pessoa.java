public class Pessoa {

    public String nome;
    public int idade;

    Pessoa(String novoNome, int novaIdade) {
        this.nome = novoNome;
        this.idade = novaIdade;
    }

    void falar() {
        System.out.println("Olá, meu nome é "+this.nome+" e tenho "+this.idade+" anos.");
    }

}
