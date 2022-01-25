package practica2;

public abstract class Voladores {
	protected String nombre;
	protected String color; 
	protected String tamaño;
	public Voladores(String nombre, String color, String tamaño) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.tamaño = tamaño;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	@Override
	public String toString() {
		return "Voladores [nombre=" + nombre + ", color=" + color + ", tamaño=" + tamaño + "]";
	}
	

}
