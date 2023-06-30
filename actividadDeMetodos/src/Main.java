public class Main {








    public static void main(String[] args) {

        Metodos actividades = new Metodos();

        System.out.println("Primer punto capicua: ");
        System.out.println("Numero 4554");
        System.out.println(actividades.esCapicua(4554));
        System.out.println("Numero 4555");
        System.out.println(actividades.esCapicua(4555));

        System.out.println("========================================");
        System.out.println("Segundo punto primo");
        System.out.println("Numero 7");
        System.out.println(actividades.esPrimo(7));
        System.out.println("Numero 455");
        System.out.println(actividades.esPrimo(455));

        System.out.println("========================================");
        System.out.println("Tercer punto potencia");
        System.out.println("5 al 3");
        System.out.println(actividades.potencia(5,3));
        System.out.println("5 al -3");
        System.out.println(actividades.potencia(5,-3));

        System.out.println("========================================");
        System.out.println("Cuarto punto contar digitos");
        System.out.println("1378237");
        System.out.println("El numero "+1378237+" tiene "+actividades.contarDigitos(1378237)+" digitos");

        System.out.println("========================================");
        System.out.println("Quinto punto darVuelta a un numero");
        System.out.println("1378237");
        System.out.println("El numero "+1378237+" dado la vuelta "+actividades.darVueltaNumero(1378237));

        System.out.println("========================================");
        System.out.println("Sexto punto devuele la posicion de un numero");
        System.out.println("1378237 en la posicion 2");
        System.out.println(actividades.digitoN(1378237, 2));

        System.out.println("========================================");
        System.out.println("Septimo punto quitar numero por detras");
        System.out.println("1378237 es el numero a quitarle 2 digitos");
        System.out.println(actividades.quitaPorDetras(1378237, 2));

        System.out.println("========================================");
        System.out.println("Octavo punto quitar numero por delante");
        System.out.println("1378237 es el numero a quitarle 2 digitos");
        System.out.println(actividades.quitaPorDelante(1378237, 2));

        System.out.println("========================================");
        System.out.println("Noveno punto pegar numeros por detras");
        System.out.println("1378237 es el numero a agregarle el 2");
        System.out.println(actividades.pegaPorDetras(1378237, 2));

        System.out.println("========================================");
        System.out.println("Noveno punto pegar numeros por delante");
        System.out.println("1378237 es el numero a agregarle el 2");
        System.out.println(actividades.agregarPorDelante(1378237, 2));

        System.out.println("========================================");
        System.out.println("Decimo punto pegar numeros por delante");
        System.out.println("1378237 es el numero a agregarle el 2");
        System.out.println(actividades.agregarPorDelante(1378237, 2));

    }
}