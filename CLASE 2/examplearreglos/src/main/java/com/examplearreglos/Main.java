package com.examplearreglos;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        //Añadir elementos
        //Para usar ArrayList se debe importar laa clase
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Estudiante> lEstudiantes = new ArrayList<>();//Arreglo de Objetos
        list.add("Backend");

        list.add(0,"Fundamentos");//añade fundamentos en la posicion que yo ordeno
        // este index debe estar dentro del rango del limite  del arreglo, es decir que no supere el tamaño

        // System.out.println(list);

        //GET
        //me obtiene el elemento que está en el indice que le paso por parametro
        String elemento = list.get(0);
        

        //SET
        list.set(0,"Programacion WEB");


        System.out.println(elemento);
        System.out.println(list);
        // revisar remove con variable temporal ...



        list.add("Pasteleria");
        // boolean result = list.remove("Pasteleria"); //remove usa tambien indice!

        // System.out.println(result);

        // clear() elimina todo el contenido que tenemos en la lista
        // list.clear();
        // System.out.println(list);
        //Ciclo for para recorrer la lista
        for(String item : list){
            System.out.println(item);
        }
    }
}