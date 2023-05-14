package estrategia;

import personajes.Personaje;

public class Pasar implements EstrategiaPrincipal
{

	@Override
	public void ejecutar (Personaje personaje)
	{
		// código para pasar el turno 
		System.out.println("El personaje ha pasado su turno.");

		personaje.pasar();
	}

}
