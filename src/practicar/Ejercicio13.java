/*
 * Dado un número x, usa un ternario anidado para devolver:
 * "Positivo" si x > 0
 * "Negativo" si x < 0
 * "Cero" si x == 0.
 */

package practicar;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare variables
		int n;
		String result;
		
		
		//Ask the user for a number
		System.out.print("Please, input a number: ");
		n = sc.nextInt();
		
		//The logic of the exercise
		result = (n>0) ? "Positive" : (n<0) ? "Negative" : "Zero";
		
		//Show the result
		System.out.print(n + " is " + result);
		
		//Close the Scanner
		sc.close();
	}

}
