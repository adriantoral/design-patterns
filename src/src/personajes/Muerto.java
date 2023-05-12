package personajes;

/*
 * Clase para el Estado Muerto que va a mandar un mensaje de su estado
 * */
public class Muerto extends EstadoJugador{

	@Override
	public void hacerEstado() {
		System.out.println("JUGADOR MUERTO");
	}

}
