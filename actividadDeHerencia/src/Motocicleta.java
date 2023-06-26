public class Motocicleta extends Vehiculo{
    public Motocicleta(String marca, String modelo, double peso) {
        super(marca, modelo, peso);
    }


    public void fallaFrenos(){

        System.out.println("Intentas frenar pero la moto no responde");

    }

}
