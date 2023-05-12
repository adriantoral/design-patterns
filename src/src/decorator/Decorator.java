package decorator;

public abstract class Decorator implements Ataque{
	
	private Ataque ataqueNormal;
	
	public Decorator(Ataque ataqueNormal) {
		
	}

	public Ataque getAtaqueNormal() {
		return ataqueNormal;
	}

	public void setAtaqueNormal(Ataque ataqueNormal) {
		this.ataqueNormal = ataqueNormal;
	}

}
