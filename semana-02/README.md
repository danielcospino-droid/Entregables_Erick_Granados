# Pedales y Ruedas - Taller de Bicicletas

## 📋 Descripción del Proyecto
**Pedales y Ruedas** es un sistema en Java que simula la gestión de un taller de bicicletas. Permite manejar clientes, bicicletas, servicios y órdenes de forma organizada y escalable, aplicando conceptos de **Programación Orientada a Objetos (POO)**:

- Clases y objetos  
- Atributos y métodos  
- Constructores  
- Relaciones entre clases (composición y agregación)  
- Uso de `ArrayList` para colecciones  

---

## 📁 Estructura del Proyecto
PedalesYRuedas/
│
├─ src/
│ ├─ Bicycle.java
│ ├─ Cliente.java
│ ├─ Repuesto.java
│ ├─ Servicio.java
│ ├─ Orden.java
│ ├─ Taller.java
│ └─ Main.java
│
├─ README.md

---

## 🛠 Clases Principales

### **Bicycle**
- Atributos: `brand`, `model`, `type`  
- Método: `showInfo()` muestra la información de la bicicleta.

### **Cliente**
- Atributos: `nombre`, `email`  
- Método: `mostrarInfo()` muestra información del cliente.

### **Repuesto**
- Atributos: `nombre`, `precio`, `stock`  
- Método: `vender(int cantidad)` disminuye el stock y calcula el costo.

### **Servicio**
- Atributos: `tipoServicio`, `costoBase`, `duracionHoras`  
- Método: `calcularCostoFinal(double descuento)` devuelve el costo final.

### **Orden**
- Relación con: `Cliente`, `Bicycle`, `Servicio`  
- Método: `mostrarResumen()` muestra la información completa de la orden.

### **Taller**
- Clase gestora que maneja todas las órdenes con `ArrayList<Orden>`  
- Métodos: `agregarOrden()`, `mostrarTodasOrdenes()`, `contarOrdenes()`

---

## 🚀 Cómo Ejecutar

1. Copia todos los archivos `.java` en la misma carpeta.  
2. Compila todas las clases:
```bash
javac *.java
