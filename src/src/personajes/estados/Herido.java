package personajes.estados;

import personajes.EstadoJugador;
import personajes.EstadoVida;

public class Herido extends EstadoJugador
{

	public Herido ( )
	{
		super.personaje.setEstadoVida(EstadoVida.HERIDO);
	}

	@Override
	public void hacerEstado ( )
	{
		System.out.println("PERSONAJE HERIDO");
	}

}
