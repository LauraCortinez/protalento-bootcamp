package practica2;

public class Helicoptero extends Voladores implements Aterrizaje {
	private int CapacidadPasajerosH;
	private String ModeloH;
	
	public Helicoptero(String nombre, String color, String tamaño, int capacidadPasajerosH, String modeloH) {
		super(nombre, color, tamaño);
		this.CapacidadPasajerosH = capacidadPasajerosH;
		this.ModeloH = modeloH;
		
	}

	public int getCapacidadPasajerosH() {
		return CapacidadPasajerosH;
	}
	public void setCapacidadPasajerosH(int capacidadPasajerosH) {
		CapacidadPasajerosH = capacidadPasajerosH;
	}
	public String getModeloH() {
		return ModeloH;
	}
	public void setModeloH(String modeloH) {
		ModeloH = modeloH;
	}
	@Override
	public String toString() {
		return "Helicoptero [CapacidadPasajerosH=" + CapacidadPasajerosH + ", ModeloH=" + ModeloH + "]";
	}
	public Resultado Aterrizar() {
		System.out.println("El helicoptero puede aterrizar");
		return null;
	}
	

}
