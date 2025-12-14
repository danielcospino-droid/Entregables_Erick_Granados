# Semana 01 - Introducción al Paradigma Orientado a Objetos

**Estudiante:** Daniel Camilo Ospino Rodriguez  
**Ficha:** 3228970B  
**Dominio Asignado:** Taller de Bicicletas "Pedales y Ruedas"

---

## 📋 Contexto del Dominio

**Tipo de Negocio:** Taller de Reparación y Venta de Bicicletas  
**Nombre Comercial:** Pedales y Ruedas  
**Ubicación:** Bogotá, Localidad de Teusaquillo  
**Especialidad:** Mantenimiento, reparación y venta de bicicletas y accesorios

### Descripción Breve
Pedales y Ruedas es un taller especializado en bicicletas que ofrece servicios de mantenimiento, reparación, venta de repuestos y accesorios. Cuenta con 5 mecánicos especializados y atiende aproximadamente 40 clientes semanales.

---

## 🎯 Objetivos de la Semana 01

Al finalizar esta semana, deberás ser capaz de:

1. Identificar objetos del mundo real en el contexto de un taller de bicicletas
2. Comprender las diferencias entre programación estructurada y POO
3. Reconocer los conceptos fundamentales: clase, objeto, atributo, método
4. Crear tu primera clase simple en Java aplicada al dominio

---

## 📝 Actividades Obligatorias

### Actividad 1: Identificación de Objetos (Ejercicio 01)

**Instrucciones:**
- Lee el material teórico de la semana sobre conceptos fundamentales de POO
- Identifica **5 objetos principales** que existen en un taller de bicicletas
- Para cada objeto, describe:
  - ¿Qué es? (definición)
  - ¿Qué características tiene? (atributos)
  - ¿Qué puede hacer? (comportamientos/métodos)

**Ejemplo:**
```
Objeto: Bicicleta
- ¿Qué es?: Un vehículo de dos ruedas que ingresa al taller para servicio
- Características: marca, modelo, tipo (MTB, ruta, urbana), color, número de serial
- Comportamientos: registrar ingreso, diagnosticar, asignar servicio, calcular costo
```

**Entregable:** Documento con la identificación de 5 objetos del dominio del taller de bicicletas.

---

### Actividad 2: Comparación de Paradigmas (Ejercicio 02)

**Instrucciones:**
- Investiga las diferencias entre programación estructurada y POO
- Escribe un ejemplo conceptual de cómo se manejaría la información de una bicicleta en:
  1. **Programación estructurada** (usando variables sueltas y funciones)
  2. **Programación orientada a objetos** (usando una clase)

**Entregable:** Documento comparativo con ejemplos explicados.

---

### Actividad 3: Primera Clase Simple (Ejercicio 03)

**Instrucciones:**
Crea tu primera clase en Java llamada `Bicycle` (Bicicleta) con:
- **3 atributos** (ej: `brand`, `model`, `type`)
- **1 constructor** que inicialice los atributos
- **1 método** que muestre la información de la bicicleta

**Código de ejemplo:**

```java
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
    
    // Método para mostrar información
    public void showInfo() {
        System.out.println("Marca: " + brand);
        System.out.println("Modelo: " + model);
        System.out.println("Tipo: " + type);
    }
}
```

**Instrucciones adicionales:**
1. Crea una clase `Main` con el método `main`
2. Instancia **3 objetos diferentes** de tipo `Bicycle`
3. Llama al método `showInfo()` para cada objeto

**Entregable:** Archivo `Bicycle.java` y `Main.java` funcionando correctamente.

---

### Actividad 4: Múltiples Objetos (Ejercicio 04)

**Instrucciones:**
Amplía el ejercicio anterior:
- Crea al menos **5 objetos** de tipo `Bicycle` con datos diferentes
- Cada bicicleta debe tener información coherente con un taller real
- Muestra la información de todas las bicicletas

**Ejemplo de datos:**
- Trek, Marlin 7, MTB
- Specialized, Allez, Ruta
- Giant, Escape 3, Urbana
- Scott, Spark 900, MTB
- Cannondale, CAAD13, Ruta

**Entregable:** Código Java con 5 instancias de `Bicycle` y su salida en consola.

---

## 🎓 Criterios de Evaluación

| Criterio | Peso | Descripción |
|----------|------|-------------|
| **Identificación de objetos** | 25% | Objetos identificados son relevantes al dominio del taller de bicicletas |
| **Comprensión conceptual** | 25% | Demuestra entender diferencias entre paradigmas |
| **Implementación de clase** | 30% | Clase `Bicycle` implementada correctamente con atributos, constructor y método |
| **Instanciación de objetos** | 20% | Crea múltiples objetos con datos coherentes |

---

## 📚 Recursos de Apoyo

### Material Teórico (Carpeta `1-teoria/`)
- `01-historia-evolucion-poo.md`
- `02-paradigmas-programacion.md`
- `03-conceptos-fundamentales-poo.md`
- `04-primer-programa-poo.md`

### Ejercicios Guiados (Carpeta `2-practica/`)
- `ejercicio-01-comparacion-paradigmas/`
- `ejercicio-02-primera-clase/`
- `ejercicio-03-multiples-objetos/`
- `ejercicio-04-modelado-mundo-real/`

### Glosario
Revisa el archivo `3-recursos/glosario.md` para términos clave de esta semana.

---

## 💡 Consejos

1. **No te compliques:** Esta semana es sobre conceptos básicos, no sobre código complejo
2. **Piensa en objetos reales:** Visualiza cómo funciona un taller de bicicletas real
3. **Pregunta:** Si tienes dudas sobre el dominio o los conceptos, consulta con el instructor
4. **Compila y prueba:** Asegúrate de que tu código compile antes de entregar

---

## 📅 Fecha de Entrega

**Entrega:** Según calendario definido por el instructor  
**Formato:** Código fuente (.java) y documentos en formato Markdown o PDF

---

**Nota Importante:** Este es tu dominio personal para todo el bootcamp. Todas las actividades futuras seguirán en el contexto del taller de bicicletas Pedales y Ruedas. No compartas tu código directamente con otros estudiantes, ya que cada uno tiene un dominio diferente.
