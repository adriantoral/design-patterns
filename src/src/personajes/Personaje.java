package personajes;

import Armas.Arma;

public abstract class Personaje
{
    private int fuerza, resistencia, agilidad, vida;

    private EstadoVida estadoVida;

    private Arma arma;

    public Personaje(int fuerza, int resistencia, int agilidad, int vida, EstadoVida estadoVida, Arma arma)
    {
        this.fuerza = fuerza;
        this.resistencia = resistencia;
        this.agilidad = agilidad;
        this.vida = vida;
        this.estadoVida = estadoVida;
        this.arma = arma;
    }

    public abstract void atacar();

    public abstract void curar();

    public abstract void defender();

    public abstract void pasar();

    public abstract void repararArma();

    public int getFuerza()
    {
        return fuerza;
    }

    public void setFuerza(int fuerza)
    {
        this.fuerza = fuerza;
    }

    public int getResistencia()
    {
        return resistencia;
    }

    public void setResistencia(int resistencia)
    {
        this.resistencia = resistencia;
    }

    public int getAgilidad()
    {
        return agilidad;
    }

    public void setAgilidad(int agilidad)
    {
        this.agilidad = agilidad;
    }

    public int getVida()
    {
        return vida;
    }

    public void setVida(int vida)
    {
        this.vida = vida;
    }

    public EstadoVida getEstadoVida()
    {
        return estadoVida;
    }

    public void setEstadoVida(EstadoVida estadoVida)
    {
        this.estadoVida = estadoVida;
    }

    public Arma getArma()
    {
        return arma;
    }

    public void setArma(Arma arma)
    {
        this.arma = arma;
    }
}
