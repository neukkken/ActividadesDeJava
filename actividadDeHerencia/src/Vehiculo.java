public class Vehiculo {

    protected String marca;
    protected String modelo;
    protected double peso;

    public Vehiculo(String marca, String modelo, double peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
    }

    public void acelerar(){

        System.out.println("El vehiculo acelera");

    }

    public void frenar(){

        System.out.println("El vehiculo frena");

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
