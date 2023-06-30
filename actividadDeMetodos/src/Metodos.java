import java.util.Arrays;

public class Metodos {

    // del uno al 14 creo

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


    public static int binarioAEntero(int[] binario) {
        int entero = 0;
        int exponente = 0;

        for (int i = binario.length - 1; i >= 0; i--) {
            entero += binario[i] * Math.pow(2, exponente);
            exponente++;
        }

        return entero;
    }

    public static int quitaPorDetras(int numero, int n) {
        return numero / (int) Math.pow(10, n);
    }

    public static int quitaPorDelante(int numero, int n) {
        String numeroString = Integer.toString(numero);
        String resultadoString = numeroString.substring(n);
        return Integer.parseInt(resultadoString);
    }

    public static int pegaPorDetras(int numero, int digito) {
        return numero * 10 + digito;
    }

    public static int agregarPorDelante(int numero, int digito) {
        String numeroString = String.valueOf(numero);
        String resultadoString = digito + numeroString;
        return Integer.parseInt(resultadoString);
    }

    public static int trozoDeNumero(int numero, int posicionInicial, int posicionFinal) {
        String numeroString = String.valueOf(numero);
        String trozoString = numeroString.substring(posicionInicial, posicionFinal + 1);
        return Integer.parseInt(trozoString);
    }

    public static int numeroDeDigitos(int numero) {
        String numeroString = String.valueOf(numero);
        return numeroString.length();
    }

    public static int juntaNumeros(int numero1, int numero2) {
        String numero1String = String.valueOf(numero1);
        String numero2String = String.valueOf(numero2);
        String resultadoString = numero1String + numero2String;
        return Integer.parseInt(resultadoString);
    }



    ///PUNTO DE LOS TAL

    public static int binarioADecimal(int[] binario) {
        int decimal = 0;
        int exponente = 0;

        for (int i = binario.length - 1; i >= 0; i--) {
            decimal += binario[i] * Math.pow(2, exponente);
            exponente++;
        }

        return decimal;
    }

    public static int[] decimalABinario(int decimal) {
        int[] binario = new int[32];
        int indice = 31;

        while (decimal > 0) {
            binario[indice] = decimal % 2;
            decimal /= 2;
            indice--;
        }

        return Arrays.copyOfRange(binario, indice + 1, 32);
    }

    public static String decimalAHexadecimal(int decimal) {
        return Integer.toHexString(decimal).toUpperCase();
    }

    public static String binarioAOctal(int[] binario) {
        StringBuilder octal = new StringBuilder();
        int[] agrupacion = new int[3];
        int indiceAgrupacion = 0;

        for (int i = binario.length - 1; i >= 0; i--) {
            agrupacion[indiceAgrupacion] = binario[i];
            indiceAgrupacion++;

            if (indiceAgrupacion == 3 || i == 0) {
                octal.insert(0, binarioAEntero(agrupacion));
                indiceAgrupacion = 0;
            }
        }

        return octal.toString();
    }



}
