package semana-02.src;

public class Repuesto {
    private String nombre;
    private double precio;
    private int stock;

    public Repuesto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Método de negocio
    public void vender(int cantidad) {
        if(cantidad <= stock) {
            stock -= cantidad;
            System.out.println(cantidad + " unidades de " + nombre + " vendidas.");
        } else {
            System.out.println("Stock insuficiente para " + nombre);
        }
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
}

