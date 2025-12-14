# Taller de Bicicletas "Pedales y Ruedas" - Semana 04: Herencia

## 📋 Información General
- **Semana:** 04 - Herencia  
- **Dominio:** Taller de Reparación y Venta de Bicicletas  
- **Estudiante:** Daniel Camilo Ospino Rodriguez  
- **Ficha:** 3228970B  
- **Objetivo:** Aplicar herencia y polimorfismo en la gestión de empleados del taller.

---

## 📝 Clases Implementadas

### Clase Padre: Empleado
- **Atributos:** nombre, identificacion, salarioBase
- **Métodos:** mostrarInfo(), calcularSalario()
- **Descripción:** Clase base para todos los empleados del taller.

### Subclase: EmpleadoPlanta
- **Atributos adicionales:** anosAntiguedad
- **Métodos sobrescritos:** calcularSalario() → incluye bono por antigüedad
- **Descripción:** Representa a los mecánicos fijos del taller.

### Subclase: EmpleadoContrato
- **Atributos adicionales:** mesesContrato
- **Métodos sobrescritos:** calcularSalario() → salario base sin bonos
- **Descripción:** Representa a los mecánicos contratistas.

---

## 🧩 Relación y Herencia
``
