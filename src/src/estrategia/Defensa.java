package estrategia;

import personajes.Personaje;

public class Defensa implements EstrategiaPrincipal{

	@Override
	public void ejecutar(Personaje personaje) {
		// código para realizar la defensa
		 System.out.println("El personaje ha aumentado la defensa en un " + personaje.getResistencia());
		
	}

}
