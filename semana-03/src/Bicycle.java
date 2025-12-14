package semana-03.src.co.edu.sena.semana03;

public class Bicycle {
    private String brand;
    private String model;
    private String type; // MTB, Ruta, Urbana
    private int year;

    // Constructor completo
    public Bicycle(String brand, String model, String type, int year) {
        setBrand(brand);
        setModel(model);
        setType(type);
        setYear(year);
    }

    // Constructor parcial
    public Bicycle(String brand, String model, String type) {
        this(brand, model, type, 2025); // año por defecto
    }

    // Constructor mínimo
    public Bicycle(String brand) {
        this(brand, "Desconocido", "Urbana", 2025);
    }

    // Getters
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public String getType() { return type; }
    public int getYear() { return year; }

    // Setters con validación
    public void setBrand(String brand) {
        if (brand == null || brand.isBlank()) {
            throw new IllegalArgumentException("La marca no puede ser vacía");
        }
        this.brand = brand;
    }

    public void setModel(String model) {
        if (model == null || model.isBlank()) {
            this.model = "Desconocido";
        } else {
            this.model = model;
        }
    }

    public void setType(String type) {
        if (type == null || type.isBlank()) {
            this.type = "Urbana";
        } else {
            this.type = type;
        }
    }

    public void setYear(int year) {
        if (year < 1900 || year > 2030) {
            throw new IllegalArgumentException("Año inválido");
        }
        this.year = year;
    }

    // Método de negocio
    public void showInfo() {
        System.out.println("Marca: " + brand + ", Modelo: " + model + ", Tipo: " + type + ", Año: " + year);
    }

    // Método auxiliar privado
    private boolean validarString(String str) {
        return str != null && !str.isBlank();
    }
}

