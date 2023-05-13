package armas.melee;

import armas.Arma;

public class Espada extends Arma
{

	public Espada ( )
	{
		super(13, 17, 8, "Espada de Link");
		//inicia la clase Espada

	}

	@Override
	public void reparar ( )
	{
		//reparar la espada con 3 puntos de utilidad

		this.setUtilidad(this.getUtilidad( ) + 3);
	}

}


