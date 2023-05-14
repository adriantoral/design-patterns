package armas.defensa;


import armas.Arma;

public class Escudo extends Arma
{

	/**
	 * Inicializa la clase Escudo.
	 */
     
    public Escudo()
    {
        super(5, 40, 20, "Escudo de hierro");
    }


	/**
	 * Inicializa la clase Escudo.
	 */
    
    @Override
    public void reparar()
    {
        this.setUtilidad(this.getUtilidad() + 2);
    }
}
