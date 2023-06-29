public class Main {

    public static boolean esCapicua(int numero) {

        String numeroAStr = String.valueOf(numero);
        int longitud = numeroAStr.length();

        for (int i = 0; i < longitud / 2; i++) {
            if (numeroAStr.charAt(i) != numeroAStr.charAt(longitud - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static boolean esPrimo(int numero){
        int cont = 0;

        for(int i = 1; i<numero; i++){

            if (numero % i == 0){

                cont = cont + 1;

            }

        }

        if (cont>2){
            return false;
        }else{
            return true;
        }

    }

    public static double potencia(double base, int exponente){

        double potencia = 1;

        if (exponente > 0){

            for (int i = 1; i<=exponente; i++){

                potencia *= base;

            }
        } else if (exponente<0) {

            for (int i = 1; i<=-exponente; i++){

                potencia /= base;

            }
        }

        return potencia;
    }

    public static int contarDigitos(int numero) {
        int cont = 0;

        if (numero == 0) {
            cont = 1;
        } else {
            while (numero != 0) {
                numero /= 10;
                cont++;
            }
        }

        return cont;
    }

    public static int darVueltaNumero(int numero) {
        int numeroInvertido = 0;

        while (numero != 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }

        return numeroInvertido;
    }

    public static int digitoN(int numero, int posicion) {
        int numeroAbsoluto = Math.abs(numero); // Convertir a valor absoluto para tratar números negativos y tal
        int longitud = String.valueOf(numeroAbsoluto).length();

        if (posicion >= longitud) {
            return -1; // Si la posición excede la longitud del número, retornar -1 como indicador de error xd
        }

        int posicionInvertida = longitud - posicion - 1;

        for (int i = 0; i < posicionInvertida; i++) {
            numeroAbsoluto /= 10;
        }

        return numeroAbsoluto % 10;
    }





    public static void main(String[] args) {

        /*CAPICUA

        int numero = 12321;

        if(esCapicua(numero)) {
            System.out.println("El número " + numero + " es capicúa.");
        }else{
            System.out.println("El número " + numero + " no es capicúa.");
        }

        */

        /*PRIMO Y TAL

        int numP = 7;

        if (esPrimo(numP)){
            System.out.println("El numero "+numP+" Es primo");
        }else{
            System.out.println("El numero no "+numP+" Es primo");
        }

         */

        /*METODO POTENCIA

        System.out.println("Potencia de 2 al cubo: "+potencia(2,3));
        System.out.println("Potencia de 2 al -cubo: "+potencia(2,-3));

         */

        /*METODO DE CONTAR NUMEROS
        System.out.println(contarDigitos(456));

    */


        /*METODO DE DAR VUELTA XD

        int numeroNormi = 9123;
        int numeroVolteao = darVueltaNumero(numeroNormi);

        System.out.println("Numero normal: "+numeroNormi+" Numero dao la vuelta: "+numeroVolteao);

    */

        /*POSISICON DE NUMEROS Y YO KE SE

        int num = 12345;
        int posicion = 2;

        int nPosicion = digitoN(num, posicion);

        if (nPosicion == -1){

            System.out.println("El tal exede la longitud del tal");
        }else{

            System.out.println("El numero"+num+" en su posicion "+posicion+" es "+nPosicion);
        }

*/






    }
}