import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        do {
            System.out.println("=============================");
            System.out.println("Actividad de Polimorfismo");
            System.out.println("1. Punto 1");
            System.out.println("2. Punto 2");
            System.out.println("3. Punto 3");
            System.out.println("4. Punto 4");
            System.out.println("=============================");
            System.out.println("Digite el punto a ver: ");
            int a = sc.nextInt();


            if(a==1){

                System.out.println("Punto Uno: Contador de palabras");
                System.out.println("");
                contadorDePalabras contadorClaseHija = new contPalabrasPoly();
                contadorDePalabras contadorClaseHija2 = new contarPal2();

                sc.nextLine();
                System.out.println("Digite una cadena de texto con espacios");
                String text = sc.nextLine();

                System.out.println("Digite una cadena de texto con guines(-)");
                String text2 = sc.nextLine();


                int PalabrasEsp = contadorClaseHija.contadorDePalabras(text);
                int PalabrasGuion = contadorClaseHija2.contarPalabras(text2);

                System.out.println("Conteo con espacios: " + PalabrasEsp);
                System.out.println("Conteo con guiones: " + PalabrasGuion);

            }else if(a ==2){

                System.out.println("Punto Dos: Area de figuras");
                System.out.println("");
                Figura[] figuras = new Figura[3];
                figuras[0] = new Circulo(5.0);
                figuras[1] = new Triangulo(3.0, 4.0);
                figuras[2] = new Rectangulo(6.0, 8.0);


                System.out.println("El area del circulo es: "+figuras[0].calcularArea());
                System.out.println("El area del Triangulo es: "+figuras[1].calcularArea());
                System.out.println("El area del Rectangulo es: "+figuras[2].calcularArea());


            }else if(a==3){
                System.out.println("Punto Tres: Calculadora");
                System.out.println("");
                Calculadora div = new Division();
                Calculadora resta = new Resta();
                Calculadora mul = new Multiplicacion();
                Calculadora suma = new Suma();

                System.out.println("Metodos para la suma");
                System.out.println("Suma de dos enteros: "+suma.suma(5,5));
                System.out.println("Suma de cuatro enteros: "+suma.suma(5,5,5,5));
                System.out.println("Suma de dos flotantes: "+suma.suma(4.7 ,5.5));
                System.out.println("Suma de dos doubles: "+suma.suma(10000000,522156151));

                System.out.println("");
                System.out.println("Metodos de la resta");
                System.out.println("Resta de dos enteros: "+resta.resta(5,5));
                System.out.println("Resta de tres enteros: "+resta.resta(5,5,5));
                System.out.println("Resta de dos flotantes: "+resta.resta(1.5F,0.9F));

                System.out.println("");
                System.out.println("Metodos de la multiplicacion");
                System.out.println("Multiplicacion de dos enteros: "+mul.multiplicacion(5,5));
                System.out.println("Multiplicacion de cuatro enteros: "+mul.multiplicacion(5,5,5,5));
                System.out.println("Multiplicacion de dos flotantes: "+resta.resta(1.5F,0.9F));


                System.out.println("");
                System.out.println("Metodos de la division");
                System.out.println("Division de dos numeros: "+div.division(25,5));
                System.out.println("Division de tres numeros: "+div.division(100,10,10));



            }else if(a==4){
                System.out.println("Punto Cuatro: Conversor");
                System.out.println("");

                ConversorDeMedidas conversorDeMedidas = new ConversorDeMedidas();


                System.out.println("Conversor kilometros a millas y metros");
                System.out.println("100 Kilometros son");
                System.out.println(conversorDeMedidas.kmamillas(100)+" Millas");
                System.out.println(conversorDeMedidas.kmametros(100)+" Metros");


            }else{
                System.out.println("Solo hay 4 puntos");
            }

        }while (true);


    }

}