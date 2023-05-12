package personajes;

import armas.melee.Martillo;
import calculador.Calculador;
import decorator.Ataque;
import decorator.AtaqueDebil;
import decorator.AtaqueFuerte;
import decorator.AtaqueNormal;

public class Jugador extends Personaje
{

    //Variable para controlar el estado
    private EstadoJugador estado;

    /**
     * Inicializa la clase Jugador.
     */
    public Jugador()
    {
        super(25, 40, 33, new Martillo());
    }

    /**
     * SETTER que va a cambiar el estado del personaje
     */

    //Setter que nos va a ayudar a cambiar de estado
    public void setEstado(EstadoJugador estado)
    {
        this.estado = estado;
    }

    //Metodo que va a realizar la funcion
    public void hacerEstado()
    {
        estado.hacerEstado();
    }

    /**
     * @param personaje El personaje a atacar.
     */
    @Override
    public void atacar(Personaje personaje)
    {
        Ataque ataque = new AtaqueNormal(this), ataqueDecorado;

        if (this.getFuerza() <= 25) ataqueDecorado = new AtaqueDebil(ataque);
        else if (this.getFuerza() > 25 && this.getFuerza() <= 40) ataqueDecorado = ataque;
        else ataqueDecorado = new AtaqueFuerte(ataque);

        ataqueDecorado.atacar();
        personaje.setVida(personaje.getVida() - Calculador.getCalculador().calculaResultadoAtaque(this, personaje));
    }

    /**
     * Cura al personaje en 20 unidades de vida.
     */
    @Override
    public void curar()
    {
        this.setVida(this.getVida() + 20);
    }

    /**
     * Aumenta la resistencia en 5 unidades.
     */
    @Override
    public void defender()
    {
        this.setResistencia(this.getResistencia() + 5);
    }

    /**
     *
     */
    @Override
    public void pasar()
    {
    }

    /**
     * Repara el arma.
     */
    @Override
    public void repararArma()
    {
        this.getArma().reparar();
    }
}
