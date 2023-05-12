package calculador;

import personajes.Personaje;

/*
 *  Nos creamos la clase Calculador que va a ser el que haga los calculos sobre le resultado de los ataques
 *  Para implementar el patron Singleton creamos un unico atributo de la clase que se llama "micalculador"
 *  Es una función que se encarga de crear un objeto en el caso de que no exista la unica instancia y si existe la devuelve
 */
public class Calculador
{
    private static Calculador miCalculador;

    public static Calculador getCalculador()
    {
        if (miCalculador == null)                       // Un if para ver si no existe la instancia
            miCalculador = new Calculador();                            // Crea la instancia llamada Calculador

        return miCalculador;                                            //Devuelve la instancia
    }

    /*
     * Es una funcion que se encarga de calcular el daño total hecho, sumando la fuerza mas el daño del arma y a este daño se le añade porcentualmente la agilidad, y se le resta a todo la resistencia del personaje
     * Se pone en valor absoluto para no obtener numeros negativos y es un double por la gailidad ya que es porcentual
     */
    public int calculaResultadoAtaque(Personaje atacante, Personaje atacado)
    {
        return Math.abs((atacado.getResistencia()) - ((atacante.getFuerza() + atacado.getArma().getDanio()) + (int) (0.25 * atacante.getAgilidad())));
    }
}