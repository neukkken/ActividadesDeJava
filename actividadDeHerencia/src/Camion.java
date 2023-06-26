public class Camion extends Vehiculo{
    public Camion(String marca, String modelo, double peso) {
        super(marca, modelo, peso);
    }


    public void engancharCarga(){

        System.out.println("Enganchas el remolque al camion al darle al boton de acoplar");

    }
}
