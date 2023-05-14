package personajes.tipos;

import armas.Arma;
import personajes.Personaje;


public abstract class Guerrero extends Personaje
{
	public Guerrero (int fuerza, int resistencia, int agilidad, Arma arma)
	{
		super(fuerza, resistencia, agilidad, arma);
	}

	@Override
	public void curar ( )
	{
		this.setVida(this.getVida( ) + 20);
	}

	@Override
	public void defender ( )
	{
		this.setResistencia(this.getResistencia( ) + 5);
	}

	@Override
	public void pasar ( )
	{
		// Pasar
	}


	@Override
	public void repararArma ( )
	{
		this.getArma( ).reparar( );
	}
}
