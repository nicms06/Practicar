/*
 * Pide la altura del árbol (parte verde) y dibuja el árbol con tronco.
 * 
 * Ejemplo (altura = 4)
 * 
 *       *
 *      ***
 *     *****
 *    *******
 *       *
 *       *
 */

package bucles;

import java.util.Scanner;

public class Exercise17 {

	public static void main(String[] args) {
		
		//Crear un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos la variable num
		int num;
		
		//Le pedimos al usuario num
		System.out.print("Introduzca num: ");
		num = sc.nextInt();
				
		//El número debe de ser mayor que 2. Cuando sea menor, dará un error y volerá a pedir números hasta qu
		while (num <= 2) {
			System.out.print("ERROR. El número debe de ser mayor que 1: ");
			//Volvemos a pedir el número
			num = sc.nextInt();
		}
		
		//Bucle para la pirámide
		for (int i = 0; i < num; i++) {
			
			for (int j = num - 1; j > i; j--) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= i * 2 ; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		
		for (int j = 0; j < 2; j++) {
			
			for (int k = 0; k < num - 1; k++) {
				System.out.print(" ");
			}
			
			System.out.print("*");
			
			System.out.println();
			
		}
		
		//Cerramos el Scanner
		sc.close();

	}

}
