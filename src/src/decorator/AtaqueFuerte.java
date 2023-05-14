package decorator;

public class AtaqueFuerte extends Decorator
{
	public AtaqueFuerte (Ataque ataqueNormal)
	{
		super(ataqueNormal);
	}

	@Override
	public void atacar ( )
	{
		System.out.println("Ataque fuerte con " + ((AtaqueNormal) super.getAtaqueNormal( )).getAtacante( ).getArma( ).getNombre( ));
	}
}
