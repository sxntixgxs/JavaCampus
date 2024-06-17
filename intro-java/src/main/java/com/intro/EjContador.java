package com.intro;
import java.text.MessageFormat;
import java.util.Scanner;
public class EjContador {
    public static void main(String[] args) {
        int valor = 0;
        int acum = 0;
        try(Scanner sc = new Scanner(System.in)){
            while(valor>=0){
                System.out.println("Ingrese un valor mayor a 0: ");
                valor = sc.nextInt();
                sc.nextLine();
                if (valor<0) {
                    System.out.println("Valor <0; finalizado");
                    break;//el break finaliza el ciclo
                    //el continue se salta el codigo siguiente y se va a la siguiente iteracion
                }
                acum+=valor;
            }
        }
        System.out.println(MessageFormat.format("La suma de los numeros ingresados es {0}", acum));
    }
}
