# SpeedFast — Sistema de Reparto a Domicilio

Actividad formativa **Semana 1 — Desarrollo Orientado a Objetos II**
*"Explorando la sobrecarga y sobreescritura en clases derivadas"*

## Descripción

Sistema en Java para **SpeedFast**, empresa de reparto a domicilio con tres tipos de servicio: **Comida**, **Encomiendas** y **Compras Express**. Cada tipo de pedido tiene un criterio distinto de asignación de repartidor, resuelto mediante **polimorfismo**.

## Criterios de asignación por tipo de pedido

| Tipo de pedido | Criterio de asignación |
|---|---|
| Comida | Requiere repartidor con **mochila térmica**. |
| Encomienda | Requiere **validación de peso y embalaje**. |
| Compra Express | Se asigna al **repartidor más cercano** con disponibilidad. |

## Conceptos de POO aplicados

- **Herencia:** las tres subclases heredan de la clase base `Pedido`.
- **Encapsulamiento:** todos los atributos son `private` con getters y setters.
- **Sobreescritura (override):** cada subclase redefine `asignarRepartidor()`.
- **Sobrecarga (overload):** cada subclase agrega `asignarRepartidor(String nombreRepartidor)`.
- **Polimorfismo:** en `Main` las subclases se recorren mediante referencias del tipo base `Pedido`.

## Estructura
