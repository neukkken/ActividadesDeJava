public class Rectangulo extends Figura{

    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    public void perimetro(){

        double perimetro = (base*2)+(altura*2);
        System.out.println("El perimetro del rectangulo es de: "+perimetro);

    }
}
