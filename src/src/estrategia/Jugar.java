package estrategia;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import estrategia.*;

import personajes.Personaje;

public class Jugar{
	public void jugar (Personaje jugador, List<Personaje> enemigos)
	{
		// Variables de los personajes del juego
		Personaje personajeAtacante, personajeAtacado;

		// Variables para las opciones de juego
		int opcion = 0, opcion2 = 1;

		// Variable para simular el juego
		boolean isSimulacion = false;

		// Variable para el scanner
		Scanner scanner = new Scanner(System.in);

		// Bucle del juego
		while (enemigos.size( ) > 1)
		{
			// Seleccion de los personajes
			personajeAtacante = enemigos.remove(0); // Primer personaje de la lista
			personajeAtacado = enemigos.get(new Random( ).nextInt(enemigos.size( ))); // Personaje aleatorio de la lista
			enemigos.add(personajeAtacante); // Meter de nuevo al personaje sacado

			System.out.println("Turno del personaje: " + personajeAtacante + "\nAtacando al personaje: " + personajeAtacado);

			if (personajeAtacante == jugador && !isSimulacion)
			{
				do
				{
					System.out.println("Seleccione una opcion del turno:\n 0) Atacar\n 1) Defender 1\n 2) Pasar 2\n 3) Reparar herramienta\n 4)Curar\n");
					opcion = scanner.nextInt( );

					if (opcion == -1) System.out.println("Menu especial:\n -2) Activar modo simulacion (no control)\n -3) Mostrar informacion de tu personaje\n -4) Mostrar informacion del personaje atacado");

					else if (opcion == -2)
					{
						isSimulacion = true;
						break;
					}

					else if (opcion == -3) System.out.println("\u001B[35m" + personajeAtacante + "\u001B[37m");

					else if (opcion == -4) System.out.println("\u001B[35m" + personajeAtacado + "\u001B[37m");
				}
				while (opcion < 0 || opcion > 3);
			}
			else opcion = new Random( ).nextInt(4);

			if (opcion == 0 )
			{
				//funcion atacar
				new Ataques().ejecutar(personajeAtacante, personajeAtacado);
			}else if(opcion==1){
				//funcion defensa
				new Defensa().ejecutar(personajeAtacante);
			}else if(opcion==2){
				//funcion pasar
				new Pasar().ejecutar(personajeAtacante);
			}else if(opcion==3){
				//funcion reparar
				new RepararArma().ejecutar(personajeAtacante);
			}else {
				//funcion curar
				new Curar().ejecutar(personajeAtacante);
			}
 

			// Eliminar personajes si mueren
			if (personajeAtacado.getVida( ) <= 0) System.out.println("Se ha eliminado al personaje: " + enemigos.remove(personajeAtacado));

			if (personajeAtacante.getVida( ) <= 0) System.out.println("Se ha eliminado al personaje: " + enemigos.remove(personajeAtacante));

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

		System.out.println("HA GANADO EL PERSONAJE: " + enemigos.get(0));

		scanner.close( );
	}
}
