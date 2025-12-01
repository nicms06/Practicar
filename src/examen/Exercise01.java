/*
    Escribe un programa en Java que pida un número entero n mayor que 2 y genere un patrón de números en forma de triángulo invertido con las siguientes condiciones:
	1.	Cada fila i (empezando en 1 hasta n) debe mostrar números consecutivos del 1 hasta i.
	2.	Para cada número:
	•	Si el número es primo, reemplázalo por P.
	•	Si el número es par y no es primo, reemplázalo por E.
	•	Si el número es impar y no es primo, reemplázalo por I.
	3.	Alinea el triángulo de manera que forme una pirámide invertida centrada.
 */

package examen;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        //Creamos un nuevo Scanner
        Scanner sc = new Scanner(System.in);

        //Declaramos las variables
        int num;

        //Le pedimos al usuario el número
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        //El número debe de ser mayor que 2
        while (num <= 2) {
            System.out.print("Error, el número debe de ser mayor a 2");

            //Le volvemos a pedir el número
            num = sc.nextInt();
        }

        //----------FIGURA----------//

        //Para hacer la figura, lo primero que haremos será un bucle que se encargará de los saltos de línea
        for (int i = 0; i <= num; i++){

            //Ahora haremos otro bucle que se va a encargar de hacer los espacios
            for ( int j = 0; j < i; j++){
                System.out.print(" ");
            }

            //Hacemos otro bucle para los números
            for (int j = 1; j <= num - i; j++){

                boolean esPrimo = true;

                //Calculamos si cada número del bucle es primo o no
                if (j < 2){
                    esPrimo = false; //El 0 y el 1 no son números primos
                }
                else {
                    for (int k = 2; k * k <= j; k++){
                        if (j % k == 0){
                            esPrimo = false;
                            break;
                        }
                    }
                }

                if (esPrimo == true){
                    System.out.print("P ");
                }
                else if (j % 2 == 0 && esPrimo == false) {
                    System.out.print("E ");
                }
                else if (j % 2 != 0 && esPrimo == false) {
                    System.out.print("I ");
                }
            }

            System.out.println();
        }

        //Cerramos el Scanner
        sc.close();
    }
}
