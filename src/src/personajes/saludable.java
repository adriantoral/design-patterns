package personajes;

/**
* Clase para el Estado SALUDABLE que va a mandar un mensaje de su estado
**/

public class saludable extends patronState{

	@Override
	public void hacerEstado() {
		System.out.println("JUGADOR SALUDABLE");
	}

}
