
package ec.empleados.grupo5;

public class EmpleadoTP extends Empleado{
        private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoTP(String nombre, int edad, double tarifaPorHora, int horasTrabajadas) {
        super(nombre, edad, 0); // El salario base no se usa para empleados por horas
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return tarifaPorHora * horasTrabajadas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tarifa por Hora: $" + tarifaPorHora);
        System.out.println("Horas Trabajadas: " + horasTrabajadas);
        System.out.println("Salario Total: $" + calcularSalario());
    }   
}
