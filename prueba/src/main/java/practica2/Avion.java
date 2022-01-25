package practica2;

public class Avion extends Voladores implements Aterrizaje{
	private String modeloAvion;
	private int CapacidadPasajerosAvion;
	
	
	public Avion(String nombre, String color, String tamaño, String modeloAvion, int capacidadPasajerosAvion) {
		super(nombre, color, tamaño);
		this.modeloAvion = modeloAvion;
		this.CapacidadPasajerosAvion = capacidadPasajerosAvion;
	}


	public String getModeloAvion() {
		return modeloAvion;
	}


	public void setModeloAvion(String modeloAvion) {
		this.modeloAvion = modeloAvion;
	}


	public int getCapacidadPasajerosAvion() {
		return CapacidadPasajerosAvion;
	}


	public void setCapacidadPasajerosAvion(int capacidadPasajerosAvion) {
		CapacidadPasajerosAvion = capacidadPasajerosAvion;
	}


	public Resultado Aterrizar() {
		System.out.println("el avion puede aterrizar");
		return null;
	}
	

}
