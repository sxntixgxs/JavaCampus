package com.examplearreglos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class $JOptionPane {


    public static void main(String[] args) {
        ArrayList<Estudiante> lEstudiantes = new ArrayList<>();
        // Estudiante student = new Estudiante();
        Estudiante student;

            try(Scanner sc = new Scanner(System.in)){
                while(JOptionPane.showConfirmDialog(null,"Quiere agregar un estudiante","Informacion",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE)==0){
                student = new Estudiante();
                // comentar o descomentar para probar, esta forma  seria con el sout clasico
                System.out.println("Ingrese el nombre del estudiante");
                student.setNombre(sc.nextLine());
                System.out.println("Press any key to continue");
                sc.nextLine();
                System.out.println("Ingrese el apellido");
                student.setApellido(sc.nextLine());
                System.out.println("Press any key to continue");
                sc.nextLine();
                System.out.println("Ingrese la edad");
                student.setEdad(sc.nextInt());
                sc.nextLine();
                lEstudiantes.add(student);

                //JOPtion pane forma
                // student.setNombre(JOptionPane.showInputDialog("Ingrese su nombre"));
                // student.setApellido(JOptionPane.showInputDialog("Ingrese su apellido"));

            }
        }
        for (Estudiante estudiante : lEstudiantes) {
            System.out.println(estudiante.getNombre());
        }

    }
}
