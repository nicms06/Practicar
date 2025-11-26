/*
 * Solicita al usuario un número n y dibuja un triángulo de base y altura n. Por ejemplo para n=4 debe dibujar un triangulo de lados = 4
 */

package bucles;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		int num;
		
		//Solicitamos al usuario un número mayor que 0
		System.out.print("Introduzca un número positivo: ");
		num = sc.nextInt();
		
		//El número debe de ser piositivo
		while (num <1) {
			System.out.print("ERROR. El número debe de ser mayor a 0: ");
			num = sc.nextInt();
		}
		
		//Hacemos el bucle para hacer la figura
		for (int i=0; i <= num; i++) {
			
			for (int k = 0; k < num-1*i; k++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		//Cerramos el Scanner
		sc.close();

	}

}
