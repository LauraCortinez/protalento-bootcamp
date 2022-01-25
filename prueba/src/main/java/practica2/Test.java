package practica2;

public class Test {

	public static void main(String[] args) {
		Avion av = new Avion("easyfly", "blanco", "grande", "A320", 50);
		Helicoptero he = new Helicoptero("militar", "gris", "mediano", 5, "B20");
		Superman su = new Superman("HenryCavil","Azul" ,"grande", "criptonita");
		Ovni ov = new Ovni("ET", "cafe", "mediana", 6, "AA2", "Venus");
		
		Voladores[] voladores = new Voladores[] {av,he,su,ov};
		for(Voladores vol: voladores) {
			if(vol instanceof Aterrizaje) {
				Aterrizaje a = (Aterrizaje)vol;
				Resultado res= a.Aterrizar();
				
			}else {
				System.out.println(vol +"no puede aterrizar");
			}
		}

	}

}
