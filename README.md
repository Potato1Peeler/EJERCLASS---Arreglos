# EJERCLASS---Arreglos

Python:

Lo que hace este programa en Python es crear un arreglo bidimensional que muestra las ventas de 12 meses de varios departamentos (Ropa, Deporte, Jugueteria), dentro del código hay varios métodos para utilizar diferentes funciones como buscar y/o eliminar datos en la matriz de las ventas, por ejemplo:

El metodo "encontrar_indice" lo que hace es buscar un indice en la lista e igualarlo, si son iguales devuelve el dato del indice y en dado caso de que no lo encuentre lanza un eror.

El método “poner_ventas_mensuales” lo que hace es analizar que el departamento y mes dado existan dentro del arreglo y en dado caso que no lanzar un error, por otro lado, también nos permite agregar datos al arreglo teniendo en cuenta el mes y departamento.

El método “buscar_ventas” lo que hace es dar hincapié a una función que hace que dependiendo del índice de mes y departamento imprima un dato antes dado
El método “eliminar_ventas” lo que hace es dependiendo de un índice de mes y departamento reemplazara todos los datos del mes y departamento con un valor de 0, siendo esto la funciona de eliminar los datos.

El método “matriz_ventas” lo que hace es formar la matriz con una estructura y le da formato separando los números para se vea estético.

Lo del código en Python pregunta los datos requeridos para así utilizar los métodos anteriores dados e imprime la matriz entera luego de las operaciones haciendo que el programa corra correctamente

JAVA:

De la misma forma en java el programa es un arreglo bidimensional que busca las ventas de la misma forma que Python con los mismos parámetros, osease el mes y departamento en el que se hicieron las ventas y de la misma forma contiene métodos para buscar un elemento y eliminar elementos de los departamentos

“private int encontrarIndice(String[] vector, String dato)” El método busca un índice de un dato en el arreglo y muestra un error si este no se encuentra.

“public void ponerVentasMensuales(String departamento, Map<String, Integer> ventasMensuales)” El método pone los datos de ventas mensuales en los departamentos correspondientes y además verifica que el departamento y mes sean validos y en dado caso que no lanza un error.

“public int buscarVentas(String mes, String departamento)” El método intenta encontrar las ventas para un departamento especifico con un índice antes dado por el usuario

“public void eliminarVentas(String departamento)” El método entra a un departamento que el usuario antes haya especificado y reemplaza con 0 los elementos de ese departamento dentro de la matriz 

“public void matrizVentas()” El método imprime la matriz de las ventas y los departamentos con formato tabular para que se vea estético.

El resto del código de java ingresa los valores de la matriz de ventas y crea instancias en las cuales se preguntará al usuario por el mes y departamento a buscar con el método usado o elimina las ventas de un departamento en específico con el método creado.

