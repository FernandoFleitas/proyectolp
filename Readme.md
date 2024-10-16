# Simulador de Sistema Bancario

## Descripción del Proyecto

Este proyecto es un **simulador de sistema de web banking** desarrollado como parte del examen final de la materia Programación II. El sistema permite simular varios procesos bancarios clave, como depósitos, transferencias, consulta de saldo, pagos de servicios y pagos de tarjetas de crédito. Está implementado en **Java** utilizando el concepto de **hilos (threads)** para simular operaciones en tiempo real.


## Funcionalidades

1. **Depósito en cuenta** : Permite al usuario simular el depósito de efectivo en una cuenta seleccionada, incrementando el saldo de la cuenta.
2. **Transferencia entre cuentas** : Simula la transferencia de fondos entre una cuenta origen y una cuenta destino (que puede ser del mismo usuario o de terceros). El saldo de la cuenta origen se reduce y el de la cuenta destino se incrementa.
3. **Consulta de saldo** : El usuario puede consultar el saldo disponible de su cuenta en cualquier momento, y se actualiza después de cada operación.
4. **Pago de servicios** : El usuario puede pagar servicios seleccionando de una lista o ingresando un código, y especificando el monto a abonar, lo cual disminuye el saldo de su cuenta.
5. **Validación de PIN de cuenta** : Todas las operaciones requieren la validación del PIN de la cuenta.
6. **Validación de PIN de transacción** : Las transferencias y pagos de servicios requieren la validación adicional de un PIN de transacción.
7. **Pago de tarjeta de crédito** : Permite al usuario pagar el saldo de su tarjeta de crédito, descontando el monto del saldo de la cuenta asociada.

## Requisitos

* **Java 8 o superior**
* Sistema operativo compatible con JVM (Windows, MacOS, Linux)
* Opcional: **Base de datos** para almacenar información de cuentas y transacciones (se incluye un archivo `.sql` con los scripts necesarios).
