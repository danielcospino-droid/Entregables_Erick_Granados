# Mejoras Aplicadas — Semana 03

## 1. Encapsulación Aplicada
Se encapsularon todos los atributos de cada clase usando `private` y se implementaron **getters** y **setters** con validaciones para garantizar integridad de los datos.

| Clase       | Atributos Encapsulados          | Validaciones Clave                                  | Métodos Auxiliares Privados         |
|------------|--------------------------------|---------------------------------------------------|-----------------------------------|
| **Bicycle** | brand, model, type, year       | - `brand` y `type` no nulos ni vacíos <br> - `model` por defecto `"Desconocido"` si vacío <br> - `year` entre 1900 y 2030 | `validarString()`                  |
| **Cliente** | nombre, email, telefono        | - `nombre` obligatorio <br> - `email` debe contener `"@"` <br> - `telefono` por defecto `"Sin teléfono"` si no se proporciona | `validarEmail()`                   |
| **Servicio** | tipoServicio, costoBase, duracionHoras | - `tipoServicio` obligatorio <br> - `costoBase ≥ 0` <br> - `duracionHoras ≥ 1` | `validarTipo()`                    |
| **Orden**   | cliente, bicicleta, servicio   | - Ninguno de los objetos puede ser nulo         | Validación directamente en setters |
| **Taller**  | nombre, ordenes                | - `nombre` obligatorio, por defecto `"Taller sin nombre"` <br> - Se valida que Orden no sea nula al agregarla | No aplica                         |

## 2. Constructores Sobrecargados
Permiten crear objetos con distintos niveles de detalle según la información disponible:

| Clase       | Constructor Completo                                 | Constructor Parcial                                   | Constructor Mínimo                             |
|------------|----------------------------------------------------|----------------------------------------------------|-----------------------------------------------|
| **Bicycle** | `Bicycle(String brand, String model, String type, int year)` | `Bicycle(String brand, String model, String type)` (año por defecto) | `Bicycle(String brand)` (model y type por defecto) |
| **Cliente** | `Cliente(String nombre, String email, String telefono)` | `Cliente(String nombre, String email)` (telefono por defecto) | `Cliente(String nombre)` (email generado automáticamente) |
| **Servicio** | `Servicio(String tipoServicio, double costoBase, int duracionHoras)` | `Servicio(String tipoServicio, double costoBase)` (duración por defecto = 1 hora) | No se definió constructor mínimo explícito     |

## 3. Beneficios Logrados

1. **Encapsulación completa**  
   Evita acceso directo a los atributos, protegiendo la información y garantizando que se cumplan reglas internas de cada clase.

2. **Validaciones robustas**  
   Previenen errores al crear o modificar objetos, asegurando coherencia y estabilidad en la ejecución del programa.

3. **Sobrecarga de constructores**  
   Facilita la creación de objetos con distintos niveles de detalle, haciendo el código más flexible y legible.

4. **Mantenimiento más fácil**  
   Los cambios en la validación o reglas de negocio se centralizan dentro de la clase correspondiente.

5. **Código limpio y profesional**  
   Se siguen buenas prácticas de POO, mejorando la legibilidad y la escalabilidad del proyecto.
