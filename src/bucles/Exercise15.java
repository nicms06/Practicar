/*
 * Pide n y dibuja una escalera con números.
 * 
 * Ejemplo (n = 5)
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 
 */

package bucles;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos la variable num
		int num;
		
		//Le preguntamos al usuario por num
		System.out.println("Num: ");
		num = sc.nextInt();
		
		//El número debe de ser mayor a 0
		while (num < 1) {
			System.out.println("ERROR. El número debe de ser positivo: ");
			//Volvemos a pedir el número
			num = sc.nextInt();
		}
		
		//--------------------------DIBUJO--------------------------
		
		//Bucle for para los saltos de línera
		for (int i = 0; i <= num; i++) {
			
			//Bucle para los números
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
		
		//Cerramos el scanner
		sc.close();

	}

}
