public class Empleado {
    protected String nombre;
    protected String identificacion;
    protected double salarioBase;

    public Empleado(String nombre, String id, double salario) {
        this.nombre = nombre;
        this.identificacion = id;
        this.salarioBase = salario;
    }

    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre);
        System.out.println("ID: " + identificacion);
    }

    public double calcularSalario() {
        return salarioBase;
    }
}
// Empleado de planta (fijo)
public class EmpleadoPlanta extends Empleado {
    private int anosAntiguedad;

    public EmpleadoPlanta(String nombre, String id, double salario, int anos) {
        super(nombre, id, salario);
        this.anosAntiguedad = anos;
    }

    @Override
    public double calcularSalario() {
        double bono = salarioBase * 0.05 * anosAntiguedad; // 5% por año
        return salarioBase + bono;
    }

    public int getAnosAntiguedad() {
        return anosAntiguedad;
    }
}

// Empleado por contrato
public class EmpleadoContrato extends Empleado {
    private int mesesContrato;

    public EmpleadoContrato(String nombre, String id, double salario, int meses) {
        super(nombre, id, salario);
        this.mesesContrato = meses;
    }

    @Override
    public double calcularSalario() {
        return salarioBase; // Sin bonos
    }

    public int getMesesContrato() {
        return mesesContrato;
    }
}
