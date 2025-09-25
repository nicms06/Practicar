//Calcula el área de un rectángulo.

package practicar;

import java.util.Scanner;

public class Practicar04 {

	public static void main(String[] args) {
		
		//We create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//We declare the variables
		float base;
		float height;
		float area;
		
		//We ask the user for the base 
		System.out.println("Input the base of the rectangle: ");
		
		//The machine waits for the answer
		base = sc.nextFloat();
		
		//We ask the user for the height 
		System.out.println("Input the height of the rectangle: ");
				
		//The machine waits for the answer
		height = sc.nextFloat();
		
		//We calculate the area
		area = base * height;
		
		//We show the result
		System.out.println("The area of the rectangle is: " + area + " square meters");
		
		sc.close();
		
	}

}
