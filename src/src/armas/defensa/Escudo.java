package armas.defensa;

import armas.Arma;

public class Escudo extends Arma
{
    //Inicializa la clase Escudo.
     
    public Escudo()
    {
        super(5, 40, 20, "Escudo de hierro");
    }

   // Repara El escudo en 2 puntos de utilidad.
    
    @Override
    public void reparar()
    {
        this.setUtilidad(this.getUtilidad() + 2);
    }
}
