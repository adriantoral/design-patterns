package estrategia;

import personajes.Personaje;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Jugar
{
	private final Scanner scanner;

	public Jugar (Scanner scanner)
	{
		this.scanner = scanner;
	}

	public boolean jugar (Personaje jugador, List<Personaje> enemigos)
	{
		// Agrega al jugador en la primera posicion de la lista
		enemigos.add(0, jugador);

		// Variables de los personajes del juego
		Personaje personajeAtacante, personajeAtacado;

		// Variables para las opciones de juego
		int opcion = 0;

		// Variable para simular el juego
		boolean isSimulacion = false;

		// Bucle del juego
		while (enemigos.size( ) > 1)
		{
			// Seleccion de los personajes
			personajeAtacante = enemigos.remove(0); // Primer personaje de la lista
			personajeAtacado = enemigos.get(new Random( ).nextInt(enemigos.size( ))); // Personaje aleatorio de la lista
			enemigos.add(personajeAtacante); // Meter de nuevo al personaje sacado

			System.out.println("Turno del personaje: " + personajeAtacante.getNombre( ) + "\nAtacando al personaje: " + personajeAtacado.getNombre( ));

			if (personajeAtacante == jugador && !isSimulacion)
			{
				do
				{
					System.out.println("Seleccione una opcion del turno:\n 0) Atacar\n 1) Defender\n 2) Pasar\n 3) Reparar herramienta\n 4) Curar");
					opcion = this.scanner.nextInt( );

					if (opcion == -1) System.out.println("Menu especial:\n -2) Activar modo simulacion (no control)\n -3) Mostrar informacion de tu personaje\n -4) Mostrar informacion del personaje atacado");

					else if (opcion == -2)
					{
						isSimulacion = true;
						break;
					}

					else if (opcion == -3) System.out.println("\u001B[35m" + personajeAtacante + "\u001B[37m");

					else if (opcion == -4) System.out.println("\u001B[35m" + personajeAtacado + "\u001B[37m");
				}
				while (opcion < 0 || opcion > 4);
			}
			else opcion = new Random( ).nextInt(4);

			if (opcion == 0) // Funcion atacar
				new Ataques( ).ejecutar(personajeAtacante, personajeAtacado);

			else if (opcion == 1) // Funcion defensa
				new Defensa( ).ejecutar(personajeAtacante);

			else if (opcion == 2) // Funcion pasar
				new Pasar( ).ejecutar(personajeAtacante);

			else if (opcion == 3) // Funcion reparar
				new RepararArma( ).ejecutar(personajeAtacante);

			else // Funcion curar
				new Curar( ).ejecutar(personajeAtacante);


			// Eliminar personajes si mueren
			if (personajeAtacado.getVida( ) <= 0) System.out.println("Se ha eliminado al personaje: " + personajeAtacado.getNombre( ) + " : " + enemigos.remove(personajeAtacado));

			if (personajeAtacante.getVida( ) <= 0) System.out.println("Se ha eliminado al personaje: " + personajeAtacante.getNombre( ) + " : " + enemigos.remove(personajeAtacante));

			if (personajeAtacante == jugador)
			{
				try
				{
					TimeUnit.SECONDS.sleep(1);
				}
				catch (InterruptedException ex)
				{
					throw new RuntimeException(ex);
				}
			}
		}

		System.out.println("HA GANADO EL PERSONAJE: " + enemigos.get(0).getNombre( ));

		return enemigos.get(0) == jugador;
	}
}
