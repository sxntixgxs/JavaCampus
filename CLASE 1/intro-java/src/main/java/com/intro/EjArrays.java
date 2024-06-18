public class EjArrays {
    public static void main(String[] args) {
        int[] numeros = {10,20,30};
        int longitud = numeros.length;
        System.out.println(MessageFormat.format("This is the length of the array {0}", longitud));
        for(int i=0; i<longitud;i++){
            System.out.println("Elemento en el indice "+i+": "+numeros[i]);
        }

    }
}
// Le doy al play y me da error, como funciona?
// compilo el archivo desde el terminal
/* 
javac EjArrays.java
luego de que este compilado se ejecuta el archivo
java EjArrays
Se obtiene el resultado
This is the length of the array 3

*/