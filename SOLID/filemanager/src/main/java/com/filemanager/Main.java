package com.filemanager;

//Creación y manejo de archivos y directorios
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {
    public static void main(String[] args) {
        //Creamos el objeto File, luego de importar su clase java.io.File
        // File archivo = new File("data/mensajes.txt");

        Path path, rutaPaquete;//Crea dos variables `path` y `rutaPaquete` de tipo Path
        // String pack = "src/main/java/com/filemanager/data";//Package path where is going to be the file
        String file = "content.txt"; //file name


        // //Para crear la carpeta del paquete 'data' creamos un objeto File
        // File carpeta = new File(pack);//creamos objeto carpeta de la clase File 
        // File archivo = new File(file);//creamos objeto archivo de la clase File

        //Para crear el archivo usamos el method createNewFile() de File
        try {
            // if (archivo.createNewFile()) {
            //     System.out.println("Archivo creado: "+archivo.getName());
            // }else{
            //     System.out.println("Archivo ya existe! ");
            // }
                path = Paths.get(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getParent();
                    //mueve el "pointer" hacia el directorio del proyecto
                    // se asume que la estructura del proyecto es estandar
                    /// obtiene el directorio donde se encuentra .class ? y luego obtiene el directorio padre
                Path projectDir = path.getParent(); // Path es una interfaz por lo que no se instancia normalmente sino se usan factory methods en este caso .get
                rutaPaquete = projectDir.resolve(Paths.get("src", "main","java","com","filemanager"/* ,"data"*/));
                File carpeta = rutaPaquete.toFile();
                File archivo = new File(carpeta,file);
                try {
                    if (archivo.createNewFile()) {
                        System.out.println("Archivo creado :"+archivo.getName());
                    }else{
                        System.out.println("El archivo ya existe");
                    }
                } catch (IOException e) {
                    System.out.println("Ocurrió un error");
                    e.printStackTrace();
                }
        } 
        catch (URISyntaxException e) {
        //     System.out.println("Ocurrió un error: ");
             e.printStackTrace();//mostrar error
         }
    }
}
/*
 * 1. Paquete e Importaciones:
Define el paquete com.filemanager .
Importa las clases necesarias para trabajar con archivos, excepciones y rutas ( File ,
IOException , URISyntaxException , Path , Paths ).
2. Obtener la Ruta del Directorio del Proyecto:
Utiliza
Main.class.getProtectionDomain().getCodeSource().getLocation().toURI() para
obtener la ubicación del archivo JAR o el directorio de clases.
Obtiene la ruta padre del directorio del proyecto.
3. Construir la Ruta Relativa del Paquete:
Construye la ruta relativa hacia src/main/java/com/filemanager/data usando
Paths.get y resolve .
4. Crear el Directorio y el Archivo:
Convierte la ruta en un objeto File .
Si el directorio no existe, lo crea.
Intenta crear un archivo llamado contenido.txt en el directorio especificado.
Imprime mensajes indicando si el archivo fue creado o si ya existía.
5. Manejo de Excepciones:
Captura y maneja las excepciones IOException y URISyntaxException imprimiendo la
traza del error si ocurre.
 */