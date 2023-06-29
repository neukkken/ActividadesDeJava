public class Division extends Calculadora{

    public float division(int a, int b){

        float res = 0;

        if (b==0){

            res = 0;

        }else{
            res = a/b;
        }

        return res;
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
