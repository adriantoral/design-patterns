package personajes;

import armas.melee.Martillo;
import calculador.Calculador;
import decorator.Ataque;
import decorator.AtaqueDebil;
import decorator.AtaqueFuerte;
import decorator.AtaqueNormal;
import estrategia.*;


public class Jugador extends Personaje
{

	//Variable para controlar el estado
	private EstadoJugador estado;
	//Control de los ataques
	private final Ataques ataques;

	/**
	 * Inicializa la clase Jugador.
	 */
	public Jugador ( )
	{
		super(25, 40, 33, new Martillo( ));
		this.ataques = new Ataques( );
	}

	/**
	 * SETTER que va a cambiar el estado del personaje
	 */

	//Setter que nos va a ayudar a cambiar de estado
	public void setEstado (EstadoJugador estado)
	{
		this.estado = estado;
	}

	//Metodo que va a realizar la funcion
	public void hacerEstado ( )
	{
		estado.hacerEstado( );
	}

	/**
	 * @param personaje El personaje a atacar.
	 */
	@Override
	public void atacar (Personaje personaje)
	{
		Ataque ataque = new AtaqueNormal(this), ataqueDecorado;

		if (this.getFuerza( ) <= 25) ataqueDecorado = new AtaqueDebil(ataque);
		else if (this.getFuerza( ) > 25 && this.getFuerza( ) <= 40) ataqueDecorado = ataque;
		else ataqueDecorado = new AtaqueFuerte(ataque);

		ataqueDecorado.atacar( );
		personaje.setVida(personaje.getVida( ) - Calculador.getCalculador( ).calculaResultadoAtaque(this, personaje));

		Ataques ataques = new Ataques( );
		ataques.ejecutar(this);
	}

	/**
	 * Cura al personaje en 20 unidades de vida.
	 */
	@Override
	public void curar ( )
	{
		this.setVida(this.getVida( ) + 20);
		Curar curar = new Curar( );
		curar.ejecutar(this);
	}

	/**
	 * Aumenta la resistencia en 5 unidades.
	 */
	@Override
	public void defender ( )
	{
		this.setResistencia(this.getResistencia( ) + 5);
		Defensa defender = new Defensa( );
		defender.ejecutar(this);
	}

	/**
	 *
	 */
	@Override
	public void pasar ( )
	{
		Pasar pasar = new Pasar( );
		pasar.ejecutar(this);
	}

	/**
	 * Repara el arma.
	 */
	@Override
	public void repararArma ( )
	{
		this.getArma( ).reparar( );
		RepararArma reparar = new RepararArma( );
		reparar.ejecutar(this);
	}
}
