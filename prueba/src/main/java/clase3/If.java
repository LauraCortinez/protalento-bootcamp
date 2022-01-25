package clase3;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
// ingrese un dato y si es > 18 imprimir " mayor de edad "
		// de lo contrario indicar " es menor edad" 
		
		System.out.println("ingrese edad");
		int edad = teclado.nextInt();
		// siempre va a ver un boolean true 
		if(edad >= 18) {
			System.out.println("mayor de edad");
		}else {
			System.out.println("es menor de edad");
		}
		teclado.close(); 
				 
		
	}

}
