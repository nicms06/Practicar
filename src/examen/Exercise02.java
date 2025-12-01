/*
    Escribe un programa en Java que pida un número entero n > 2 y genere un patrón de números con estas reglas:
        1.	Cada fila i (1 ≤ i ≤ n) tendrá i números consecutivos comenzando desde 1.
        2.	Para cada número j en la fila:
        •	Si j es primo, reemplázalo por P.
        •	Si j es par y la posición en la fila (columna) es impar, reemplázalo por E.
        •	Si j es impar y la fila es par, reemplázalo por I.
        •	Si j es múltiplo de la fila y mayor que 3, reemplázalo por M.
        •	Si no cumple ninguna de las condiciones anteriores, imprime el número.
        3.	Centra la pirámide con espacios antes de cada fila para que quede alineada.
        4.	Solo se pueden usar bucles y condicionales, nada de funciones, arrays o matrices.
 */

package examen;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {

        //Creamos un nuevo Scanner
        Scanner sc = new Scanner(System.in);

        //Declaramos las variables
        int num;

        //Le pedimos el número al usuario
        System.out.println("Digite um numero: ");
        num = sc.nextInt();

        //El número debe de ser mayor a 2
        while (num <= 2) {
            System.out.println("ERROR. El número debe de ser mayor a 2, inténtelo de nuevo: ");

            //Volvemos a pedir el número hasta que la condición del bucle sea cierta
            num = sc.nextInt();
        }

        //----------FIGURA----------//

        //Saltos de línea
        for (int i = 0; i < num ; i++){

            //Espacios
            for (int j = 0; j <= (num + 2) - (i * 2) ; j++){
                System.out.print("  ");
            }

            //Resto

            for (int j = 1; j <= i + 1 ; j++){

                //Calculamos los primos
                boolean esPrimo = true;

                if (j < 2){
                    esPrimo = false; // 0 y 1 no son primos
                }
                else {
                    for (int k = 2; k * k<= j; k++){
                        if (j % k == 0){
                            esPrimo = false;
                            break;
                        }
                    }
                }

                if (esPrimo == true){
                    System.out.print("P   ");
                }
                else if (j % 2 == 0 && j % 2 != 0){
                    System.out.print("E   ");
                }
                else if (j % 2 != 0 && i % 2 == 0) {
                    System.out.print("I   ");
                }
                else if (j % i == 0 && j > 3){
                    System.out.print("M   ");
                }
                else{
                    System.out.print(j + "   ");
                }
            }

            System.out.println();
        }

        //Cerramos el Scanner
        sc.close();
    }
}
