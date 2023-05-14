package personajes;

import armas.Arma;
import calculador.Calculador;
import decorator.Ataque;
import decorator.AtaqueDebil;
import decorator.AtaqueFuerte;
import decorator.AtaqueNormal;
import personajes.estados.Herido;
import personajes.estados.Malherido;
import personajes.estados.Muerto;
import personajes.estados.Saludable;


public abstract class Personaje
{
	/**
	 * La fuerza es el danio que hace el personaje de base, se combina con el danio del arma.
	 * La resistencia es cuanto puede aguantar los personajes al danio recibido.
	 * La agilidad es la rapidez con la que ataca el personaje, cuanta mas agilidad mas rapido atacara.
	 * La vida es cuanto le queda al personaje para morir, se combina con estadoVida para mas precision.
	 * El arma lo usa el personaje para hacer mas danio.
	 */
	private int fuerza, resistencia, agilidad, vida;
	private static int contador = 0;
	private String nombre;

	private EstadoVida estadoVida;
	private EstadoJugador estadoJugador;

	private Arma arma;

	/**
	 * Inicializa la clase Personaje con la fuerza, resistencia, agilidad, vida y arma.
	 */
	public Personaje (int fuerza, int resistencia, int agilidad, Arma arma)
	{
		this.fuerza = fuerza;
		this.resistencia = resistencia;
		this.agilidad = agilidad;
		this.vida = 100;
		this.estadoVida = EstadoVida.SALUDABLE;
		this.estadoJugador = new Saludable(this);
		this.arma = arma;
		this.nombre = "Personaje" + Personaje.contador++;
	}

	public Personaje (int fuerza, int resistencia, int agilidad, String nombre, Arma arma)
	{
		this(fuerza, resistencia, agilidad, arma);
		this.nombre = nombre;
	}

	/**
	 * Con esta funcion el personaje ataca a otro personaje.
	 */
	public void atacar (Personaje personaje)
	{
		Ataque ataque = new AtaqueNormal(this), ataqueDecorado;

		if (this.getFuerza( ) <= 25) ataqueDecorado = new AtaqueDebil(ataque);
		else if (this.getFuerza( ) > 25 && this.getFuerza( ) <= 40) ataqueDecorado = ataque;
		else ataqueDecorado = new AtaqueFuerte(ataque);

		ataqueDecorado.atacar( );
		personaje.setVida(personaje.getVida( ) - Calculador.getCalculador( ).calculaResultadoAtaque(this, personaje));

		personaje.cambiarEstado( );
	}

	/**
	 * Con esta funcion el personaje se cura vida.
	 */
	public abstract void curar ( );

	/**
	 * Esta funcion se usa para aumentar las resistencias del personaje.
	 */
	public abstract void defender ( );

	/**
	 * Esta funcion salta el turno del personaje.
	 */
	public abstract void pasar ( );

	/**
	 * Esta funcion repara la utilidad del arma.
	 */
	public abstract void repararArma ( );

	public int getFuerza ( )
	{
		return fuerza;
	}

	public void setFuerza (int fuerza)
	{
		this.fuerza = fuerza;
	}

	public int getResistencia ( )
	{
		return resistencia;
	}

	public void setResistencia (int resistencia)
	{
		this.resistencia = resistencia;
	}

	public int getAgilidad ( )
	{
		return agilidad;
	}

	public void setAgilidad (int agilidad)
	{
		this.agilidad = agilidad;
	}

	public int getVida ( )
	{
		return vida;
	}

	public void setVida (int vida)
	{
		this.vida = vida;
	}

	public EstadoVida getEstadoVida ( )
	{
		return estadoVida;
	}

	public void setEstadoVida (EstadoVida estadoVida)
	{
		this.estadoVida = estadoVida;
	}

	public Arma getArma ( )
	{
		return arma;
	}

	public void setArma (Arma arma)
	{
		this.arma = arma;
	}

	public String getNombre ( ) {return nombre;}

	public void setNombre (String nombre) {this.nombre = nombre;}

	//Metodo que cuando lo llames, va a coger la vida que tenga el personaje y segun cumpla una u otra condicion, llama a una funcion u a otra
	public void cambiarEstado ( )
	{
		int porcentajeVida = this.getVida( );

		if (porcentajeVida >= 0 && porcentajeVida < 25) this.estadoJugador = new Muerto(this);
		else if (porcentajeVida >= 25 && porcentajeVida < 50) this.estadoJugador = new Malherido(this);
		else if (porcentajeVida >= 50 && porcentajeVida < 75) this.estadoJugador = new Herido(this);
		else if (porcentajeVida >= 75 && porcentajeVida <= 100) this.estadoJugador = new Saludable(this);
	}

	@Override
	public String toString ( )
	{
		return "Personaje [fuerza=" + fuerza + ", resistencia=" + resistencia + ", agilidad=" + agilidad + ", vida=" + vida + ", estadoVida=" + estadoVida + ", estadoJugador=" + estadoJugador + ", arma=" + arma + "]";
	}
}
