package semana-03.src;

import java.util.ArrayList;

public class Taller {
    private String nombre;
    private ArrayList<Orden> ordenes;

    public Taller(String nombre) {
        setNombre(nombre);
        this.ordenes = new ArrayList<>();
    }

    // Getter y Setter
    public String getNombre() { return nombre; }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            this.nombre = "Taller sin nombre";
        } else {
            this.nombre = nombre;
        }
    }

    // Métodos
    public void agregarOrden(Orden orden) {
        if (orden == null) {
            throw new IllegalArgumentException("Orden inválida");
        }
        ordenes.add(orden);
    }

    public void mostrarTodasOrdenes() {
        for (Orden o : ordenes) {
            o.mostrarResumen();
        }
    }

    public int contarOrdenes() {
        return ordenes.size();
    }
}
