package armas.defensa;

import armas.Arma;

public class Caparazon extends Arma
{

	/**
	 * Inicializa la clase caparazon.
	 */

	public Caparazon ( )
	{
		super(6, 17, 8, "Caparazon");

	}

	/**
	 * Repara el caparazon en 2 puntos de utilidad.
	 */
	@Override
	public void reparar ( )
	{

		this.setUtilidad(this.getUtilidad( ) + 2);
	}

}


