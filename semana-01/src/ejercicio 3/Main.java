package ejercicio 4;

public class Main {
    public static void main(String[] args) {

        Bicycle bici1 = new Bicycle("Trek", "Marlin 7", "MTB");
        Bicycle bici2 = new Bicycle("Specialized", "Allez", "Ruta");
        Bicycle bici3 = new Bicycle("Giant", "Escape 3", "Urbana");
        Bicycle bici4 = new Bicycle("Scott", "Spark 900", "MTB");
        Bicycle bici5 = new Bicycle("Cannondale", "CAAD13", "Ruta");

        bici1.showInfo();
        bici2.showInfo();
        bici3.showInfo();
        bici4.showInfo();
        bici5.showInfo();
    }
}
