package com.ahorcado;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String palabra1 = "Diablo";
        String palabra2 = "Menor";
        String palabra3 = "Leopardo";
        String palabra4 = "Campeon";
        String palabra5 = "Perdedor";
        String palabra6 = "Rolo";
        String palabra7 = "Teclado";
        String palabra8 = "Televisor";
        String palabra9 = "Perro";
        String palabra10 = "Gato";
        ArrayList<String> listaPalabras = new ArrayList<>();
        listaPalabras.add(palabra1);
        listaPalabras.add(palabra2);
        listaPalabras.add(palabra3);
        listaPalabras.add(palabra4);
        listaPalabras.add(palabra5);
        listaPalabras.add(palabra6);
        listaPalabras.add(palabra7);
        listaPalabras.add(palabra8);
        listaPalabras.add(palabra9);
        listaPalabras.add(palabra10);
        Random numPalabra = new Random();
        //String // usar charAt
        String palabraStart = listaPalabras.get(numPalabra.nextInt(10));
        System.out.println(palabraStart);
        int i=0;
        ArrayList<String> palabraLista = new ArrayList<>(); 
        while (i<palabraStart.length()) {
            char caracter = palabraStart.charAt(i);
            palabraLista.add(String.valueOf(caracter));
            i++;
        }  
        System.out.println(palabraLista);
        System.out.println("Longitud de palabra: "+palabraStart.length());
        // for (String palabra : listaPalabras) {
        //     System.out.println(palabra + " " + numPalabra.nextInt(6));
        // }
        try(Scanner sc = new Scanner(System.in)){
            int vidas=3;
            while (vidas>0) {
                System.out.println("TIENES "+vidas +" INTENTOS");
                System.out.println("Para empezar oprime cualquier tecla");    
                sc.nextLine();
                System.out.println("Adivina qué palabra es");
                ArrayList<String> guessingList = new ArrayList<>();
                for (String elemento : palabraLista) {
                    System.out.print(" _ ");
                    guessingList.add("_");
                }
                sc.nextLine();
                System.out.println("Ingresa la palabra abajo");
                String palabraIngresada = sc.nextLine();

                if (palabraIngresada.length()>palabraLista.size()) {
                    System.out.println("La palabra ingresada es más grande");
                    System.out.println("Igual, perdiste una vida :$");
                    vidas--;
                    System.out.println("Vidas restantes: "+(vidas));
                } else if(palabraIngresada.length()<palabraLista.size()){
                    System.out.println("La palabra ingresada es menor");
                    System.out.println("Igual, perdiste una vida :$");
                    vidas--;
                    System.out.println("Vidas restantes: "+(vidas));
                }else{
                    System.out.print("Ingresaste "+palabraIngresada+" ");
                    ArrayList<String> tryList = new ArrayList<>(); 
                    int k=0;
                    while (k<palabraIngresada.length()) {
                        char character = palabraIngresada.charAt(k);
                        tryList.add(String.valueOf(character));
                        k++;
                    
                    //comparar palabras
                    //lista para almacenar index
                        for (String letraT : tryList) {
                            for (String letraP : palabraLista) {
                                if(letraP==letraT){
                                    int indice = palabraLista.indexOf(letraP);
                                    guessingList.set(indice,letraP);
                                }
                            }
                        } 

                    // for (String blanket : guessingList) {

                    //     guessingList.set(i, palabraTry)
                    // }
                    if(palabraLista==palabraIngresada){
                        System.out.println("Ganaste");
                    }
                    vidas--;
                    }
                }

            }

        }
    }

}