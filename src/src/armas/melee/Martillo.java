package armas.melee;

import armas.Arma;

public class Martillo extends Arma
{
	/**
	 * Inicializa la clase Martillo.
	 */
	public Martillo ( )
	{
		super(12, 20, 6, "Martillo de Thor");
	}

	/**
	 * Repara el martillo en 4 puntos de utilidad.
	 */
	@Override
	public void reparar ( )
	{
		this.setUtilidad(this.getUtilidad( ) + 4);
	}
}
