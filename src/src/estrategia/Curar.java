package estrategia;

import personajes.Personaje;

public class Curar implements EstrategiaPrincipal
{

	@Override
	public void ejecutar (Personaje personaje)
	{
		// código para curar el personaje
		System.out.println("El personaje se ha curado ");

		personaje.curar();
	}

}
