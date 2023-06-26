import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main{

    public Estudiante[] fillEstudiante(Estudiante[] estudiantes) {
        Scanner sc = new Scanner(System.in);

        for(int i = 2; i < estudiantes.length; ++i) {
            System.out.println("Agregar nuevo estudiante");
            System.out.println("Digite el nombre:");
            String nom = sc.nextLine();
            System.out.println("Digite la edad:");
            int edad = sc.nextInt();
            System.out.println("Digite su promedio:");
            double prom = sc.nextDouble();
            sc.nextLine();

            Estudiante objeto = new Estudiante(nom, edad, prom);
            objeto.setNombre(nom);
            objeto.setEdad(edad);
            objeto.setPromedio(prom);

            estudiantes[i] = objeto;
        }
        return estudiantes;
    }


    public Cliente[] fillCliente(Cliente[] clientes) {
        Scanner sc = new Scanner(System.in);

        for(int i = 2; i < clientes.length; ++i) {

            System.out.println("Agregar nuevo cliente");
            System.out.println("Digite el nombre:");
            String nom = sc.nextLine();
            System.out.println("Digite la edad:");
            int edad = sc.nextInt();
            sc.nextLine();
            System.out.println("Digite su direccion:");
            String dir = sc.nextLine();


            Cliente objeto = new Cliente(nom, edad, dir);
            objeto.setNombre(nom);
            objeto.setEdad(edad);
            objeto.setDireccion(dir);

            clientes[i] = objeto;
        }
        return clientes;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean g = false;


        do {
            System.out.println("");
            System.out.println("Menu de la actividad");

            System.out.println("1. Figuras");
            System.out.println("2. Empleados");
            System.out.println("3. Vehiculos");
            System.out.println("4. Calculadora");
            System.out.println("5. Animales");
            System.out.println("6. Cartas");
            System.out.println("7. Materias");
            System.out.println("8. Estudiantes");
            System.out.println("9. Clientes");
            System.out.println("Digite el numero deacuerdo al punto que quiera revisar :)");
            int y = sc.nextInt();
            System.out.println("");
            if (y==1){
                System.out.println("Primer punto Figuras");
                System.out.println("=========================");

                Rectangulo rectangulo= new Rectangulo(5, 2);
                Triangulo triangulo = new Triangulo(12,15,12,16.16,16.16);
                rectangulo.area();
                rectangulo.perimetro();
                System.out.println(" ");
                triangulo.area();
                triangulo.perimetro();

                System.out.println("=========================");

            }else if(y==2){
                System.out.println("Segundo punto Empleados");

                EmpleadoPorHora empleadoH = new EmpleadoPorHora("Francisco", 45, "Coca-Cola", 25, 120);
                EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Jorge", 78, "Kenworth", 1245);
                EmpleadoComisionista empleadoComisionista = new EmpleadoComisionista("Bratty", 22, "Universal", 8975,5);

                System.out.println("============================================");
                System.out.println("Empleado por hora");
                System.out.println("Nombre: "+empleadoH.getNombre());
                System.out.println("Edad: "+empleadoH.getEdad());
                System.out.println("Empresa: "+empleadoH.getEmpresa());
                System.out.println("Salario por horas: "+empleadoH.getSalario());
                System.out.println("Horas trabajadas: "+empleadoH.getHorasTrabajadas());
                System.out.println("");
                empleadoH.salarioTotal();
                System.out.println("============================================");

                System.out.println("Empleado asalariado");
                System.out.println("Nombre: "+empleadoAsalariado.getNombre());
                System.out.println("Edad: "+empleadoAsalariado.getEdad());
                System.out.println("Empresa: "+empleadoAsalariado.getEmpresa());
                System.out.println("Salario: "+empleadoAsalariado.getSalario());
                System.out.println("============================================");

                System.out.println("Empleado comisionista");
                System.out.println("Nombre: "+empleadoComisionista.getNombre());
                System.out.println("Edad: "+empleadoComisionista.getEdad());
                System.out.println("Empresa: "+empleadoComisionista.getEmpresa());
                System.out.println("Salario: "+empleadoComisionista.getSalario());
                System.out.println("Comision por cada empleado contratado: "+empleadoComisionista.getComisionPorEmpleado()+"%");
                System.out.println("");
                empleadoComisionista.comision();
                System.out.println("============================================");
            }else if(y==3){

                System.out.println("Tercer punto Vehiculos");
                Automovil automovil = new Automovil("Dodge", "RAM 1500 2023", 2700.0);
                Motocicleta motocicleta = new Motocicleta("Harley Davidson", "883", 247.0);
                Camion camion = new Camion("Kenworth", "W900", 8850);
                System.out.println("Comportamientos normales");
                System.out.println("Automovil");
                automovil.acelerar();
                automovil.frenar();
                System.out.println();
                System.out.println("Motocicleta");
                motocicleta.acelerar();
                motocicleta.frenar();
                System.out.println();
                System.out.println("Camion");
                camion.acelerar();
                camion.frenar();
                System.out.println();
                System.out.println("Comportamientos especificos");
                System.out.println("Automovil");
                automovil.roturaDeMotor();
                System.out.println();
                System.out.println("Motocicleta");
                motocicleta.fallaFrenos();
                System.out.println();
                System.out.println("Camion");
                camion.engancharCarga();
                System.out.println();
            }else if(y ==4){
                System.out.println("Punto cuatro Calculadora");
                Suma s = new Suma(10, 10);
                Resta r = new Resta(5,5);
                Multiplicacion m = new Multiplicacion(5,5);
                Division d = new Division(5,0);
                System.out.println("Sub clase de suma");
                s.Sum();
                System.out.println("Sub clase de resta");
                r.Res();
                System.out.println("Sub clase de multiplicación");
                m.Mul();
                System.out.println("Sub clase de división");
                d.Div();


            }else if(y==5){

                System.out.println("Quinto punto Animales");

                Perro perro= new Perro("Arthas","11");
                Gato gato = new Gato("Mediv","15");
                Pajaro pajaro = new Pajaro("Halfonso", "90");
                System.out.println("======================================");
                System.out.println("Metodos del perro");
                perro.Ladrar();
                System.out.println("Metodos del perro heredados del animal");
                perro.Comer();
                perro.Dormir();
                System.out.println("======================================");
                System.out.println("Metodos del gato");
                gato.Maullar();
                System.out.println("Metodos del gato heredados del animal");
                gato.Comer();
                gato.Dormir();
                System.out.println("======================================");
                System.out.println("Metodos del pajaro");
                pajaro.Silbar();
                System.out.println("Metodos del pajaro heredados del animal");
                pajaro.Comer();
                pajaro.Dormir();
                System.out.println("======================================");


            }else if(y==6){
                System.out.println("Sexto punto Cartitas");


                CartaNormal cartaNormal = new CartaNormal("Fuego", 0, 0);
                CartaEspecial cartaEspecial = new CartaEspecial("Sombras", 3200, 1250);

                System.out.println("Datos de la carta normal");
                System.out.println("Atributo: "+cartaNormal.getAtributo());
                System.out.println("Ataque: "+cartaNormal.getAtaque());
                System.out.println("Defensa: "+cartaNormal.getDefensa());
                cartaNormal.funcion();
                System.out.println(" ");
                System.out.println("Datos de la carta especial");
                System.out.println("Atributo: "+cartaEspecial.getAtributo());
                System.out.println("Ataque: "+cartaEspecial.getAtaque());
                System.out.println("Defensa: "+cartaEspecial.getDefensa());
                cartaEspecial.Funcion();


            }else if(y==7){
                System.out.println("Septimo punto Materias");

                Matematicas matematicas = new Matematicas(2, 3,4,5,5);
                Español español = new Español(1,2,2,5,4.8);
                Sociales sociales = new Sociales(5,2.9,5,4.9,5);
                Ingles ingles = new Ingles(3.8,4.2,1.2,4.5,3.8);


                System.out.println("Notas de matematicas");
                System.out.println("Primera nota: "+matematicas.getPrimeraNota());
                System.out.println("Segunda nota: "+matematicas.getSegundaNota());
                System.out.println("Tercera nota: "+matematicas.getTerceraNota());
                System.out.println("Cuarta nota: "+matematicas.getCuartaNota());
                System.out.println("Quinta nota: "+matematicas.getQuintaNota());
                System.out.println("=======================================");
                System.out.println("Promedio de matematicas");
                matematicas.promedio();
                System.out.println("=======================================");

                System.out.println("Notas de español");
                System.out.println("Primera nota: "+español.getPrimeraNota());
                System.out.println("Segunda nota: "+español.getSegundaNota());
                System.out.println("Tercera nota: "+español.getTerceraNota());
                System.out.println("Cuarta nota: "+español.getCuartaNota());
                System.out.println("Quinta nota: "+español.getQuintaNota());
                System.out.println("=======================================");
                System.out.println("Promedio de español");
                español.promedio();
                System.out.println("=======================================");


                System.out.println("Notas de sociales");
                System.out.println("Primera nota: "+sociales.getPrimeraNota());
                System.out.println("Segunda nota: "+sociales.getSegundaNota());
                System.out.println("Tercera nota: "+sociales.getTerceraNota());
                System.out.println("Cuarta nota: "+sociales.getCuartaNota());
                System.out.println("Quinta nota: "+sociales.getQuintaNota());
                System.out.println("=======================================");
                System.out.println("Promedio de sociales");
                sociales.promedio();
                System.out.println("=======================================");


                System.out.println("Notas de ingles");
                System.out.println("Primera nota: "+ingles.getPrimeraNota());
                System.out.println("Segunda nota: "+ingles.getSegundaNota());
                System.out.println("Tercera nota: "+ingles.getTerceraNota());
                System.out.println("Cuarta nota: "+ingles.getCuartaNota());
                System.out.println("Quinta nota: "+ingles.getQuintaNota());
                System.out.println("=======================================");
                System.out.println("Promedio de ingles");
                ingles.promedio();
                System.out.println("=======================================");

            }else if(y==8){

                g = true;

                System.out.println("Octavo punto Estudiantes (agregar antes de pasar a las demas opciones :))");

                Estudiante[] estudiantes = new Estudiante[3];
                estudiantes[0]= new Estudiante("Santiago Narvaez Lasso", 19, 4.9);
                estudiantes[1]= new Estudiante("Martin Garrix", 23, 3.5);

                Main fillEstu = new Main();

                do {

                    System.out.println("Menu");
                    System.out.println("1. Agregar estudiante");
                    System.out.println("2. Buscar estudiante");
                    System.out.println("3. Calcular promedios");
                    System.out.println("4. para volver al menu de la actividad");
                    int a = sc.nextInt();

                    if (a == 1) {

                        fillEstu.fillEstudiante(estudiantes);


                        System.out.println("Nuevo estudiante:");
                        System.out.println(estudiantes[2].getNombre());
                        System.out.println(estudiantes[2].getEdad());
                        System.out.println(estudiantes[2].getPromedio());


                    } else if (a == 2) {
                        sc.nextLine();
                        System.out.println("Buscar estudiante: ");
                        String no = sc.nextLine();

                        if (no.equalsIgnoreCase(estudiantes[0].getNombre())) {

                            System.out.println("Estudiante No.1");
                            System.out.println("Nombre: " + estudiantes[0].getNombre());
                            System.out.println("Edad: " + estudiantes[0].getEdad());
                            System.out.println("Promedio: " + estudiantes[0].getPromedio());

                        } else if (no.equalsIgnoreCase(estudiantes[1].getNombre())) {

                            System.out.println("Estudiante No.2");
                            System.out.println("Nombre: " + estudiantes[1].getNombre());
                            System.out.println("Edad: " + estudiantes[1].getEdad());
                            System.out.println("Promedio: " + estudiantes[1].getPromedio());

                        } else if (no.equalsIgnoreCase(estudiantes[2].getNombre())) {

                            System.out.println("Estudiante No.3");
                            System.out.println("Nombre: " + estudiantes[2].getNombre());
                            System.out.println("Edad: " + estudiantes[2].getEdad());
                            System.out.println("Promedio: " + estudiantes[2].getPromedio());

                        }

                    }else if (a==3){

                        double sum = (estudiantes[0].getPromedio()+estudiantes[1].getPromedio()+estudiantes[2].getPromedio())/3;

                        System.out.println("Promedio de todos los estudiantes: "+sum);

                    }else if(a == 4){

                        g=false;
                    }else{
                        System.out.println("Digite un numero entre 1 y 4");
                    }


                } while (g == true);


            }else if(y==9){
                g = true;

                System.out.println("Noveno punto Clientes");

                Cliente[] clientes = new Cliente[3];
                clientes[0] = new Cliente("Kidd", 20, "Calle 12");
                clientes[1] = new Cliente("Raul", 56, "Calle 10");
                Main fillCli = new Main();

                do {
                    System.out.println("Menu");
                    System.out.println("1. Agregar clientes");
                    System.out.println("2. Buscar clientes");
                    System.out.println("3. Cantidad de clientes entre un rango de edad");
                    System.out.println("4. para volver al menu de la actividad");
                    int bus = sc.nextInt();

                    if(bus==1){
                        sc.nextLine();
                        fillCli.fillCliente(clientes);

                        System.out.println("Nuevo cliente agregado");
                        System.out.println("Nombre: "+clientes[2].getNombre());
                        System.out.println("Direccion: "+clientes[2].getDireccion());
                        System.out.println("Edad: "+clientes[2].getEdad());

                    }else if(bus==2){

                        sc.nextLine();
                        System.out.println("Nombre o direccion del tal: ");
                        String no = sc.nextLine();

                        if (no.equalsIgnoreCase(clientes[0].getNombre()) || no.equalsIgnoreCase(clientes[0].getDireccion())){
                            System.out.println("El cliente que busco es el siguiente: ");
                            System.out.println("Nombre: "+clientes[0].getNombre());
                            System.out.println("Direccion: "+clientes[0].getDireccion());
                            System.out.println("Edad: "+clientes[0].getEdad());

                        }else if(no.equalsIgnoreCase(clientes[1].getNombre()) || no.equalsIgnoreCase(clientes[1].getDireccion())){
                            System.out.println("El cliente que busco es el siguiente: ");
                            System.out.println("Nombre: "+clientes[1].getNombre());
                            System.out.println("Direccion: "+clientes[1].getDireccion());
                            System.out.println("Edad: "+clientes[1].getEdad());

                        }else if(no.equalsIgnoreCase(clientes[2].getNombre()) || no.equalsIgnoreCase(clientes[2].getDireccion())){
                            System.out.println("El cliente que busco es el siguiente: ");
                            System.out.println("Nombre: "+clientes[2].getNombre());
                            System.out.println("Direccion: "+clientes[2].getDireccion());
                            System.out.println("Edad: "+clientes[2].getEdad());


                        }

                    }else if(bus==3){
                        sc.nextLine();
                        System.out.println("Digite la edad minima y maxima para su rango");
                        System.out.println("Edad minima:");
                        int min = sc.nextInt();
                        System.out.println("Edad maxima:");
                        int max = sc.nextInt();

                        int acu = 0;

                        for(int i = 0; i< clientes.length; i++){
                            if (clientes[i].getEdad()>=min && clientes[i].getEdad()<=max){
                                acu = acu + 1;
                            }
                        }

                        System.out.println("Entre "+min+" años"+" Y "+max+" años "+"hay "+acu+" clientes");

                    }else if(bus==4){

                        g=false;
                    }else{
                        System.out.println("Digite un numero entre 1 y 4");
                    }

                }while(g == true);
            }
        }while(true);
    }
}
