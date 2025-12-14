package semana-05.src;
public class Empleado {
    protected String nombre;
    public double calcularSalario() { return 1000000; }
}

public class EmpleadoPlanta extends Empleado {
    @Override
    public double calcularSalario() { return 1000000 + 50000; }
}