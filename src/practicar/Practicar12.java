/*
 * Dados dos enteros a y b, usa un ternario para obtener el mayor y mostrarlo por consola.
 */

package practicar;

import java.util.Scanner;

public class Practicar12 {

	public static void main(String[] args) {
		
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare variables
		int a;
		int b;
		String bigger;
		
		//Ask the user for a and b
		System.out.print("Please input a: ");
		a = sc.nextInt();
		
		System.out.print("Please input b: ");
		b = sc.nextInt();
		
		//The logic of the exercise
		bigger = a > b ? a +" is bigger than " + b : b + " is bigger than " + a;
		
		//Show the result 
		System.out.println(bigger);
		
		//Close the Scanner
		sc.close();

	}

}
