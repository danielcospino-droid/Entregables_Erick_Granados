package semana-03.src.co;

public class Orden {
    private Cliente cliente;
    private Bicycle bicicleta;
    private Servicio servicio;

    // Constructor completo
    public Orden(Cliente cliente, Bicycle bicicleta, Servicio servicio) {
        setCliente(cliente);
        setBicicleta(bicicleta);
        setServicio(servicio);
    }

    // Getters
    public Cliente getCliente() { return cliente; }
    public Bicycle getBicicleta() { return bicicleta; }
    public Servicio getServicio() { return servicio; }

    // Setters con validación
    public void setCliente(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente no puede ser nulo");
        }
        this.cliente = cliente;
    }

    public void setBicicleta(Bicycle bicicleta) {
        if (bicicleta == null) {
            throw new IllegalArgumentException("Bicicleta no puede ser nula");
        }
        this.bicicleta = bicicleta;
    }

    public void setServicio(Servicio servicio) {
        if (servicio == null) {
            throw new IllegalArgumentException("Servicio no puede ser nulo");
        }
        this.servicio = servicio;
    }

    // Método de negocio
    public void mostrarResumen() {
        cliente.mostrarInfo();
        bicicleta.showInfo();
        System.out.println("Servicio: " + servicio.getTipoServicio() + ", Costo: $" + servicio.getCostoBase());
        System.out.println("---------------------------");
    }
}

