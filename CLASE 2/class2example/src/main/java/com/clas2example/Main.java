package com.clas2example;

public class Main {
    // public static void main(String[] args) {
    //     System.out.println("Hello world!");
    //     Main principal = new Main(); // creamos una instancia PRINCIPAL para hacer referencia a la clase Main y poder hacer uso de sus mmetodos

    //     System.out.println(principal.suma(4,6));
    // }
    // public int suma(int a, int b){
    //     return a + b;
    // } // si quiero acceder a este metodo sin crear una instancia hacemos uso de static public STATIC int
    public static void main(String[] args) {
        Estudiante myStudent = new Estudiante();//Sobrecarga de metodos ocmo hay dos metodos iguales pero uno funciona sin parametros y otro con parametros se aplica esto.
        myStudent.setNombre("Jon");
        myStudent.setApellido("Jones");
        myStudent.setEdad(13);
        System.out.println(myStudent.getNombre()+"\t"+myStudent.getApellido()+"\t"+myStudent.getEdad());
    }



}