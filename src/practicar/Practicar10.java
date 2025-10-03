/*
 * Calcular el factorial de un número
 */

package practicar;

import java.util.Scanner;

public class Practicar10 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare variables
		int n, i;
		int factorial = 1;
		
		//We ask the user for a number
		System.out.println("Please, input a number: ");
		n = sc.nextInt();
		
		//Close the Scanner
				sc.close();
		
		//We calculate the factorial with a loop
		for (i = n; i >= 1 ; i--) {
			factorial *=i;
		}
				
		//We show the result
		System.out.println("The factorial of the number " + n + " is " + factorial);
		
	}

}
