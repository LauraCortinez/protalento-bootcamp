package clase3;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		
//ingrese contraseņa y usuario  
		// si contraseņa = 1234 y usuario = admin => "ok"
		// de lo contrario "fail"
		
	String usuario; 
	String contrasenia;
	
	usuario = "jose";
	contrasenia = "12345";
	
	if(usuario == "admin" && contrasenia == "1234") {
		System.out.println("ok");
	}else {
		System.err.println("fail");
	}
	if(usuario == "admin") {
		if(contrasenia == "1234") {
			System.out.println("ok");
		}else {
			System.err.println("fail");
		}
	}else {
		System.err.println("fail");
		
	}
	
		
	}

}
