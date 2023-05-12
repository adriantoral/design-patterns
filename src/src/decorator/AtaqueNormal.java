package decorator;

import personajes.Personaje;

public class AtaqueNormal implements Ataque
{
    private Personaje atacante;

    public AtaqueNormal(Personaje atacante)
    {
        this.atacante = atacante;
    }

    @Override
    public void atacar()
    {
        System.out.println("Ataque con " + atacante.getArma().getNombre());
    }

    public Personaje getAtacante()
    {
        return atacante;
    }

    public void setAtacante(Personaje atacante)
    {
        this.atacante = atacante;
    }
}
