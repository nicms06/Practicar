//Pide un número y muestra si es par o impar.

package practicar;

import java.util.Scanner;

public class Practicar05 {

	public static void main(String[] args) {
		
		//We create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//We declare the variables 
		int n;
		boolean isEven;
		String result;
		
		//We ask the user for a number
		System.out.println("Input a number: ");
		
		//The machine waits for an answer
		n = sc.nextInt();
		
		//The logic of the exercise
		isEven = n%2==0;
		
		//We configure the result to answer with Yes or No
		result = isEven ? "Yes" : "No";
		
		//We show if the number is even or odd
		System.out.println("Is " + n + " even? \n" + result);
		
		sc.close();
		
	}

}
