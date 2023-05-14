package estrategia;

import personajes.Personaje;

public class RepararArma implements EstrategiaPrincipal
{

	@Override
	public void ejecutar (Personaje personaje)
	{
		// código para reparar el arma
		
		System.out.println("El personaje ha reparado su arma ");

		personaje.repararArma();
	}

}
