package personajes;

import armas.Arma;

public abstract class Personaje
{
    /**
     * La fuerza es el danio que hace el personaje de base, se combina con el danio del arma.
     * La resistencia es cuanto puede aguantar los personajes al danio recibido.
     * La agilidad es la rapidez con la que ataca el personaje, cuanta mas agilidad mas rapido atacara.
     * La vida es cuanto le queda al personaje para morir, se combina con estadoVida para mas precision.
     * El arma lo usa el personaje para hacer mas danio.
     */
    private int fuerza, resistencia, agilidad, vida;

    private EstadoVida estadoVida;

    private Arma arma;

    /**
     * Inicializa la clase Personaje con la fuerza, resistencia, agilidad, vida y arma.
     */
    public Personaje(int fuerza, int resistencia, int agilidad, Arma arma)
    {
        this.fuerza = fuerza;
        this.resistencia = resistencia;
        this.agilidad = agilidad;
        this.vida = 100;
        this.estadoVida = EstadoVida.SALUDABLE;
        this.arma = arma;
    }

    /**
     * Con esta funcion el personaje ataca a otro personaje.
     */
    public abstract void atacar(Personaje personaje);

    /**
     * Con esta funcion el personaje se cura vida.
     */
    public abstract void curar();


    /**
     * Esta funcion se usa para aumentar las resistencias del personaje.
     */
    public abstract void defender();

    /**
     * Esta funcion salta el turno del personaje.
     */
    public abstract void pasar();

    /**
     * Esta funcion repara la utilidad del arma.
     */
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
