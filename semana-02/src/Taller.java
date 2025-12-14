package semana-02.src;

import java.util.ArrayList;

public class Taller {
    private String nombre;
    private ArrayList<Orden> ordenes;

    public Taller(String nombre) {
        this.nombre = nombre;
        this.ordenes = new ArrayList<>();
    }

    public void agregarOrden(Orden orden) {
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

