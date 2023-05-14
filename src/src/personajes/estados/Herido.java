package personajes.estados;

import personajes.EstadoJugador;
import personajes.EstadoVida;
import personajes.Personaje;

public class Herido extends EstadoJugador
{
	public Herido (Personaje personaje)
	{
		super(personaje);
		this.personaje.setEstadoVida(EstadoVida.HERIDO);
	}

	@Override
	public void hacerEstado ( )
	{
		System.out.println("PERSONAJE HERIDO");
	}
}
