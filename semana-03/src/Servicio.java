package semana-03.src.co;

public class Servicio {
    private String tipoServicio;
    private double costoBase;
    private int duracionHoras;

    // Constructor completo
    public Servicio(String tipoServicio, double costoBase, int duracionHoras) {
        setTipoServicio(tipoServicio);
        setCostoBase(costoBase);
        setDuracionHoras(duracionHoras);
    }

    // Constructor parcial
    public Servicio(String tipoServicio, double costoBase) {
        this(tipoServicio, costoBase, 1);
    }

    // Getters
    public String getTipoServicio() { return tipoServicio; }
    public double getCostoBase() { return costoBase; }
    public int getDuracionHoras() { return duracionHoras; }

    // Setters con validación
    public void setTipoServicio(String tipoServicio) {
        if (tipoServicio == null || tipoServicio.isBlank()) {
            throw new IllegalArgumentException("Tipo de servicio inválido");
        }
        this.tipoServicio = tipoServicio;
    }

    public void setCostoBase(double costoBase) {
        if (costoBase < 0) {
            throw new IllegalArgumentException("Costo no puede ser negativo");
        }
        this.costoBase = costoBase;
    }

    public void setDuracionHoras(int duracionHoras) {
        if (duracionHoras <= 0) {
            throw new IllegalArgumentException("Duración mínima 1 hora");
        }
        this.duracionHoras = duracionHoras;
    }

    // Método de negocio
    public double calcularCostoFinal(double descuento) {
        if (descuento < 0 || descuento > 100) {
            throw new IllegalArgumentException("Descuento inválido");
        }
        return costoBase * (1 - descuento / 100);
    }

    private boolean validarTipo(String tipo) {
        return tipo != null && !tipo.isBlank();
    }
}
