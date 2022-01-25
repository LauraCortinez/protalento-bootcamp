package clase4;

public class Matriz {

	public static void main(String[] args) {
		// una matriz que me cargue nombre y edad 
		int cantfilas = 2;
		int cantcols = 2;
		Integer[][] matriz =  new Integer [cantfilas][cantcols];
		//cargamos 
		for(int fila=0; fila < cantfilas; fila++) {
			
			for(int columna=0;columna<cantcols;columna++) {
				matriz[fila][columna] = (fila+columna);
				
			}
		}
	//mostrar 
	for(int fila=0; fila < cantfilas; fila++) {
		
		for(int columna=0;columna<cantcols;columna++) {
			System.out.print(fila+ "-"+columna+"-"+matriz[fila][columna]);
		
		}	
}
}
}
