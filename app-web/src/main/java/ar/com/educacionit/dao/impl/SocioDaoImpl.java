package ar.com.educacionit.dao.impl;

import ar.com.educacionit.dao.Icrud;
import ar.com.educacionit.domain.Socios;

public class SocioDaoImpl implements Icrud {
	public Socios create() {
		
		return new Socios ("carlos", "lopez", "krloss@gmail.com", "av siempre viva 46", 1l);
	}

}
