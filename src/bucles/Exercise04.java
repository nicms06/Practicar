/*
 * Escribe un programa que lea un número entero (lado) y a partir de él cree un cuadrado de asteriscos con ese tamaño. 
 * Los asteriscos sólo se verán en el borde del cuadrado, no en el interior:
 * 
 *  *****
 *  *   *
 *  *   *
 *  *   *
 *  *****
*/

package bucles;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {

		//Creamos un nuevo Scanner
		Scanner sc = new Scanner (System.in);
		
		//Declaramos las variables
		int num;
		
		//Preguntamos al usuario por un número (mayor a 1)
		System.out.print("Introduzca un valor: ");
		num = sc.nextInt();
		
		//El valor debe de ser mayor a 1
		while (num < 2) {
			System.out.print("Error. El valor debe de ser mayor o i gual a 2: ");
			num = sc.nextInt();
		}
		
		//Creamos la figura
		for (int i = 0; i <= num - 1; i++) {
			
			if (i == 0 || i == num - 1) {
				for (int j = 0; j < num; j++) {
					System.out.print("*");
				}
			}
			else {
				System.out.print("*");
				
				for (int j = 0; j < num -2; j++) {
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
