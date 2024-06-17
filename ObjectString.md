# Crear objeto a partir de la clase String 
+ String sano = new String(); // buscar para que sirve un objeto de tipo cadena


# Metodos String
```JAVA
    String cadena = "abc";
    cadena.charAt(indice);
    "abc".charAt(1);
    // faltan unos 3 revisar doc classroom
    // conversion cadenas
    String piStr = "3.14159";
    float pi = Float.valueOf(piStr);//hacemos uso del metodo valueOf de la clase Float
    //subcadena
    String str = "El lenguaje Java";
    String subStr = str.substring(12);
    //subcadena resultante: Java
    String subStr=str.substring(3,11)
    //resultado: lenguaje
```
# Conversiones
## Implicitas
+ Implicitament epuedo convertir un entero a double, no tengo que hacer uso de metodos basicamente
```JAVA
    int numeroEntero = 10;
    double numeroDouble = numeroEntero;
```
## Explicitas
+ No puedo convertir un doble a un entero **casting** **parsing**

## Classes Wrappers
+ Permite trabajar con objetos primitivos
```JAVA
Float.valueOf(variable)//Float seria la clase Wrapper
```
## Mutabilidad

```JAVA
    String inmutableStr="Hola";
    inmutableStr = inmutableStr.concat(", mundo!");
    System.out.println(inmutableStr);//Salida: Hola
```
