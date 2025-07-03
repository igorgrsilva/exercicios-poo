package br.exercicio2.escola;

public class Aluno {

    private String nome;
    private String matricula;
    private double notaFinal;

    public String getNome() {
        return this.nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public double getNotaFinal() {
        return this.notaFinal;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setMatricula(String novaMatricula) {
        this.matricula = novaMatricula;
    }

    public void setNotaFinal(double nota) {
        if(nota>= 0 && nota <= 10) {
            this.notaFinal = nota;
        } else {
            System.out.println("Valor de nota inválido.");
        }
    }
}
