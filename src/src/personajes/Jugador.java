package personajes;

import armas.melee.Martillo;
import estrategia.Ataques;


public class Jugador extends Personaje
{

	//Variable para controlar el estado
	private EstadoJugador estado;
	//Control de los ataques
	private final Ataques ataques;

	/**
	 * Inicializa la clase Jugador.
	 */
	public Jugador (String nombre)
	{
		super(25, 40, 33, nombre, new Martillo( ));
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
	 * Cura al personaje en 20 unidades de vida.
	 */
	@Override
	public void curar ( )
	{
		this.setVida(this.getVida( ) + 20);
		this.cambiarEstado( );
	}

	/**
	 * Aumenta la resistencia en 5 unidades.
	 */
	@Override
	public void defender ( )
	{
		this.setResistencia(this.getResistencia( ) + 5);
	}

	/**
	 *
	 */
	@Override
	public void pasar ( )
	{
		// Pasar
	}

	/**
	 * Repara el arma.
	 */
	@Override
	public void repararArma ( )
	{
		this.getArma( ).reparar( );
	}
}
