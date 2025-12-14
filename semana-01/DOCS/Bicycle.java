package ejercicio 3;

public class Bicycle {

    // Atributos
    String brand;
    String model;
    String type;

    // Constructor
    public Bicycle(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    // Método
    public void showInfo() {
        System.out.println("Marca: " + brand);
        System.out.println("Modelo: " + model);
        System.out.println("Tipo: " + type);
        System.out.println("----------------------");
    }
}

