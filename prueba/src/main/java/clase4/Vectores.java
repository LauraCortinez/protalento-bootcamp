package clase4;

import java.util.Arrays;

public class Vectores {

	public static void main(String[] args) {
		// crear vectores 
		//tipoDatos[] nombre = new tipoDeDatos[] {valor1,valor2 ... valorn}
		//tipoDatos[] nombre = new tipoDeDato[tama�o]
		
		//crear un vector vacio
		String[] nombres = new String[] {"luz","jos�","edwin","carlos","herana", "samir","elsa"};
		String[] nombresConE = new String[nombres.length];
		//int size = nombres.length; // sabemos el tama�o del vector 
		
		// buscar los nombres que inicien con e 
		

		 int j = 0;
          for(int i=0; i < nombres.length; i++) {
			String nombre = nombres [i];
			if(nombre.startsWith("e")) {
				nombresConE[j] = nombre;
				j++;
				
			}
		}
 System.out.println(Arrays.toString(nombresConE));
	}

}
