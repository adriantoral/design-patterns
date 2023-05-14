package personajes.estados;

import personajes.EstadoJugador;
import personajes.EstadoVida;

public class Malherido extends EstadoJugador
{

	public Malherido ( )
	{
		super.personaje.setEstadoVida(EstadoVida.MALHERIDO);
	}

	@Override
	public void hacerEstado ( )
	{
		System.out.println("PERSONAJE MALHERIDO");
	}

}