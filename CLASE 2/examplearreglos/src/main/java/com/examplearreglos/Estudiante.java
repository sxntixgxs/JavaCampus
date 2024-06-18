package com.examplearreglos;

public class Estudiante {
//ENCAPSULAMIENTO
    // Es por ello que lo único público son los métodos y propiedades -Setters y Getters- de la clase
    private String nombre;//Establecemos los atributos y los declaramos también como privados
    private String apellido;
    private int edad;
    //Creación de CONSTRUCTORES
    // Uno que reciba parametros y otro que no los reciba
    // Click derecho - Source Action - Generate Constructor
    public Estudiante() {
    }
    public Estudiante(String nombre, String apellido, int edad) {
        this.nombre = nombre; //para evitar errores de conflicto entre los nombres de las variables usamos .this que idenfica la variable como propia de la clase
        this.apellido = apellido;
        this.edad = edad;
    }
    //GETTER Y SETTERS
    //exactamente igual que con el constructor! pero se le da a generar GETTER y SETTER
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

}
