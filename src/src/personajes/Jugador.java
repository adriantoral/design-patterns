package personajes;

import armas.melee.Martillo;

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
        estado = new Saludable();
    }
    
    /**
     * SETTER que va a cambiar el estado del personaje
     * */
  	
  	//Setter que nos va a ayudar a cambiar de estado
  	public void setEstado(EstadoJugador estado) {
  		this.estado=estado;
  	}
  	
  	//Metodo que va a realizar la funcion
  	public void hacerEstado() {
  		estado.hacerEstado();
  	}

    /**
     * @param personaje El personaje a atacar.
     */
    @Override
    public void atacar(Personaje personaje){
    	
    }

    /**
     * Cura al personaje en 20 unidades de vida.
     */
    @Override
    public void curar(){
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
