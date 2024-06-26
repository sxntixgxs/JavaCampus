package com.tfmanagerv2;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class TaskManager {
    // Menú
    Scanner sc = new Scanner(System.in);
    int choice;
    do {
        System.out.println("\nGestor de tareas");
        System.out.println("1. Agregar tarea");
        System.out.println("2. Listar tareas");
        System.out.println("3. Buscar tarea");
        System.out.println("4. Eliminar tarea");
        System.out.println("5. Salir");
        System.out.println("Seleccionar una opción: ");
        choice = sc.nextInt();
        sc.nextLine();

        switch(choice){
            case 1:
                System.out.println("Ingrese la tarea a agregar: ");
        }
    }while(choice!=5);


    public static void agregarTarea(File archivo, String tarea){
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo,)))
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
