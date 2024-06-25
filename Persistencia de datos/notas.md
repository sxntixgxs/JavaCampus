# Persistencia de datos / manejo archivos

## Tipos de archivos
+ Estandar: docs,imgs,audio,video,etc
+ Carpeta
+ Especiales: DRIVERS

## Apertura y cierre de archivos en JAVA
### Clase FIle
+ Clase encargada de la manipulación de archivos
+ File se usa para crear el buffer o archivo
+ FileWriter se usa para que ese archivo se vuelva un archivo de escritura... //write() //flush para eliminar flujo de datos buffer //close se supone que se guarda de forma automatica
+ PrintWritter para poder escribir sobre el archivo se usa una instancia de esta clase...

### FileReader y BufferedReader
```JAVA

File archivo = null;
FileReader reader = null;
BufferedReader buffer = null;
try{
    javax.swing.JFileChooser J = new javax.swing.JFileChooser();
    J.showOpenDialog(j);
    String path = j.getSelectedfile().getAbsolutePath();
    archivo = new File(path);
    reader = new FileReader(archivo);
    buffer = new BufferedReader(reader);
    String linea;
    while ((linea = buffer.readLine()) != null){
        System.out.println(linea);
    }
}catch(Exception e){
    e.printStackTrace();
}finally{
    try{
        if(null != reader){
            reader.close();
        }//...
    }
}

```