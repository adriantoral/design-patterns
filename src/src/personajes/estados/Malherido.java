package personajes.estados;

import personajes.EstadoJugador;
import personajes.EstadoVida;
import personajes.Personaje;

public class Malherido extends EstadoJugador
{
	public Malherido (Personaje personaje)
	{
		super(personaje);
		this.personaje.setEstadoVida(EstadoVida.MALHERIDO);
	}

	@Override
	public void hacerEstado ( )
	{
		System.out.println("PERSONAJE MALHERIDO");
	}
}