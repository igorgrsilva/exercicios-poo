package br.exercicio1.pessoa;

public class Pessoa {
    public String nome;
    private int idade;
    protected String cidade;
    public String pais;

    public Pessoa(String nome, int idade, String cidade, String pais) {
        this.cidade = cidade;
        this.pais = pais;
        this.nome = nome;
        this.idade = idade;
    }

    void falar() {
        System.out.println("Oi! Eu tenho " + this.idade + "anos.");
    }

    private void pensar() {
        System.out.println("Pensando...");
    }

    protected void andar() {
        System.out.println("Andando...");
    }

    public void dormir() {
        System.out.println("Dormindo...");
    }
}