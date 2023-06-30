import java.util.Arrays;

public class Main {

    public class StringUtils {

        public static int parseInt(String numberString) {
            return Integer.parseInt(numberString);
        }

        public static int length(String str) {
            return str.length();
        }

        public static char charAt(String str, int index) {
            return str.charAt(index);
        }

        public static String substring(String str, int beginIndex) {
            return str.substring(beginIndex);
        }

        public static String substring(String str, int beginIndex, int endIndex) {
            return str.substring(beginIndex, endIndex);
        }

        public static int indexOf(String str, String searchStr) {
            return str.indexOf(searchStr);
        }

        public static int lastIndexOf(String str, String searchStr) {
            return str.lastIndexOf(searchStr);
        }

        public static boolean contains(String str, CharSequence sequence) {
            return str.contains(sequence);
        }

        public static boolean startsWith(String str, String prefix) {
            return str.startsWith(prefix);
        }

        public static boolean endsWith(String str, String suffix) {
            return str.endsWith(suffix);
        }

        public static String toLowerCase(String str) {
            return str.toLowerCase();
        }

        public static String toUpperCase(String str) {
            return str.toUpperCase();
        }

        public static String trim(String str) {
            return str.trim();
        }

        public static boolean equals(String str1, String str2) {
            return str1.equals(str2);
        }

        public static String[] split(String str, String delimiter) {
            return str.split(delimiter);
        }

        public static String toString(int number) {
            return Integer.toString(number);
        }
    }




    public static void main(String[] args) {



        String text = "   Hello, World!   ";

        // parseInt()
        int number = StringUtils.parseInt("123");
        System.out.println("Parsed numero: " + number);

        // length()
        int length = StringUtils.length(text);
        System.out.println("Length of texto: " + length);

        // charAt()
        char firstChar = StringUtils.charAt(text, 0);
        System.out.println("primer caracter: " + firstChar);

        // substring()
        String subString1 = StringUtils.substring(text, 7);
        System.out.println("Sacando posicion 7 del tal: " + subString1);

        String subString2 = StringUtils.substring(text, 5, 8);
        System.out.println("Sacando posicion del 5 al 8 del tal: " + subString2);

        // indexOf()
        int index1 = StringUtils.indexOf(text, "o");
        System.out.println("Primera o en el tal: " + index1);

        // lastIndexOf()
        int index2 = StringUtils.lastIndexOf(text, "o");
        System.out.println("ultima o en el tal: " + index2);

        // contains()
        boolean contains = StringUtils.contains(text, "World");
        System.out.println("Palabra que sea World: " + contains);

        // startsWith()
        boolean startsWith = StringUtils.startsWith(text, "Hello");
        System.out.println("Palabra que sea hello: " + startsWith);

        // endsWith()
        boolean endsWith = StringUtils.endsWith(text, "World!");
        System.out.println("Palabra world que termine con !: " + endsWith);

        // toLowerCase()
        String lowerCase = StringUtils.toLowerCase(text);
        System.out.println("minusculas: " + lowerCase);

        // toUpperCase()
        String upperCase = StringUtils.toUpperCase(text);
        System.out.println("mayusculas: " + upperCase);

        // trim()
        String trimmedText = StringUtils.trim(text);
        System.out.println("Elimina los espacios en blanco al inicio y al final de la cadena \" Hello, World!: " + trimmedText);

        // equals()
        boolean isEqual = StringUtils.equals(text, "Hello, World!");
        System.out.println("Compara la cadena \" Hello, World! \" con la cadena \"Hello, World!\" para verificar si son iguales.: " + isEqual);

        // split()
        String[] splitArray = StringUtils.split(text, ",");
        System.out.println("Divide la cadena \" Hello, World! \" en subcadenas utilizando el separador \",\".:");
        for (String splitText : splitArray) {
            System.out.println(splitText);
        }

        // toString()
        String stringRepresentation = StringUtils.toString(1231231);
        System.out.println("Convierte numeritos en cadena de texto: " + stringRepresentation);



        System.out.println("Funciones de arrays");

        System.out.println("Primera length");

        String texto = "Hola que so JAJA";

        length = StringUtils.length(texto);
        System.out.println("Longitud del texto: " + length);

        System.out.println("");
        System.out.println("Segunda clone");

        int[] numeritos = {1, 2, 3, 4, 5};

        int[] numeritosCopia = numeritos.clone();

        System.out.println("Original array: " + Arrays.toString(numeritos));
        System.out.println("array clonao: " + Arrays.toString(numeritosCopia));

        System.out.println("");
        System.out.println("Tercero arraycopy");
        int[] arrayOriginal = {5, 77, 3, 1, 90};
        int[] arrayCopiao = new int[5];

        System.arraycopy(arrayOriginal, 0, arrayCopiao, 0, arrayOriginal.length);

        System.out.println("array base: " + Arrays.toString(arrayOriginal));
        System.out.println("array copiao: " + Arrays.toString(arrayCopiao));

        System.out.println("");
        System.out.println("Cuarto fill");

        int[] numbers = new int[5];

        Arrays.fill(numbers, 42);

        System.out.println("Array llenao de 42: " + Arrays.toString(numbers));

        /*haciendo esto me di cuenta que todos funcionan similar xd*/

        System.out.println("Funciones Math");
        System.out.println("math.abs");
        double num = -104.5;
        double valorAbsoluto = Math.abs(num);
        System.out.println("El valor absoluto de " + num + " es: " + valorAbsoluto);

        System.out.println(" ");
        System.out.println("Math.sqrt");
        double num2 = 45.0;
        double raiz = Math.sqrt(num2);
        System.out.println("La raíz cuadrada de " + num2 + " es: " + raiz);


        System.out.println(" ");
        System.out.println("Math.cbrt");
        double num3 = 27.0;
        double raizCubica = Math.cbrt(num3);
        System.out.println("La raíz cúbica de " + num3 + " es: " + raizCubica);

        System.out.println(" ");
        System.out.println("Math.exp");

        double num4 = 47.0;
        double exponencial = Math.exp(num4);
        System.out.println("El exponencial de " + num4 + " es: " + exponencial);

        System.out.println(" ");
        System.out.println("Math.log");

        double num5 = 10.0;
        double logaritmo= Math.log(num5);
        System.out.println("El logaritmo natural de " + num5 + " es: " + logaritmo);

        System.out.println(" ");
        System.out.println("Math.log10");

        double num6 = 104.0;
        double logarimoBase10 = Math.log10(num6);
        System.out.println("El logaritmo en base 10 de " + num6 + " es: " + logarimoBase10);

        System.out.println(" ");
        System.out.println("Math.max");

        double numero1 = 10123.5;
        double numero2 = 71441.2;
        double maximo = Math.max(numero1, numero2);
        System.out.println("El máximo entre " + numero1 + " y " + numero2 + " es: " + maximo);

        System.out.println(" ");
        System.out.println("Math.min");

        double numero11 = 11440.5;
        double numero22 = 744.2;
        double minimo = Math.min(numero11, numero22);
        System.out.println("El mínimo entre " + numero11 + " y " + numero22 + " es: " + minimo);

        System.out.println(" ");
        System.out.println("Math.ceil");

        double num7 = 3.714;
        double ceilValor = Math.ceil(num7);
        System.out.println("El techo de " + num7 + " es: " + ceilValor);

        System.out.println(" ");
        System.out.println("Math.floor");

        double num8 = 323.7;
        double floorValor = Math.floor(num8);
        System.out.println("El piso de " + num8 + " es: " + floorValor);

        System.out.println(" ");
        System.out.println("Math.round");

        double num9 = 3.7;
        long valorRedondo = Math.round(num9);
        System.out.println("El redondeo de " + num9 + " es: " + valorRedondo);


        System.out.println(" ");
        System.out.println("Math.random");

        double numeroRandom = Math.random();
        System.out.println("Un número aleatorio entre 0 y 1 es: " + numeroRandom);


    }

}