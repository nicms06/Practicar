/*
 * Pide n y dibuja un triángulo rectángulo de * apoyado a la izquierda.

	Ejemplo (n = 5)

	*
	**
	***
	****
	*****
 */

package bucles;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Num: ");
		num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		sc.close();
		
	}

}
