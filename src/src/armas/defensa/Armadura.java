package armas.defensa;

import armas.Arma;

public class Armadura extends Arma
{
	/**
	 * Inicializa la clase Armadura.
	 */
	public Armadura ( )
	{
		super(5, 50, 15, "Armadura de Hierro");
	}

	/**
	 * Repara la Armadura en 2 puntos de utilidad.
	 */
	@Override
	public void reparar ( )
	{
		this.setUtilidad(this.getUtilidad( ) + 2);
	}
}