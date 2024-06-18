package com.printamatrix;

public class Main {
    public static void main(String[] args) {
        // Declaracion y asignacion simultanea 
        String[][] namesMatrix={{"Jhon","Jones"},{"Ilia","Topuria"}};
        for(int i = 0;i<namesMatrix.length;i++){
            for(int j=0; j<namesMatrix[i].length;j++){
                System.out.println(namesMatrix[i][j]+" ");//imprime cada elemento
            }
            System.out.println();//salto de linea despues de cada fiula
        }
        System.out.println("==============================");
        //esta es la syntax for each de Java
        for(String[] namesMatrix1 : namesMatrix){
            for(String namesMatrix11 : namesMatrix1){
                System.out.println(namesMatrix11+" ");//imprime cada elemento
            }
            System.out.println();//Salto de linea despues de cada fila
        }

        int[] numeros = {1,2,3,4,5,6,8};
        for(int nro:numeros){
            System.out.println("Este es el numero actual "+nro);
        }

    }
}