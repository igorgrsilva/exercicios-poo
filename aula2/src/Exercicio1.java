public class Exercicio1 {

    public static void main(String[] args) {

        System.out.println(Livro.totalDeLivros);

        Livro livro1 = new Livro("Metamorfose");

        System.out.println(Livro.totalDeLivros);

        Livro livro2 = new Livro("1964");

        System.out.println(Livro.totalDeLivros);
    }

}

class Livro {
    String titulo;
    static int totalDeLivros = 0;

    Livro(String tituloDoLivro) {
        this.titulo = tituloDoLivro;
        totalDeLivros++;
    }

}
