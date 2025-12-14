# Taller de Bicicletas "Pedales y Ruedas" - Semana 05: Polimorfismo

## 📋 Información General
- **Semana:** 05 - Polimorfismo  
- **Dominio:** Taller de Reparación y Venta de Bicicletas  
- **Estudiante:** Daniel Camilo Ospino Rodriguez  
- **Ficha:** 3228970B  
- **Objetivo:** Implementar polimorfismo mediante sobrecarga y sobrescritura de métodos, usando arrays y ArrayList polimórficos.

---

## 🎯 Objetivos de la Semana
- Aplicar **sobrecarga de métodos** (mismo nombre, diferentes parámetros)  
- Implementar **sobrescritura de métodos** usando `@Override`  
- Demostrar **polimorfismo dinámico** (dynamic binding)  
- Usar **arrays o ArrayList polimórficos**  
- Crear métodos genéricos que trabajen con la clase padre

---

## 📝 Ejercicios Semanales
### Ejercicio 1: Sobrecarga de Métodos (25 pts)
- Mínimo 2 métodos con el mismo nombre pero diferentes parámetros  
- Ejemplo:
```java
public class Taller {
    public void registrarBicicleta(String serial) { ... }
    public void registrarBicicleta(String serial, String propietario) { ... }
    public void registrarBicicleta(String serial, String propietario, String tipo) { ... }
}
