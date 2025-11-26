/*
 * Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre por pantalla los números desde 1 hasta N, 
 * uno en cada línea, repitiendo cada número tantas veces como su valor. Ejemplo:
 * 
 * 1
 * 22
 * 333
 * 4444
 * 55555
 * 
 */

package bucles;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {

		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Delaramos la variable de entrada num
		int num;
		
		//Le pedimos un número al usuario
		System.out.print("Introduzca u valor (0, 20): ");
		num = sc.nextInt();
		
		//num debe de ser menor o igual a 20 y mayor o igual a 0
		while (num < 0 || num > 20) {
			if (num < 0) {
				System.out.print("ERROR. El número debe de ser mayor que 0: ");
			}
			else {
				System.out.print("ERROR. El número debe de ser menor que 0: ");
			}
			
			//Volvemos a pedir el número
			num = sc.nextInt();
		}
		
		//Bucle para hacer la figura dado el número
		for (int i = 0; i <= num; i++) {
			for (int j=0; j < i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		//Cerramos el Scanner
		sc.close();
		
	}

}
