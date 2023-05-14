import estrategia.Jugar;
import mundos.Mundo1;
import mundos.Mundo2;
import mundos.Mundo3;
import mundos.Mundos;
import personajes.Jugador;
import personajes.Personaje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController
{
	private final Personaje jugador;
	private final List<Personaje> enemigos;
	private Mundos fabricaMundos;
	public static Scanner scanner = new Scanner(System.in);

	public GameController ( )
	{
		System.out.println("Elige el nombre de tu personaje: ");
		this.jugador = new Jugador(GameController.scanner.next( ));
		this.enemigos = new ArrayList<Personaje>( );
	}

	/**
	 * Juega el mundo 1.
	 * Genera los enemigos basados en la fabrica por niveles.
	 * Usa la funcion de juego para definir los ataques y turnos.
	 * Si muere terminara el juego, sino, pasara al mundo siguiente.
	 */
	private void jugarMundo1 ( )
	{
		System.out.println("JUGANDO MUNDO 1");

		/*
		 * Instancia la fabrica de los enemigos.
		 */
		this.fabricaMundos = new Mundo1( );

		/*
		 * Genera los enemigos con la fabrica de dicho nivel.
		 */
		this.limpiarEnemigos( );
		for (int i = 0; i < 2; i++) this.enemigos.add(this.fabricaMundos.creaGuerrero( ));
		for (int i = 0; i < 1; i++) this.enemigos.add(this.fabricaMundos.creaMutante( ));
		for (int i = 0; i < 2; i++) this.enemigos.add(this.fabricaMundos.creaMago( ));

		if (new Jugar(GameController.scanner).jugar(this.jugador, this.enemigos)) this.jugarMundo2( ); // Ha ganado el jugador y pasa al siguiente nivel
		else this.finalizarJuego( );
	}

	/**
	 * Juega el mundo 2.
	 * Genera los enemigos basados en la fabrica por niveles.
	 * Usa la funcion de juego para definir los ataques y turnos.
	 * Si muere terminara el juego, sino, pasara al mundo siguiente.
	 */
	private void jugarMundo2 ( )
	{
		System.out.println("JUGANDO MUNDO 2");

		/*
		 * Instancia la fabrica de los enemigos.
		 */
		this.fabricaMundos = new Mundo2( );

		/*
		 * Genera los enemigos con la fabrica de dicho nivel.
		 */
		this.limpiarEnemigos( );
		for (int i = 0; i < 4; i++) this.enemigos.add(this.fabricaMundos.creaGuerrero( ));
		for (int i = 0; i < 3; i++) this.enemigos.add(this.fabricaMundos.creaMutante( ));
		for (int i = 0; i < 3; i++) this.enemigos.add(this.fabricaMundos.creaMago( ));

		if (new Jugar(GameController.scanner).jugar(this.jugador, this.enemigos)) this.jugarMundo3( ); // Ha ganado el jugador y pasa al siguiente nivel
		else this.finalizarJuego( );
	}

	/**
	 * Juega el mundo 3.
	 * Genera los enemigos basados en la fabrica por niveles.
	 * Usa la funcion de juego para definir los ataques y turnos.
	 * Si muere terminara el juego, sino, terminara con una victoria.
	 */
	private void jugarMundo3 ( )
	{
		System.out.println("JUGANDO MUNDO 3");

		/*
		 * Instancia la fabrica de los enemigos.
		 */
		this.fabricaMundos = new Mundo3( );

		/*
		 * Genera los enemigos con la fabrica de dicho nivel.
		 */
		this.limpiarEnemigos( );
		for (int i = 0; i < 5; i++) this.enemigos.add(this.fabricaMundos.creaGuerrero( ));
		for (int i = 0; i < 5; i++) this.enemigos.add(this.fabricaMundos.creaMutante( ));
		for (int i = 0; i < 5; i++) this.enemigos.add(this.fabricaMundos.creaMago( ));

		if (new Jugar(GameController.scanner).jugar(this.jugador, this.enemigos)) this.victoria( ); // Ha ganado el jugador y se le da la victoria
		else this.finalizarJuego( );
	}

	/**
	 * Llama internamente a jugarMundo1 para iniciar el juego.
	 */
	public void jugar ( )
	{
		this.jugarMundo1( );
	}

	/**
	 * Finaliza el juego y muestra un mensaje de derrota.
	 */
	private void finalizarJuego ( )
	{
		System.out.println("HAS PERDIDO EL JUEGO!");
		this.cerrarScanner( );
	}

	/**
	 * Finaliza el juego y muestra un mensaje de victoria.
	 */
	private void victoria ( )
	{
		System.out.println("HAS GANADO EL JUEGO!");
		this.cerrarScanner( );
	}

	/**
	 * Elimina el array de enemigos para pasar de mundo.
	 */
	private void limpiarEnemigos ( )
	{
		this.enemigos.clear( );
	}

	private void cerrarScanner ( )
	{
		GameController.scanner.close( );
	}
}
