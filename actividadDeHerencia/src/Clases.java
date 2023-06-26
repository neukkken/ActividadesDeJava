public class Clases {

    protected double primeraNota;
    protected double segundaNota;
    protected double terceraNota;
    protected double cuartaNota;

    protected double quintaNota;


    public Clases(double primeraNota, double segundaNota, double terceraNota, double cuartaNota, double quintaNota) {
        this.primeraNota = primeraNota;
        this.segundaNota = segundaNota;
        this.terceraNota = terceraNota;
        this.cuartaNota = cuartaNota;
        this.quintaNota = quintaNota;
    }

    public double getPrimeraNota() {
        return primeraNota;
    }

    public void setPrimeraNota(double primeraNota) {
        this.primeraNota = primeraNota;
    }

    public double getSegundaNota() {
        return segundaNota;
    }

    public void setSegundaNota(double segundaNota) {
        this.segundaNota = segundaNota;
    }

    public double getTerceraNota() {
        return terceraNota;
    }

    public void setTerceraNota(double terceraNota) {
        this.terceraNota = terceraNota;
    }

    public double getCuartaNota() {
        return cuartaNota;
    }

    public void setCuartaNota(double cuartaNota) {
        this.cuartaNota = cuartaNota;
    }

    public double getQuintaNota() {
        return quintaNota;
    }

    public void setQuintaNota(double quintaNota) {
        this.quintaNota = quintaNota;
    }
}
