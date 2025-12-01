/*
Escribe un programa que pida por teclado un número entero mayor o igual que 0 y determine cuántas de sus cifras son pares y cuántas son impares:
 */

package examen;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {

        //Creamos un nuevo Scanner
        Scanner sc = new Scanner(System.in);

        //Declaramos las variables
        int num;
        int par = 0;
        int impar = 0;

        //Le preguntamos el número al usuario
        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        //El número debe de ser mayor o igual a 0
        while(num < 0){
            System.out.print("ERROR: ");
            num = sc.nextInt();
        }

        int numOriginal = num;

        while (num > 0){
            int cifra = num % 10;
            num/=10;

            if (cifra % 2 == 0){
                par ++;
            }
            else {
                impar ++;
            }

        }

        System.out.println(numOriginal + " tiene " + par + " cifras pares y " + impar + " cifras impares");

        //Cerramos el Scanner
        sc.close();

    }
}
