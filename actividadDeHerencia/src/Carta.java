public class Carta {

    protected String atributo;
    protected double ataque;
    protected double defensa;

    public Carta(String atributo, double ataque, double defensa) {
        this.atributo = atributo;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public double getDefensa() {
        return defensa;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }
}
