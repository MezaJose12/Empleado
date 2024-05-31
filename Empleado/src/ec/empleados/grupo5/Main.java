
package ec.empleados.grupo5;

public class Main {
    public static void main(String[] args) {
        EmpleadoTC emp1 = new EmpleadoTC("Juan", 30, 3000, 500);
        EmpleadoTP emp2 = new EmpleadoTP("Ana", 25, 20, 120);

        System.out.println("Información del Empleado a Tiempo Completo:");
        emp1.mostrarInformacion();

        System.out.println("\nInformación del Empleado por Horas:");
        emp2.mostrarInformacion();
    } 
}
