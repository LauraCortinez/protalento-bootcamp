package clase3;

public class EjercicioIf {

	public static void main(String[] args) {
		// determinar dado 3 numero, cual es el mayor
		double a,b,c ;
		a = 15; 
		b = 11.2;
		c = 20;
		
		// a > b y a > b caso 1
		// b > a y b > c caso 2
		// c > a y c > b caso 3 
		// a == b y a == c 
		
		if(a > b && a > c) {
			System.out.println(a + "es mayor");
		}
		if(b > a && b > c) {
			System.out.println(b + "es mayor");
		}
		if(c > a && c > b) {
			System.out.println(c + "es mayor");
		}if(a == b && a == c) {
			System.out.println("son igual valor");
		}
		

	}

}
