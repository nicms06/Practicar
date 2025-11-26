/*
 * Escribe un programa que lea un número entero (lado del triángulo) y a partir de él cree un triángulo 
 * invertido de asteriscos con ese tamaño. Los asteriscos sólo se verán en el borde del triángulo, no en 
 * el interior. Por ejemplo, para el tamaño=5. Nótese que en la primera fila (la base) hay un espacio entre 
 * cada dos asteriscos:
 * 
 	* * * * *
	 *     *
	  *   *
	   * *
	    *  
 */

package bucles;

import java.util.Scanner;

public class exercise05 {

	public static void main(String[] args) {

		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		int num;
		
		//Le pedimos al usuario el valor del lado
		System.out.print("Lado: ");
		num = sc.nextInt();
		
		//El lado debe de ser mayor a 1
		while (num <= 1) {
			System.out.print("ERROR. El número debe de ser mayor a 1: ");
			num = sc.nextInt();
		}
		
		//bucle para hacer la figura
		for (int i = 0; i < num; i++) {
			
			for (int j = num - 1; j >= num -1 * i; j--) {
				System.out.print(" ");
			}
			if (i == 0) {
				for (int j = 0; j < num; j++) {
					System.out.print("* ");
				}
			}
			else if (i == num -1) {
				System.out.print("*");
			}
			else {
				System.out.print("*");
				for (int j = 0; j < 2*(num - i - 1) - 1; j++) {
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
