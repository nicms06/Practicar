/*
 * Pide n y dibuja:
 * Ejemplo (n = 5)
 * 
 *      1
 *     121
 *    12321
 *   1234321
 *  123454321
 *
 */

package bucles;

import java.util.Scanner;

public class Exercise16 {

	public static void main(String[] args) {
		
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos la variable num
		int num;
		
		//Le pedimos un número al usuario
		System.out.println("Num: ");
		num = sc.nextInt();
		
		//El número debe de ser mayor a 0
		while (num < 1) {
			System.out.println("ERROR. El número debe de ser positivo: ");
			//Volvemos a pedir el número
			num = sc.nextInt();
		}
		
		//El primer blucle para los saltos de línea
		for (int i = 0; i < num; i++) {
			
			for (int j = num - 1; j > i ; j--) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i + 1; j++) {
				System.out.print(j);
			}
			
			for (int j = i; j > 0 ; j--) {
				System.out.print(j);
			}
			
			System.out.println();
		}
		
		//Cerramos el Scanner
		sc.close();

	}

}
