package personajes.estados;

import personajes.EstadoJugador;
import personajes.EstadoVida;
import personajes.Personaje;

public class Muerto extends EstadoJugador
{
	public Muerto (Personaje personaje)
	{
		super(personaje);
		this.personaje.setEstadoVida(EstadoVida.MUERTO);
	}

	@Override
	public void hacerEstado ( )
	{
		System.out.println("PERSONABLE MUERTO");
	}
}
