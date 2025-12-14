package semana-02.src;

public class Orden {
    private Cliente cliente;
    private Bicycle bicicleta;
    private Servicio servicio;

    public Orden(Cliente cliente, Bicycle bicicleta, Servicio servicio) {
        this.cliente = cliente;
        this.bicicleta = bicicleta;
        this.servicio = servicio;
    }

    // Método de negocio
    public void mostrarResumen() {
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Bicicleta: " + bicicleta.getBrand() + " " + bicicleta.getModel());
        System.out.println("Servicio: " + servicio.getTipoServicio());
        System.out.println("Costo: $" + servicio.getCostoBase());
        System.out.println("---------------------------");
    }

    // Getters y setters
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Bicycle getBicicleta() { return bicicleta; }
    public void setBicicleta(Bicycle bicicleta) { this.bicicleta = bicicleta; }

    public Servicio getServicio() { return servicio; }
    public void setServicio(Servicio servicio) { this.servicio = servicio; }
}
