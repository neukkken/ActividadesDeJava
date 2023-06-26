public class Figura {

    protected double base;
    protected double altura;


    public Figura(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void area(){

        double area = 0.5*base*altura;

        System.out.println("El area de la figura es: "+area);

    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}