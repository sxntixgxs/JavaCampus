# ARREGLOS
### Matriz o vector
+ Datos homogeneos
+ Acceso ordenado
+ Tamaño dinamico
+ Versatilidad
+ Un arreglo es una variable final por lo que su valor no se puede cambiar una vez creado!!!!
### Syntax
```JAVA
    tipo_dato nombre_array[];
    nombre_array = new tipo_dato[tamanio]; //creamos una instancia de clase array
        //EJ
    char arrayCaracteres[];
    arrayCaracteres = new char[10];
```
### .length
```JAVA

    int[] numeros = {1,2,3,4,5};// no es necesario poner cuianto es su length java lo interpreta de acuerdo con sus valores en este caso tendria 5 elementos
    String[] nombres = new String[3];
    int longitudNumeros = numeros.length;
    int longitudNombres = nombres.length; 