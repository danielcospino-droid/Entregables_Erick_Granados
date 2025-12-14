package semana-03.src;

public class Main {
    public static void main(String[] args) {
        // Crear clientes
        Cliente c1 = new Cliente("Juan Pérez", "juan@mail.com", "3001234567");
        Cliente c2 = new Cliente("Ana Gómez");

        // Crear bicicletas
        Bicycle b1 = new Bicycle("Trek", "Marlin 7", "MTB", 2023);
        Bicycle b2 = new Bicycle("Specialized", "Allez", "Ruta");

        // Crear servicios
        Servicio s1 = new Servicio("Mantenimiento general", 50000);
        Servicio s2 = new Servicio("Reparación frenos", 30000, 2);

        // Crear órdenes
        Orden o1 = new Orden(c1, b1, s1);
        Orden o2 = new Orden(c2, b2, s2);

        // Taller
        Taller taller = new Taller("Pedales y Ruedas");
        taller.agregarOrden(o1);
        taller.agregarOrden(o2);

        // Mostrar resultados
        taller.mostrarTodasOrdenes();
        System.out.println("Total de órdenes: " + taller.contarOrdenes());
    }
}

