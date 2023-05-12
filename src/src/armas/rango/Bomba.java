package armas.rango;

import armas.Arma;

public class Bomba extends Arma
{
    /**
     * Inicializa la clase Bomba.
     */
    public Bomba()
    {
        super(35, 20, 2, "MegaBomba Incendiaria");
    }

    /**
     * Repara la Bomba en 8 puntos de utilidad.
     */
    @Override
    public void reparar()
    {
        this.setUtilidad(this.getUtilidad() + 8);
    }
}
