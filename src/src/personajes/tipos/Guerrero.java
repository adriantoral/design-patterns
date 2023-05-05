package personajes.tipos;

import Armas.Arma;
import personajes.EstadoVida;
import personajes.Personaje;

public class Guerrero extends Personaje
{
    public Guerrero(int fuerza, int resistencia, int agilidad, int vida, EstadoVida estadoVida, Arma arma)
    {
        super(fuerza, resistencia, agilidad, vida, estadoVida, arma);
    }

    @Override
    public void atacar()
    {

    }

    @Override
    public void curar()
    {

    }

    @Override
    public void defender()
    {

    }

    @Override
    public void pasar()
    {

    }

    @Override
    public void repararArma()
    {

    }
}
