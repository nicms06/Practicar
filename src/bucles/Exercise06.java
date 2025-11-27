/*
 * Escribe un programa que lea un número entero positivo. A continuación debe dibujar un hexágono regular cuyos lados midan el número introducido.
 */

package bucles;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos la variable del lado
		int lado;
		
		//Le preguntamos al usuario por un número
		System.out.println("Lado: ");
		lado = sc.nextInt();
		
		//El lado debe de ser mayor que 1. 
		//Le volvemos a preguntar por el número hasta que sea mayor de 1
		while (lado < 2) {
			System.out.println("Error, el lado debe de ser mayor que 1");
			lado = sc.nextInt();
		}
		
		/* Comenzamos a hacer la figura con bucles for.
		 * Tendremos que hacer 2 bucles for, uno ascendente y otro descendente */
		
		//Comenzamos con un bucle que se encargará de los saltos de línea.
		for (int i = 0; i < lado; i++) {
			
			//El siguiente bucle será para hacer espacios descendentes
			for (int j = lado - 1; j > 1 * i; j--) {
				System.out.print(" ");
			}
			
			//Ahora haremos otro bucle para encargarnos de los "*"
			
			for (int j = 0; j <lado + 2 * i ; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		/* Ahora vamos a hacer el segundo bucle descendente. Como hemos dicho anteriormente,
		 * vamos a empezar con un bucle que delimitará los saltos de línea*/
		for (int i = lado - 1; i > 0; i--) {
			
			//Ahora haremos el bucle que se encarga de los espacios
			for (int j = 0; j < lado - 1 * i; j++) {
				System.out.print(" ");
			}
			
			//Ahora el bucle para dibujar los asteriscos
			for (int j = (lado + 2 * i)-2; j > 0; j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//Cerramos el Scanner
		sc.close();

	}

}
