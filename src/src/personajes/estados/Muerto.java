package personajes.estados;

import personajes.EstadoJugador;
import personajes.EstadoVida;

public class Muerto extends EstadoJugador{
	
	public Muerto() {
		super.personaje.setEstadoVida(EstadoVida.MUERTO);
	}

	@Override
	public void hacerEstado() {
		System.out.println("PERSONABLE MUERTO");
	}

}
