public class Suma extends Calculadora{


    public Suma(double op1, double op2) {
        super(op1, op2);
    }

    public void Sum (){
        double res=op1+op2;
        System.out.println("Resultado: "+res);

    }

}
