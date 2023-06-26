public class Ingles extends Clases{

    public Ingles(double primeraNota, double segundaNota, double terceraNota, double cuartaNota, double quintaNota) {
        super(primeraNota, segundaNota, terceraNota, cuartaNota, quintaNota);
    }

    public void promedio(){

        double prom = (primeraNota+segundaNota+terceraNota+cuartaNota+quintaNota)/5;
        if (prom<3.8){
            System.out.println("Usted reprobo Ingles con: "+prom);

        }else{

            System.out.println("Aprobo Ingles con un promedio de: "+prom);
        }

    }
}
