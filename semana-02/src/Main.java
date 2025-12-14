package semana-02.src;

public class Main {
    public static void main(String[] args) {
        // Crear clientes
        Cliente cliente1 = new Cliente("Juan Pérez", "juan@email.com");
        Cliente cliente2 = new Cliente("Ana Gómez", "ana@email.com");

        // Crear bicicletas
        Bicycle bici1 = new Bicycle("Trek", "Marlin 7", "MTB");
        Bicycle bici2 = new Bicycle("Specialized", "Allez", "Ruta");

        // Crear servicios
        Servicio mantenimiento = new Servicio("Mantenimiento general", 50000, 2);
        Servicio reparacion = new Servicio("Reparación frenos", 30000, 1);

        // Crear órdenes (relación entre cliente, bici y servicio)
        Orden orden1 = new Orden(cliente1, bici1, mantenimiento);
        Orden orden2 = new Orden(cliente2, bici2, reparacion);

        // Crear taller y usar ArrayList
        Taller taller = new Taller("Pedales y Ruedas");
        taller.agregarOrden(orden1);
        taller.agregarOrden(orden2);

        // Mostrar resultados
        taller.mostrarTodasOrdenes();
        System.out.println("Total de órdenes: " + taller.contarOrdenes());
    }
}

