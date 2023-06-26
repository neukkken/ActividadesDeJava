public class EmpleadoComisionista extends Empleado{

    double comisionPorEmpleado;

    public EmpleadoComisionista(String nombre, int edad, String empresa, double salario, double comisionPorEmpleado) {
        super(nombre, edad, empresa, salario);
        this.comisionPorEmpleado = comisionPorEmpleado;
    }

    public void comision(){
        double comi = (salario*comisionPorEmpleado)/100;

        System.out.println("La comision por empleado es de: "+comi);

    }

    public double getComisionPorEmpleado() {
        return comisionPorEmpleado;
    }

    public void setComisionPorEmpleado(double comisionPorEmpleado) {
        this.comisionPorEmpleado = comisionPorEmpleado;
    }
}




