/*
 * Pide un entero n y dibuja un cuadrado de n x n relleno de *
 */

package bucles;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {

		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos la variable lado
		int lado;
		
		//Le perguntamos al usuario por "lado"
		System.out.print("Lado: ");
		lado = sc.nextInt();
		
		//El número debe de ser mayor que 1
		while (lado < 2) {
			System.out.println("ERROR");
			lado = sc.nextInt();
		}
		
		//Hacemos la figura. Empezaremos por un bucle for para los saltos de línea
		for (int i = 0; i < lado; i++) {
			
			//Otro bucle para dibujar los *
			for (int j = 0; j < lado; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//Cerramos el Scanner
		sc.close();

	}

}
