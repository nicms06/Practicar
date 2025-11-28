/*
 * Pide un entero impar n (altura total) y dibuja un rombo.
 * 
 * num = 5
 * 
 *   *
 *  ***
 * *****
 *  ***
 *   *
 *   
 */

package bucles;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {

		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		int num;
		
		//Le pedimos num al usuario
		System.out.print("Introduzca un valor impar: ");
		num = sc.nextInt();
		
		//Cuando el número sea par, mostrará un error y volverá a pedir el número hasta que sea impar
		while (num % 2 == 0) {
			System.out.print("ERROR. El número debe de ser impar: ");
			
			//Volvemos a pedir el número
			num = sc.nextInt();
		}
		
		/*Para hacer la figura debemos de hacer 2 bucles for, ambos para hacer 2 pirámides, 
		 * el primer for es un bucle ascendente y el otro descendente*/
		
		//----------PIRÁMIDE ASCENDENTE----------
		
		//Comenzamos con un for que se encarga de los saltos de línea
		for (int i = 0; i < (num+1) / 2; i++) {
			
			//El siguiente for se encargará de los espacios
			for (int j = num / 2; j > i; j--) {
				System.out.print(" ");
			}
			
			//El último for se encargará de de los *
			for (int j = 0; j <= i * 2; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//----------PIRÁMIDE DESCENDENTE----------
		
		//El primer bucle será para los saltos de línea
		for (int i =  num / 2; i > 0; i--) {
			
			//El siguiente for se encargará de los espacios
			for (int j = 0; j <= (num / 2) - i; j++) {
				System.out.print(" ");
			}
			
			//El último para los *
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
		
		//Cerramos el Scanner
		sc.close();
		
	}

}
