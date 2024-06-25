package com.filemanager;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
public class OtroEjemplo {
//io hace referencia a IN y OUT
    public static void main(String[] args) {
        try {
            File variableArchivo = new File("data.txt");// solo estamos creanddo un objeto en esta linea
            FileWriter writer = new FileWriter(variableArchivo,true);//write() //flush para eliminar flujo de datos buffer //close se supone que se guarda de forma automatica
            PrintWriter pw = new PrintWriter(variableArchivo);
            pw.println("Esto es una linea de texto");//escribe o sobreescribe
            pw.append("Esta es otra linea de texto");//con append añade pero puede sobreescribir? normalmente sobreescribe
            //si quiero añadir info nueva lo puedo establecer con el constructor de FileWriter con un ,true
            pw.close();
        } catch (Exception e) {
            System.out.println("No se pudo crear el archivo");
        }
    }
}
