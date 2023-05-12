package armas.defensa;

import armas.Arma;

public class Caparazon extends Arma {

	public Caparazon() {
		super(6, 17, 8, "Caparazon");
		//inicia la clase Espada
		
	}

	@Override
	public void reparar() {
		//reparar el caparazon a con 2 puntos de utilidad
		
		this.setUtilidad(this.getUtilidad() + 2);
	}
	
}


