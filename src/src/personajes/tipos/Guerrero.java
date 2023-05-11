package personajes.tipos;

import Armas.Arma;
import personajes.Personaje;

public class Guerrero extends Personaje
{
    public Guerrero(int fuerza, int resistencia, int agilidad, Arma arma)
    {
        super(fuerza, resistencia, agilidad, arma);
    }

    @Override
    public void atacar(Personaje personaje)
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
