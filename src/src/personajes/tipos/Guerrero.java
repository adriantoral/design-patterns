package personajes.tipos;

import armas.Arma;
import calculador.Calculador;
import personajes.EstadoVida;
import personajes.Personaje;

public class Guerrero extends Personaje
{

    /*Creamos el Guerrero con vida 100 y estado de vida saludable. Mediante el Abstract Factory, dependiendo del mundo, los valores fuerza,
    * resistencia, agilidad y el arma cambiarán.*/
    public Guerrero(int fuerza, int resistencia, int agilidad, Arma arma)
    {
        super(fuerza, resistencia, agilidad, arma);
        setVida(100);
        setEstadoVida(EstadoVida.SALUDABLE);
    }
    @Override
    public void atacar(Personaje personaje)
    {

        Calculador c = Calculador.getCalculador();
        //c.calculaResultadoAtaque(, personaje);

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
