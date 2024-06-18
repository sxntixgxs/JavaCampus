# Crear objeto a partir de la clase String 
```JAVA
String sanoS = "diavlo";// It's saved in the String Pool and if there is another "diavlo" stored, it'll be not duplicated, just references the same memory slot
String sanoF = new String();
sano = "diavlo";//It's different because you are creating an instance of the class, so, even though the string "diavlo" is already stored in memory, it will not point at the same place but will be saved in a different place
//Conclusion SanoF == SanoS || FALSE
// Creating an Object for a String is not optimal and recommended.
```
# Metodos String
```JAVA
    //equalsIgnoreCase 
    String cadena1 = "pepe";
    String cadena2 = "cadena";
    if(cadena1.equalsIgnoreCase(cadena2))//evalua ignorando mayusculas


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
