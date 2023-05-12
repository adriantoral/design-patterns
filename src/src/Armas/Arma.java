package Armas;

public interface Arma
{
    int danio = 0, utilidad = 0, agilidad = 0;

    public void reparar();

    public int getDanio();

    public void setDanio(int danio);

    public int getUtilidad();

    public void setUtilidad(int utilidad);

    public int getAgilidad();

    public void setAgilidad(int agilidad);
}
