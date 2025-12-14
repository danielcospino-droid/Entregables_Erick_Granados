package semana-05.src;

public class SistemaTaller {
    private ArrayList<Empleado> empleados = new ArrayList<>();

    public void agregarEmpleado(Empleado emp) {
        empleados.add(emp);
        System.out.println(emp.nombre + " agregado.");
    }

    public void procesarNomina() {
        for (Empleado emp : empleados) {
            System.out.println(emp.nombre + " - Salario: $" + emp.calcularSalario());
        }
    }
}
