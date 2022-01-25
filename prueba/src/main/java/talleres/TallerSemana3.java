package talleres;

import java.util.Arrays;
import java.util.Scanner;

public class TallerSemana3 {

	public static void main(String[] args) {
		// la escuela primaria xyz solicita el desarrollo de una aplicación para poder 
		// llevar el control de notas  para cada alumno 
	 Scanner teclado = new Scanner(System.in);
	 System.out.println("ingrese Cantidad de estudiantes");
	 int CantEstudiantes = teclado.nextInt();
	 System.out.println("ingrese Cantidad de examenes hechos por los estudiantes");
	 int CantExamenes = teclado.nextInt(); 
	 
	 int CantColumnas =  (CantExamenes*2)+2;
	 Object [][] Estudiantes = new Object [CantEstudiantes][CantColumnas];
	 for(int i=0; i < CantEstudiantes;i++ ) {
		 for( int j=0; j<CantColumnas; j++) {
			 if(j == 0){
				 System.out.println("ingrese nombre del estudiante " + i);
				 Estudiantes[i][j] = teclado.next();
		 }
			 if(j== 1) {
				 System.out.println("ingrese apellido del estudiante"+ i);
				 Estudiantes[i][j]= teclado.next();
			 }
			 if (j % 2 == 0 && j != 0) {
					System.out.println("Por favor ingrese el numero del examen: ");
					Estudiantes[i][j] = teclado.nextInt();
					}
					if (j % 2 != 0 && j != 1) {
					System.out.println("Por favor ingrese la nota del examen (entre 0 y 10)");
					Estudiantes[i][j] = teclado.nextDouble();
					}
					} 
					}

	 }
	 
	 

	}
	

