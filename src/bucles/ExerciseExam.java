
package bucles;

import java.util.Scanner;

public class ExerciseExam {

	public static void main(String[] args) {
		
		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//----------DECLARACIÓN DE VARIABLES----------//
		int numAlu;
		
		//Le preguntamos al usuario el número de alumnos
		System.out.print("Introduzca el número de alumnos: ");
		numAlu = sc.nextInt();
		
		//Si el número de alumnos es negativo o 0, dará error y seguirá pediendo el valor hasta que sea positivo
		while(numAlu <= 0) {
			System.out.print("ERROR. El valor debe ser positivo: ");
			numAlu = sc.nextInt();
		}
		
		
		
		//Cerramos el Scanner
		sc.close();

	}

}
