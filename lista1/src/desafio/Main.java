package desafio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o titulo: ");
        String titulo1 = scanner.nextLine();

        System.out.println("Digite o diretor: ");
        String diretor1 = scanner.nextLine();

        System.out.println("Digite o genero: ");
        String genero1 = scanner.next();

        System.out.println("Digite o ano: ");
        int ano1 = scanner.nextInt();

        Filme filme1 = new Filme();
        filme1.setAno(ano1);
        filme1.setDiretor(diretor1);
        filme1.setTitulo(titulo1);
        filme1.setGenero(genero1);

        System.out.println("Titulo: " + filme1.getTitulo() +
                ", Diretor: " + filme1.getDiretor() +
                ", Ano: " + filme1.getAno() +
                ", Genero: " + filme1.getGenero());



        }
}
