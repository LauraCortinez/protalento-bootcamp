package clase4;

public class VectorObject {

	public static void main(String[] args) {
		// Object es la base de todos los tipos de java , es decir se le puede asignar a calquier cosa.
		Object edad = 10;
		Object nombres = "Laura";
		Object flag = true;
		Object letra = "a";
		
		Object[] datos = new Object[] {edad,nombres,flag,letra};
		
		// determinar que datos son de tipo boolean
		for(Object dato : datos) {
			if(dato instanceof Boolean) {
				Boolean aux = (Boolean)dato;
				;
				System.out.println("encontre" + aux);
			}
		}

	}

}
