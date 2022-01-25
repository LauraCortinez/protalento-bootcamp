package practica2;

public class Superman extends Voladores{
	private String debilidad;

	public Superman(String nombre, String color, String tama�o, String debilidad) {
		super(nombre, color, tama�o);
		this.debilidad = debilidad;
	}

	public String getDebilidad() {
		return debilidad;
	}

	public void setDebilidad(String debilidad) {
		this.debilidad = debilidad;
	}

	@Override
	public String toString() {
		return "Superman [debilidad=" + debilidad + "]";
	} 
	
	

}
