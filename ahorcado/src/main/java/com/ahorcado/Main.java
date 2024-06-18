package com.ahorcado;

import java.util.ArrayList;
import java.util.Random;
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
        for (String palabra : listaPalabras) {
            System.out.println(palabra);

        }
    }

}