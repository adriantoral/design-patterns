package personajes.estados;

import personajes.EstadoJugador;
import personajes.EstadoVida;

public class Saludable extends EstadoJugador{
	
	public Saludable() {
		super.personaje.setEstadoVida(EstadoVida.SALUDABLE);
	}

	@Override
	public void hacerEstado() {
		System.out.println("PERSONAJE SALUDABLE");
	}

}
