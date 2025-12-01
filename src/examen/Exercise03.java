/*
Escribe un programa que lea un número entero (lado) y a partir de él cree un cuadrado de asteriscos con ese tamaño.
Los asteriscos sólo se verán en el borde del cuadrado, no en el interior:
 */

package examen;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {

        //Creamos un nuevo Scanner
        Scanner sc = new Scanner(System.in);

        //Declaramos las variables
        int lado;

        //Le preguntamos al usuario por el tamaño del lado
        System.out.print("Introduzca el tamaño del lado: ");
        lado = sc.nextInt();

        //El lado debe de ser mayor de 2
        while (lado <=2){
            System.out.print("ERROR: ");
            lado = sc.nextInt();
        }

        //----------FIGURA----------//
        for (int i = 0; i < lado; i++){

            if (i == 0 || i == lado -1){
                for (int j = 0; j < lado; j++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for (int j = 0; j < lado - 2; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }

        //Cerramos el Scanner
        sc.close();
    }
}
