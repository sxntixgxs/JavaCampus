package com.intro;

import java.text.MessageFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int edad;
        double precio;
        String nombre;
        try (Scanner sc = new Scanner(System.in)) { // para poder usar scanner se debe insertar la libreria Scanner
            System.out.println("Ingrese la edad: ");
            edad = sc.nextInt(); // scannea la siguiente tecla q toque el user
            // para limpiar le buffer se recomienda un nextline
            sc.nextLine();
            System.out.println("Ingrese el nombre");
            nombre = sc.nextLine();
            sc.nextLine();
            sc.close();
        }
        System.out.println("Hello world!");

        System.out.println(nombre+" tiene "+edad+" anios ");
        System.out.println(MessageFormat.format("{0} tiene {1} años", nombre,edad));
    }
}