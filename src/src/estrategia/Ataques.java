package estrategia;

import personajes.Personaje;

public class Ataques implements EstrategiaPrincipal{

	@Override
    public void ejecutar(Personaje personaje) {
        // código para realizar el ataque
        System.out.println("El personaje  ha realizado un ataque con " + personaje.getArma());
    }

}
