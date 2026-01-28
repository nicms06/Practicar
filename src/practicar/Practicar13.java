/*
 * Diseñar un programa que muestre la suma de los 10 primeros números impares.
 */

package practicar;

import java.util.Scanner;

public class Practicar13 {

	public static void main(String[] args) {

		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		int suma = 0;
		
		for (int i = 0; i <=10; i++){
			suma += i;
		}
		//Show the result
		System.out.println("La suma es: " + suma);
		
		//Close the Scanner
		sc.close();
		
	}

}
