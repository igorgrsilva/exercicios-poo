package br.exercicio2.escola;

public class Exercicio2 {
    public static void main(String[] arg) {
        Aluno aluno1 = new Aluno();

        aluno1.setNome("João");
        aluno1.setMatricula("1234");
        aluno1.setNotaFinal(-10);

        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getMatricula());
        System.out.println(aluno1.getNotaFinal());
    }
}
