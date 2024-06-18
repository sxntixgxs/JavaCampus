package com.intro;
import java.text.Format;
import java.text.MessageFormat;
import java.util.Scanner;
public class EjContadorFOR {
    public static void main(String[] args) {
        int edad;
        int valor = 0;
        int acum = 0;
        int nrosInvalidos = 0;
        int nrosValidos = 0;
        try(Scanner sc = new Scanner(System.in)){
            for(int i=0;i<=3;i++){
                System.out.println("Ingrese un valor mayor a 0: ");
                valor = sc.nextInt();
                sc.nextLine();
                if (valor<0) {
                    nrosInvalidos++;
                    continue;//est econtinue hace que salte a la siguiente iteracion por lo cual no hace el resto del bloque
                }
                nrosValidos++;
                acum+=valor;
            }
        }
        System.out.println(MessageFormat.format("La suma de los numeros ingresados es {0} y se contaron {1} numeros negativos y  {2} numeros positivos",acum,nrosInvalidos,nrosValidos));
    }
}
