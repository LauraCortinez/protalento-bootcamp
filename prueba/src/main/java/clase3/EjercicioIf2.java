package clase3;

public class EjercicioIf2 {

	public static void main(String[] args) {
		// determinar dado 3 numero, cual es el mayor
		int n1,n2,n3;
		n1 = 15; 
		n2 = 20;
		n3 = 20;
		
		// n1 > n2 y n1 > n2 caso 1
		// n2 > n1 y n2 > n3 caso 2
		// n3 > n1 y n3 > n2 caso 3 
		// n1 == n2 y n1 == n3 
		
		if(n1 > n2 && n1 > n3) {
			System.out.println(n1 + "es mayor");
		}
		if(n2 > n1 && n2 > n3) {
			System.out.println(n2 + "es mayor");
		}
		if(n3 > n1 && n3 > n2) {
			System.out.println(n3 + "es mayor");
		
		}
		// n1 y n2 < n3
		// n1 y n3 < n2
		// n2 y n3 < n1 
		if(n1 == n2 && n1 > n3) {
			System.out.println(n1 + "es mayor");
		}else {
			if(n3 > n2) {
			System.out.println(n3 + "es mayor" );
		}
		if(n1 == n3 && n1 > n2) {
			System.out.println(n1 + "es mayor");
	}else {
		if(n2 > n3) {
			System.out.println(n2 + " es mayor");
		}
	}
	
		if(n2 == n3 && n2 > n1) {
			System.out.println(n2 + "es mayor");
		}else {
			if(n2 < n1 ) {
				System.out.println(n1 + "es mayor");
			}
				
		}if(n1 == n2 && n1 == n3) {
			System.out.println("son igual valor");
		
		}
		
		}
	}
}
