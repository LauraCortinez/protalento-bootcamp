package practica2;

public class Ovni extends Voladores{
	private int CapacidadAlienO;
	private String ModeloO;
	private String Planeta;
	
	
	public Ovni(String nombre, String color, String tamaño, int capacidadAlienO, String modeloO, String planeta) {
		super(nombre, color, tamaño);
		CapacidadAlienO = capacidadAlienO;
		ModeloO = modeloO;
		Planeta = planeta;
	}
	public int getCapacidadAlienO() {
		return CapacidadAlienO;
	}
	public void setCapacidadAlienO(int capacidadAlienO) {
		CapacidadAlienO = capacidadAlienO;
	}
	public String getModeloO() {
		return ModeloO;
	}
	public void setModeloO(String modeloO) {
		ModeloO = modeloO;
	}
	public String getPlaneta() {
		return Planeta;
	}
	public void setPlaneta(String planeta) {
		Planeta = planeta;
	}
	@Override
	public String toString() {
		return "Ovni [CapacidadAlienO=" + CapacidadAlienO + ", ModeloO=" + ModeloO + ", Planeta=" + Planeta + "]";
	}
	
	
	
	
	

}
