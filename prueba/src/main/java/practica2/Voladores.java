package practica2;

public abstract class Voladores {
	protected String nombre;
	protected String color; 
	protected String tama�o;
	public Voladores(String nombre, String color, String tama�o) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.tama�o = tama�o;
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
	public String getTama�o() {
		return tama�o;
	}
	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}
	@Override
	public String toString() {
		return "Voladores [nombre=" + nombre + ", color=" + color + ", tama�o=" + tama�o + "]";
	}
	

}
