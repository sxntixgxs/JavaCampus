package com.intro;

import java.util.Scanner;

public class SwitchCondicional {
    public static void main(String[] args) {
        int dia;
        try(Scanner sn = new Scanner(System.in)){
            System.out.println("Ingrese día de la semana");
            dia = sn.nextInt();
            switch (dia) {
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Lunes");
                    break;
                default:
                    break; // recomendabe que siempre haya un default
            }
        }
    }
}
