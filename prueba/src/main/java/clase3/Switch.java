package clase3;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
//ingresar una opcion 
		// si es 1 => alta 
		// si es 2 => baja 
		// si es 3 => modi 
		Scanner teclado = new Scanner(System.in);
		System.out.println("ingrese opcion:"
				+ "1 - alta "
				+ "2 - baja"
				+ "3 - modi");
		int opcion = teclado.nextInt();
		/*
		if(opcion == 1 ) {
			System.out.println("alta");
		}else if(opcion == 2) {
			System.out.println("baja");
		}else  if(opcion == 3) {
			System.out.println("modi");
			
		}else {
			// ni 1, 2,3 
			System.out.println("ninguna de las 3");
		}
		*/
		// ahora vamos hacer lo mismo pero con el switch 
		switch (opcion) {
		case 1:
			System.out.println("alta en case");
			System.out.println("ingrese nombre");
			String nombre = teclado.next();
			System.out.println("ha ingresado:" + nombre);
			break;
		case 2:
			System.out.println("baja en case");
			break;
		case 3: 
			System.out.println("modi en case");
			break;

		default:
			System.out.println("ninguna de las 3 en case");
			break;
		}
		teclado.close();
			
	}

}
