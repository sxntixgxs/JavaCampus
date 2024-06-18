# Matriz
#### Arreglo con 2 dimensiones
```JAVA
// Declaracion de una matriz con 2 filas y 3 columnas
int[][] myMatriz = new int[2][3];


//Declaracion y definicion simultanea
String[][] namesMatriz = {{"Jhon","Jones"},{"Danna","White"}};// no es necesario definir el tamñao de la matriz, solamente los tipos de datos

int numRows = myMatriz.length; //asi se accede a las filas
int numCol = myMatriz[0].length; //asi se accede a las columnas
```

## Recorrer una matriz ciclo for

```JAVA
//FOR EACH
String[][] namesMatrix={{"Jhon","Jones"},{"Ilia","Topuria"}};
for(int i = 0;i<namesMatrix.length;i++){
    for(int j=0; j<namesMatrix[i].length;j++){
        System.out.println(namesMatrix[i][j]+" ");//imprime cada elemento
    }
    System.out.println();//salto de linea despues de cada fiula
}
```

## Recorrer una matriz FOR EACH
```JAVA
    //FOR EACH
    for(TipoElemento elemento:colecciondatos){
        //codigo donde se usa elemento
    }
    // elemento es una variable usada para referirse al elemento actual de cada iteración
    // cada elemento de la coleccion se asignara a esta variable en cada iteración del bucle.
```
+ ## Ejemplo
```JAVA

int[] numeros = {1,2,3,4,5,6,8};
for(int nro:numeros){ //tipo elemento no se debe poner como array, el dato mas basico ya que es el tipo de dato del elemento nro en este caso
    System.out.println("Este es el numero actual "+nro);
}
```