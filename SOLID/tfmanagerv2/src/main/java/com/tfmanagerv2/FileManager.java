package com.tfmanagerv2;

// import java.io.BufferedReader;
// import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class FileManager {
    private static final String FILE_NAME = "task.txt";
    public static void main(String[] args) {
        Path path, rutaPaquete;
        File archivo;

        try {
            //Obtenemos la ruta del directorio que contiene el archivo JAR o el directorio de clases
            path = Paths.get(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getParent();

            // Mover hacia el directorio del proyecto
            Path projectDir = path.getParent();

            // Construir la ruta relativa del paquete 'src/main/java/com/filemanager/data'
            rutaPaquete = projectDir.resolve(Paths.get("src","main","java","com","taskfilemanager","data"));
            File carpeta = rutaPaquete.toFile();
            archivo = new File(carpeta, FILE_NAME);

            //Si la carpeta data no existe, la creamos
            if(!carpeta.exists()){
                if(carpeta.mkdirs()){
                    System.out.println("Carpeta creada: "+carpeta.getAbsolutePath());
                }else{
                    System.out.println("Error al crear la carpeta. ");
                    return;
                }
            }
            
            //Si el archivo no existe, lo creamos
            if(!archivo.exists()){
                if(archivo.createNewFile()){
                    System.out.println("Archivo de tareas creado :"+archivo.getName());
                }else{
                    System.out.println("Error al crear el archivo de tareas");
                    return;
                }
            }

        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }finally{
            sc.close();
        }
    }
}