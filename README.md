# Inventario de Vino

## Descripción

Programa desarrollado en Java que simula la gestión de un inventario de botellas de vino. Permite registrar la etiqueta, varietal, precio y cantidad disponible, además de realizar ventas y reponer stock.

## Funcionamiento

La clase `vino` utiliza los siguientes atributos:

- `etiqueta`: nombre o marca del vino.
- `varietal`: tipo de uva del vino.
- `precio`: precio de cada botella.
- `stockBotellas`: cantidad de botellas disponibles.

El constructor recibe los datos iniciales y verifica que el stock no sea negativo. Si se ingresa un valor menor a `0`, el stock se establece automáticamente en `0`.

## Métodos

### `venderBotellas()`

Permite vender una determinada cantidad de botellas. Verifica que la cantidad sea mayor a `0` y que exista suficiente stock. Si no hay suficientes botellas, la venta no se realiza.

### `reponerStock()`

Permite aumentar la cantidad de botellas disponibles. La cantidad a reponer debe ser mayor a `0`.

### `mostrarEstado()`

Muestra por consola la información del vino y el stock actual.

## Ejemplo

El programa comienza con:

- 50 botellas en stock.
- Precio de $8500 por botella.
- Vino Trapiche Medalla, varietal Malbec.

Se venden 12 botellas:

````text
50 - 12 = 38 botellas

````
## Captura de ejecución

<img width="752" height="320" alt="image" src="https://github.com/user-attachments/assets/54fc994a-2106-4f87-82b4-9d6d48ac308c" />






