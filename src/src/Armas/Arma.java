package Armas;

public abstract class Arma
{
    /**
     * El danio es el que tiene el arma y se usa para medir el danio de ataque del personaje combinado con la fuerza del mismo.
     * La utilidad es la unidad que mide si el arma es valido para atacar o no, si es mayor que 0 podra atacar, si es 0 no podra atacar.
     * La agilidad le aporta mayor agilidad al personaje, es decir, que le suma agilidad del personaje.
     * Si tiene el personaje 100 de agilidad, y el arma 15 de agilidad, el personaje en realidad tendra 115 de agilidad y atacara mas rapido.
     */
    int danio, utilidad, agilidad;

    /**
     * Inicializa la clase Arma con el danio, utilidad y agilidad.
     */
    public Arma(int danio, int utilidad, int agilidad)
    {
        this.danio = danio;
        this.utilidad = utilidad;
        this.agilidad = agilidad;
    }

    /**
    * Esta clase recupera la utilidad del arma para aumentarle los posibles usos.
    */
    public abstract void reparar();

    public int getDanio()
    {
        return danio;
    }

    public void setDanio(int danio)
    {
        this.danio = danio;
    }

    public int getUtilidad()
    {
        return utilidad;
    }

    public void setUtilidad(int utilidad)
    {
        this.utilidad = utilidad;
    }

    public int getAgilidad()
    {
        return agilidad;
    }

    public void setAgilidad(int agilidad)
    {
        this.agilidad = agilidad;
    }
}
