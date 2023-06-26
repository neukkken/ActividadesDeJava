public class Español extends Clases{

    public Español(double primeraNota, double segundaNota, double terceraNota, double cuartaNota, double quintaNota) {
        super(primeraNota, segundaNota, terceraNota, cuartaNota, quintaNota);
    }

    public void promedio(){

        double prom = (primeraNota+segundaNota+terceraNota+cuartaNota+quintaNota)/5;
        if (prom<3.8){
            System.out.println("Usted reprobo Español con: "+prom);

        }else{

            System.out.println("Aprobo Español con un promedio de: "+prom);
        }

    }

}
