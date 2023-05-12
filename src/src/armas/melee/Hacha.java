package armas.melee;
import armas.Arma;

public class Hacha extends Arma
{
    /**
     * Inicializa la clase Hacha.
     */
    public Hacha()
    {
        super(10, 30, 4, "Hacha maldita");
    }

    /**
     * Repara el Hacha en 6 puntos de utilidad.
     */
    @Override
    public void reparar()
    {
        this.setUtilidad(this.getUtilidad() + 6);
    }
}