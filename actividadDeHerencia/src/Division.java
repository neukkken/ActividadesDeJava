public class Division extends Calculadora{
    public Division(double op1, double op2) {
        super(op1, op2);
    }

    public void Div (){
        if (op2!=0){
            double res=op1+op2;
            System.out.println("Resultado: "+res);
        }else{
            System.out.println("No se puede dividir entre 0");

        }

    }

}
