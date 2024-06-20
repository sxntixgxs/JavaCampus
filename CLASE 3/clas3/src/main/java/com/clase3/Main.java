package com.clase3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Backend");
        list.add(0,"Fundamentos");
        String elemento = list.get(0);
        System.out.println(elemento);
        list.set(0, "Programacion Web");
        String eliminado = list.remove(1);
        System.out.println(eliminado);
        list.add("Pasteleria");
        boolean result = list.remove("Pasteleria");
        System.out.println(result);
        System.out.println(list);
        int size = list.size();
        System.out.println(size); //Output: 2
        boolean isEmpty = list.isEmpty();
        System.out.println(isEmpty);
        boolean contains = list.contains("Mysql");
        System.out.println(contains);
        int index = list.indexOf("Postgres");
        System.out.println(index);//Output: 0
        list.add("Mysql");
        int lastIndex = list.lastIndexOf("Mysql");
        System.out.println(lastIndex);// Output: 2
        Object[] skills = list.toArray();
        System.out.println(Arrays.toString(skills)+" hola hoal ");
        // ------------------------
        ArrayList<String> otraLista = new ArrayList<>(Arrays.asList("Python","Pseint"));
        list.addAll(otraLista);
        System.out.println(list);
        // ------------------
        // System.out.println(list)
    }
}