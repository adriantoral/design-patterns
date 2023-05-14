package armas.rango;

import armas.Arma;

public class Arco extends Arma
{
	/**
	 * Inicializa la clase Arco.
	 */
	public Arco ( )
	{
		super(20, 15, 10, "Arco de Dioses");
	}

	/**
	 * Repara el Arco en 6 puntos de utilidad.
	 */
	@Override
	public void reparar ( )
	{
		this.setUtilidad(this.getUtilidad( ) + 6);
	}
}
