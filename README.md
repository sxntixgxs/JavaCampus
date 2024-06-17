# JavaCampus

```
java --version
```
# Como crear un proyecto Java en VSCode
+ abrir paleta comandos ctrl shift p
+ java create project
+ maven
+ no architecture pq estamos trabajando de forma natica
+ el input lo correcto es com.nombrecompañia -- vamos a poner com.intro mayuscula solo las clases
+ seleccionar destination folder

+ Cuando un metodo es void significa que no va a retornar nadA?

+ static es poder acceder al metodo sin hacer uso de una instancia de la clase
+ println impresion con salto de linea
+ archivo pom.xml permite ver la estructura / configuracion del proyecto

+ en la parte de abajo en Java Proyects nos deja ver info del proyecto; ahí se pueden crear clases, paquetes, etc.

+ debajo de ello está maven que es donde se pueden instalar dependencias, ... del proyecto

+ para crear un metodo main facilmente solo se escribe psvm dentro de la clase
+ el system.out.println se escribe sout

+ scop de variable = global y local
+ local, se define dentro de un metodoo dentro de la misma clase

+ tipos de datos referenciados --objetos-- Clases, Interfaces, Arreglos
+ es muy importasnte conocer los tipos dedatos enteros y cuanto espacio ocupan en memoria byte, short, int, long
+ tipos de datos flotantes float, double, char-almacena caracteres unicode 16 bits-

+ caracteres de escape en un String
    + /t insertar tabulador
    + /b inserta retroceso backspace
    + /n nueva linea
    + /r inserta un retorno de carro
    + /f mueve a la siguiente pagina -form feed
    + /' inserta una comilla ismple

+ declaracion de variables en Java
    + cuando se crea la variable pero no se le asigna ningun dato ej int variable;
+ definicion
    + cuando se define que valor tiene esa variable ej precio = 2000;
+ concatenacion
    + usasndo el operador **+** o el metodo concat()
+ formateo de string
    ```JAVA
            System.out.println(MessageFormat.format("{0} tiene {1} años", nombre,edad));
    ```
+ Scanner se escribe y aparece error, con la linternita genera automaticamente el try **deben ir dentro de un try**
+ para poder usar scanner se debe insertar la libreria Scanner
    ```JAVA
    import java.util.Scanner;
    ```

+ estructuras de control
    + if
    ```JAVA
        if(condicion){
            //then
        }
    ```
    + 
+ acumulador se recomienda que debe iniciar en 0 