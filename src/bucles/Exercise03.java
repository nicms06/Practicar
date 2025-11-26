/*
 * Escribe un programa que lea un número n e imprima una pirámide de números con n filas como en la siguiente figura:
 * 1
 * 121
 * 12321
 * 1234321
 */

package bucles;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

		//Create a new scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		int num;
		
		//Pedimos al usuario un número positivo
		System.out.print("Introduce un número mayor que 0: ");
		num = sc.nextInt();
		
		//El número debe de ser mayor a 0
		while (num < 1) {
			System.out.print("ERROR. El número debe de ser positivo: ");
			num = sc.nextInt();
		}
		
		//Creamos el bucle
		for (int i = 0; i <= num; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j);
			}
			
			System.out.println();
		}
		
		//Cerrar el Scanner
		sc.close();
		
	}

}
