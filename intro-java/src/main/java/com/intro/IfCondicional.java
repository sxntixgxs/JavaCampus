package com.intro;

import java.util.Scanner;

public class IfCondicional {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int edad = 0;
            System.out.println("Ingrese la edad");
            edad = sc.nextInt();
            if (edad>=18) {
                System.out.println("Comestible");
            }else if(edad==17){
                System.out.println("Half-comestible");
            }
            else{
                System.out.println("Non-comestible");
            }
        }
    }
}
