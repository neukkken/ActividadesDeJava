public class Animal {

    protected String nombre;
    protected String edad;

    public Animal(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void Comer(){

        System.out.println("El animal come");

    }
    public void Dormir(){

        System.out.println("El animal duerme");

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
