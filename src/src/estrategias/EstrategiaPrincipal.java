package estrategias;

public interface EstrategiaPrincipal{

	//despues de eso pasarlo todo a otra clase diferente y ya popr ultimo modificar las funciones
	public int defensa(int defensa);
	public int ataque(int ataque);
	public int vida(int vida);
	public int curar(int cura);
	public void pasar();
	public int repararArma(int reparacion);
}
