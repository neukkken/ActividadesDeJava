public class Multiplicacion extends Calculadora{

    public Multiplicacion(double op1, double op2) {
        super(op1, op2);
    }

    public void Mul (){
        double res=op1*op2;
        System.out.println("Resultado: "+res);

    }
}
