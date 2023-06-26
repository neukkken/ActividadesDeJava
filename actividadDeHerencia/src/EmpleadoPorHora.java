public class EmpleadoPorHora extends Empleado{

    int horasTrabajadas;

    public EmpleadoPorHora(String nombre, int edad, String empresa, double salario, int horasTrabajadas) {
        super(nombre, edad, empresa, salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    public void salarioTotal(){

        double sum = salario*horasTrabajadas;
        System.out.println("Salario total: "+sum);

    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
}
