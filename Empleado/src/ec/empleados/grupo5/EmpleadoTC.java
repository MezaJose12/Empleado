
package ec.empleados.grupo5;

public class EmpleadoTC extends Empleado{
    

    private double bonificacion;

    public EmpleadoTC(String nombre, int edad, double salarioBase, double bonificacion) {
        super(nombre, edad, salarioBase);
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonificacion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Bonificación: $" + bonificacion);
        System.out.println("Salario Total: $" + calcularSalario());
    }
}
