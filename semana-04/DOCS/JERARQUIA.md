# Jerarquía de Clases - Semana 04

## Diagrama
  Empleado
     |
+----+----+
|         |
EmpleadoPlanta  EmpleadoContrato

## Justificación
Se eligió esta jerarquía porque todos los empleados del taller comparten atributos básicos como nombre, identificación y salario base. Las subclases permiten diferenciar el tipo de empleado y aplicar cálculos de salario específicos.

## Atributos Heredados
- nombre (String)
- identificacion (String)
- salarioBase (double)

## Métodos Sobrescritos
- calcularSalario(): 
    - EmpleadoPlanta: incluye bono por antigüedad
    - EmpleadoContrato: salario base sin bonos
