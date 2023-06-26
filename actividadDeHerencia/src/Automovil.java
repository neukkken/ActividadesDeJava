public class Automovil extends Vehiculo{
    public Automovil(String marca, String modelo, double peso) {
        super(marca, modelo, peso);
    }

    public void roturaDeMotor(){

        System.out.println("El automovil se apaga repentinamente y no vuelve a arrancar el motor");

    }

}
