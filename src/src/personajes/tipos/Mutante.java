package personajes.tipos;

import armas.Arma;
import personajes.Personaje;

public class Mutante extends Personaje
{
    public Mutante(int fuerza, int resistencia, int agilidad, Arma arma)
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
