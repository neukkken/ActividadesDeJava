public class Matematicas extends Clases{

    public Matematicas(double primeraNota, double segundaNota, double terceraNota, double cuartaNota, double quintaNota) {
        super(primeraNota, segundaNota, terceraNota, cuartaNota, quintaNota);
    }

    public void promedio(){

        double prom = (primeraNota+segundaNota+terceraNota+cuartaNota+quintaNota)/5;
        if (prom<3.8){
            System.out.println("Usted reprobo Matematicas con: "+prom);

        }else{

            System.out.println("Aprobo Matematicas con un promedio de: "+prom);
        }

    }

}
