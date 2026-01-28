/*
 * Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. 
 * El usuario introducirá las notas por teclado y luego el programa mostrará la tabla con las notas. A continuación, mostrará la 
 * nota mínima, máxima y media de cada alumno.
 */

package arraysbidimensionales;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

		//Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);
		
		//Creamos la tabla
		int [][] alumnos = new int [4][5];
		
		//Variable para la nota máxima
		int max;
		
		//Variable para la nota mínima
		int min;
		
		//Variable para la nota media
		double media;
		
		//Creamos la variable sum
		int sum;
		
		//Creaos un bucle para introducir las notas
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println("Alumno" + (i+1) + ": ");
			for (int j = 0; j < alumnos[i].length; j++) {
				
				//Pedimos una nota
				alumnos[i][j] = sc.nextInt();
				
				//La nota debe de estar comprendida entre 0 y 10
				while (alumnos[i][j] > 10 || alumnos[i][j] < 0) {
					System.out.print("ERROR. La nota debe de estar comprendida entre 0 y 10: ");
					alumnos[i][j] = sc.nextInt();
				}
			}
		}
		
		//Mostramos la tabla con las notas
		for (int i = 0; i < alumnos.length; i++) {
			System.out.print("Alumno" + (i+1) + ": ");
			
			//Inicializamos tanto min como max en el primer valor
			min = alumnos[i][0];
			max = alumnos[i][0];
			
			//inicializamos la variable sum en 0
			sum = 0;
			
			for (int j = 0; j < alumnos[i].length; j++) {
				
				
				//Mostramos la tabla
				System.out.print(alumnos[i][j] + "\t");
				
				//Calculamos el mínimo y el máximo
				if (alumnos[i][j] > max) {
					max = alumnos[i][j];
				}
				if (alumnos[i][j] < min) {
					min = alumnos[i][j];
				}
				
				//Calculamos la suma de las notas
				sum += alumnos[i][j];
			}
			
			//Calculamos la media
			media = (double)sum / 5;
			
			//Mostramos el mínimo, máximo y media
			System.out.println("Nota mínima: " + min + " | Nota máxima: " + max + " | Nota media: " + media );
		}
		
		//Cerramos el Scanner
		sc.close();

	}

}
