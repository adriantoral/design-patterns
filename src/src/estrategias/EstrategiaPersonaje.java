package estrategias;

public class EstrategiaPersonaje implements EstrategiaPrincipal
{

	private EstrategiaPrincipal estrategia;

	//se ejecutará cuando se crea una nueva instancia de EstrategiaPersonaje con un objeto Ataque como argumento. Imprime un mensaje indicando que se está realizando un ataque.
	public EstrategiaPersonaje (Ataque ataque)
	{

		System.out.println("Realizando el ataque");
	}

	//se ejecutará cuando se cree una nueva instancia de EstrategiaPersonaje con un objeto Curar como argumento. Imprime un mensaje indicando que se está preparando para curar y luego realiza la curación.
	public EstrategiaPersonaje (Curar curar)
	{

		System.out.println("Preparando la curacion");
		System.out.println("Curando");
	}

	//se ejecutará cuando se cree una nueva instancia de EstrategiaPersonaje con un objeto Defender como argumento.
	public EstrategiaPersonaje (Defender defender)
	{

		System.out.println("Preparando la defensa");
	}

	//se ejecutará cuando se cree una nueva instancia de EstrategiaPersonaje con un objeto Pasar como argumento.
	public EstrategiaPersonaje (Pasar pasando)
	{

		System.out.println("Turno terminado");
	}

	//se ejecutará cuando se cree una nueva instancia de EstrategiaPersonaje con un objeto RepararArma como argumento.
	public EstrategiaPersonaje (RepararArma reparar)
	{

		System.out.println("Reparando el arma");
	}

	//Esta función toma un valor de defensa y devuelve su valor aumentado en 30.
	public int defensa (int defensa)
	{
		return defensa + 30;
	}

	//Esta función toma un valor de ataque y devuelve su valor aumentado en 25.
	public int ataque (int ataque)
	{

		return ataque + 25;
	}

	//Esta función toma un valor de vida y devuelve su valor aumentado en 100.
	public int vida (int vida)
	{
		return vida + 100;
	}

	//Esta función toma un valor de curación y devuelve su valor aumentado en 20.
	public int curar (int cura)
	{

		return cura + 20;
	}

	// Esta función no hace nada, ya que su único propósito es imprimir un mensaje indicando que el turno ha terminado.
	public void pasar ( )
	{
	}

	//Esta función toma un valor de reparación y devuelve su valor aumentado en 20.
	public int repararArma (int reparacion)
	{

		return reparacion + 20;
	}

	//llama a las funciones de la interfaz EstrategiaPrincipal para realizar diversas acciones, como defensa, curación, ataque, pasar y reparación de armas.
	public void seleccionarAccion ( )
	{

		defensa(30);
		curar(25);
		ataque(20);
		pasar( );
		repararArma(25);
		vida(100);

	}
}
