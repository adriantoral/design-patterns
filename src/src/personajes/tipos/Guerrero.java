package personajes.tipos;

import armas.Arma;
import calculador.Calculador;
import decorator.Ataque;
import decorator.AtaqueDebil;
import decorator.AtaqueFuerte;
import decorator.AtaqueNormal;
import estrategia.*;
import personajes.Personaje;


public abstract class Guerrero extends Personaje
{
	public Guerrero (int fuerza, int resistencia, int agilidad, Arma arma)
	{
		super(fuerza, resistencia, agilidad, arma);
	}

	@Override
	public void atacar (Personaje personaje)
	{
		Ataque ataque = new AtaqueNormal(this), ataqueDecorado;

		if (this.getFuerza( ) <= 25) ataqueDecorado = new AtaqueDebil(ataque);
		else if (this.getFuerza( ) > 25 && this.getFuerza( ) <= 40) ataqueDecorado = ataque;
		else ataqueDecorado = new AtaqueFuerte(ataque);

		ataqueDecorado.atacar( );
		personaje.setVida(personaje.getVida( ) - Calculador.getCalculador( ).calculaResultadoAtaque(this, personaje));

		Ataques ataques = new Ataques();
		ataques.ejecutar(this);
	}


	@Override
	public void curar ( )
	{
		this.setVida(this.getVida( ) + 20);
		Curar curar = new Curar();
		curar.ejecutar(this);
	}

	@Override
	public void defender ( )
	{
		this.setResistencia(this.getResistencia( ) + 5);
		Defensa defender = new Defensa();
		defender.ejecutar(this);
	}

	@Override
	public void pasar ( )
	{
		Pasar pasar= new Pasar();
		pasar.ejecutar(this);
	}


	@Override
	public void repararArma ( )
	{
		this.getArma( ).reparar( );
		RepararArma reparar = new RepararArma();
		reparar.ejecutar(this);
	}
}
