public class Resta extends Calculadora{

    public Resta(double op1, double op2) {
        super(op1, op2);
    }

    public void Res (){
        double res=op1-op2;
        System.out.println("Resultado: "+res);

    }

}
