package unit03.repaso;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        //Creamos un nuevo Scanner
        Scanner sc = new Scanner(System.in);

        //Pedimos una frase
        System.out.println("Introduce una frase completa por teclado: ");
        String frase = sc.nextLine();

        //Llamamos a la función obtenerPalabras y le pasamos por parámetro la cadena "frase". Lo mostramos por pantalla
        String[] palabras = obtenerPalabras(frase);
        System.out.println("\nPalabras de la frase:");
        System.out.println(Arrays.toString(palabras));

        //Imprimimos el número de palabras de la frase
        System.out.print("\nNúmero de palabras de la frase: ");
        System.out.println(palabras.length); //Imprimimos la longitud de "palabras"

        //Mostramos el número de palabras que tienen 5 o más letras
        System.out.print("\nNúmero de palabras con 5 letras como mínimo: ");
        //Llamamos a la función contarPalabrasLargas y le pasaremos como parámetro "palabras" y la longitud mínima que es 5.
        System.out.println(contarPalabrasLargas(palabras, 5));

        //Mostramos la palabra más larga encontrada.
        System.out.print("\nPalabra más larga encontrada: ");
        System.out.println(palabraMasLarga(palabras)); //Llamamos a la función palabraMasLarga y le pasamos como parámetro "palabras"

        //Cerramos el Scanner
        sc.close();
    }

    /**
     * Función que:
     *      Elimina los espacios iniciales y finales,
     *      Convierte la frase a minúsculas,
     *      Devuelve un array de String con todas las palabras de la frase (separadas por espacios).
     * @param frase --> Frase que introducirá el usuario por teclado
     * @return --> Devolvemos un array de String con la frase separada por espacios
     */
    static String[] obtenerPalabras(String frase){
        String fraseEditada = frase.trim().toLowerCase(); //Convertimos la frase a minúsculas y eliminamos los espacios iniciales y finales
        return fraseEditada.split(" "); //Devolvemos la frase separada por espacios
    }

    /**
     * Función que devuelve cuántas palabras tienen una longitud mayor o igual que longitudMinima.
     * @param palabras --> Cadena que contiene todas las palabras de la frase
     * @param longitudMinima --> Número que indica la longitud mínima de una palabra
     * @return --> Devolvemos el número de palabras con longitud mayor a longitud mínima
     */
    static int contarPalabrasLargas(String[] palabras, int longitudMinima){
        int numPalabrasLargas = 0; //Variable que va a contener el número de palabras con mayor longitud que longitudMinima.

        for (String palabra : palabras){ //Recorremos el array palabras
            if(palabra.length() >= longitudMinima){ //Comprobamos si la palabra es mayor que la longitud minima
                numPalabrasLargas ++; //Sumamos 1 a numPalabrasLargas
            }
        }
        return numPalabrasLargas; //Devolvemos el número de palabras largas
    }

    /**
     * Función que devuelve la palabra más larga del array
     * @param palabras --> array que contiene todas las palabras de la frase introducida por el usuario
     * @return --> Devolvemos la palabra más larga del array
     */
    static String palabraMasLarga(String[] palabras) {
        String palabraLarga = palabras[0]; //Cadena que va a contener la palabra más larga. La inicializamos en el primer valor del array Palabras.

        for (String palabra : palabras){ //Recorremos el array palabras
            if (palabraLarga.length() < palabra.length()){ //Comprobamos si la longitud de palabraLarga es menor que la palabra actual del bucle
                palabraLarga = palabra; //Damos el valor actual del bucle a palabraLarga si la longitud de esta es menor
            }
        }

        return palabraLarga; //Devolvemos la palabra más larga
    }
}