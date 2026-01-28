package unit03.repaso;

import java.util.Arrays;

public class Ejercicio02 {
    public static void main(String[] args) {
        //Creación de un array con notas del 0 al 10
        double[] notas = {3.75, 5.6, 9.64, 7.3, 1.8, 8.34};

        //Mostramos las notas originales
        System.out.println("Notas Originales: " + Arrays.toString(notas));

        //Mostramos la media, nota máxima y número de aprobados
        System.out.println("\nMedia: " + calcularMedia(notas)); //Llamamos a la función calcularMedia y pasamos las notas como parámetro
        System.out.println("Nota máxima: " + notaMaxima(notas)); //Llamamos a la función notaMaxima y pasamos las notas como parámetro
        System.out.println("Número de aprobados: " + contarAprobados(notas)); //Llamamos a la función contarAprobados y pasamos las notas como parámetro

        //Aplicamos una subida de 0.5 puntos
        subirNotas(notas, 0.5); //Llamamos a la función subirNotas y le pasamos las notas y 0.5 como parámetros
        System.out.print("\nIncremento de 0.5 puntos: " + Arrays.toString(notas));
    }

    /**
     * Función que calcula la media de todas las notas
     * @param notas --> array que contiene todas las notas
     * @return --> Devolvemos la media de las notas
     */
    static double calcularMedia(double[] notas){
        double suma = 0; //Variable que contendrá la suma de todas las notas
        for (double nota : notas){ //Recorremos todas las notas
            suma += nota; //Le sumamos a la variable suma la nota actual
        }
        return suma /notas.length; //Devolvemos la media
    }

    /**
     * Función que calcula la nota más alta
     * @param notas --> Array con todas las notas
     * @return --> Devolvemos la nota más alta
     */
    static double notaMaxima(double[] notas){
        double notaMasAlta = notas[0]; // Inicializamos la nota más alta con la primera nota
        for (double nota : notas){ //Recorremos las notas del array "notas"
            if (nota > notaMasAlta){ //Comprobamos si el valor actual de la nota es mayor al de notaMasAlta
                notaMasAlta = nota; //Le asignamos el valor de nota a notaMasAlta
            }
        }
        return notaMasAlta; //Devolvemos el valor de la nota más alta
    }

    /**
     * Función que calcula el número de aprobados
     * @param notas --> Array con todas las notas
     * @return --> devolvemos el número total de aprobados
     */
    static int contarAprobados(double[] notas){
        int numAprobados = 0; //Declaración de la variable que contendrá el número de aprobados. Asignamos el valor 0
        for (double nota : notas){ //Recorremos las notas
            if (nota >= 5){ //Comprobamos si la nota es mayor o igual a 5
                numAprobados ++; //Sumamos 1 al número de aprobados
            }
        }
        return numAprobados; //Devolvemos el número de aprobados
    }

    /**
     * Función que suma una cantidad dada a cada nota sin que ninguna nota sea mayor a 10
     * @param notas --> Array que contiene todas las notas
     * @param incremento --> valor que vamos a sumar a las notas
     */
    static void subirNotas(double[] notas, double incremento){
        for (int i = 0; i < notas.length; i++){ //Recorremos las notas una a una
            notas[i] += incremento; //Sumamos a la nota el incremento
            if(notas[i] > 10){ //Comprobamos si la nota es mayor a 10
                notas[i] = 10; //Igualamos la nota a 10
            }
        }
    }
}