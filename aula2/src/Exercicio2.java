public class Exercicio2 {

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(10);

        double areaCirculo1 = circulo1.area();

        System.out.println(areaCirculo1);
        System.out.println(Circulo.pi);
        System.out.println(circulo1.pi);

        Circulo circulo2 = new Circulo(37);
        double areaCirculo2 = circulo2.area();

        System.out.println(areaCirculo2);
        System.out.println(Circulo.pi);
        System.out.println(circulo2.pi);
    }

}

class Circulo {

    static final float pi = 3.14f;
    float raio;

    Circulo(float valorDoRaio) {
        this.raio = valorDoRaio;
    }

    double area() {
        double area = pi * raio * raio;
        return area;
    }

}