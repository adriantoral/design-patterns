package personajes;

/**
* Clase para el Estado SALUDABLE que va a mandar un mensaje de su estado
**/

public class Saludable extends EstadoJugador{

	@Override
	public void hacerEstado() {
		System.out.println("JUGADOR SALUDABLE");
	}

}
