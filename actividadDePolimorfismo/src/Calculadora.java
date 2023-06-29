public class Calculadora {

    public int suma (int a, int b){
        return a+b;
    }

    public int suma (int a, int b, int c, int d){
        return a+b+c+d;
    }

    public float suma (float a, float b){
        return a+b;
    }

    public double suma (double a, double b){
        return a+b;
    }

    public int resta (int a, int b){
        return a-b;
    }

    public int resta (int a, int b, int c){
        return a-b-c;
    }

    public float resta (float a, float b){
        return a-b;
    }

    public int multiplicacion(int a, int b){
        return a*b;
    }

    public int multiplicacion(int a, int b, int c, int d){
        return a*b*c*d;
    }

    public float multiplicacion(float a, float b){
        return a*b;
    }

    public float division(int a, int b){

        if (b==0){
            throw new ArithmeticException("División por cero no permitida");
        }else{
            return a/b;
        }
    }



    public float division(int a, int b, int c){

        float res = 0;

        if (b==0){
            res = 0;
        }else{
            res = a/b;
        }

        if (c==0){
            res = 0;
        }else{
            res = res/c;
        }

        return res;

    }


}
