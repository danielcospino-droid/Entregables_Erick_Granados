package semana-05.src;

public class Main {
    public static void main(String[] args) {
        SistemaTaller taller = new SistemaTaller();

        EmpleadoPlanta emp1 = new EmpleadoPlanta("Ana", 3000000, 5);
        EmpleadoContrato emp2 = new EmpleadoContrato("Luis", 2500000);

        taller.agregarEmpleado(emp1);
        taller.agregarEmpleado(emp2);

        taller.procesarNomina();
    }
}