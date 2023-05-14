package personajes.estados;

import personajes.EstadoJugador;
import personajes.EstadoVida;
import personajes.Personaje;

public class Saludable extends EstadoJugador
{
	public Saludable (Personaje personaje)
	{
		super(personaje);
		this.personaje.setEstadoVida(EstadoVida.SALUDABLE);
	}

	@Override
	public void hacerEstado ( )
	{
		System.out.println("PERSONAJE SALUDABLE");
	}
}
