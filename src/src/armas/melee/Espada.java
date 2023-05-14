package armas.melee;
import armas.Arma;

public class Espada extends Arma
{
	/**
	 * Inicializa la clase Espada.
	 */
     
	public Espada() {
		super(13, 17, 8, "Espada de la muerte");
	}
		
	@Override
	public void reparar ( )
	{
		/**
		 * Repara estapada con 3 puntos de utilidad.
		 */
	     
		this.setUtilidad(this.getUtilidad( ) + 3);
	}

}


