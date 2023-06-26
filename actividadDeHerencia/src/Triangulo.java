public class Triangulo extends Figura{


    double lado1;
    double lado2;
    double lado3;


    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        super(base, altura);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public void perimetro(){

        double perimetro = (lado1+lado2+lado3);

        System.out.println("El perimetro del triangulo es de: "+perimetro);

    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
}
