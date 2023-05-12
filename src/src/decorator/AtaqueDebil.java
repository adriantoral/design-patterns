package decorator;

import personajes.Personaje;

public class AtaqueDebil extends Decorator{
	
	public AtaqueDebil(Ataque ataqueNormal) {
		super(ataqueNormal);
	}

	@Override
	public void atacar() {
		System.out.println("ataque debil con " + ((AtaqueNormal)super.getAtaqueNormal()).getAtacante().getArma().getNombre());
		
	}
}
