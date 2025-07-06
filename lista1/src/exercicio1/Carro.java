package exercicio1;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void exibirDados() {
        System.out.println("Marca do carro: " + this.marca +
                ", Modelo do carro: " + this.modelo +
                ", Ano do carro: " + this.ano);
    }
}
