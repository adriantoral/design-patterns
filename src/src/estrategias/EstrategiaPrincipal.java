package estrategias;

public interface EstrategiaPrincipal
{
	//despues de eso pasarlo todo a otra clase diferente y ya popr ultimo modificar las funciones
	int defensa (int defensa);

	int ataque (int ataque);

	int vida (int vida);

	int curar (int cura);

	void pasar ( );

	int repararArma (int reparacion);
}
