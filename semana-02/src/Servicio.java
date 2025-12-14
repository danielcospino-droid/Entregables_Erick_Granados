package semana-02.src;

public class Servicio {
    private String tipoServicio;
    private double costoBase;
    private int duracionHoras;

    public Servicio(String tipoServicio, double costoBase, int duracionHoras) {
        this.tipoServicio = tipoServicio;
        this.costoBase = costoBase;
        this.duracionHoras = duracionHoras;
    }

    // Método de negocio
    public double calcularCostoFinal(double descuento) {
        return costoBase - descuento;
    }

    // Getters y setters
    public String getTipoServicio() { return tipoServicio; }
    public void setTipoServicio(String tipoServicio) { this.tipoServicio = tipoServicio; }

    public double getCostoBase() { return costoBase; }
    public void setCostoBase(double costoBase) { this.costoBase = costoBase; }

    public int getDuracionHoras() { return duracionHoras; }
    public void setDuracionHoras(int duracionHoras) { this.duracionHoras = duracionHoras; }
}
