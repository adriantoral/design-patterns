package personajes;

/*
 * Controlar el estado de los personajes durante el combate, de forma que los personajes vayan pasando de un estado a otro.
 * El Personaje va a tener diferentes estados, entre (MUERTO, MALHERIDO, HERIDO, SALUDABLE, NULO)
 * 
 * - Muerto => Cuando se ha quedado sin vida o esta a punto (0-25)
 * - Malherido => Cuando esta a punto de quedarse sin vida (25-50)
 * - Herido => Cuando ha sido atacado (50-75)
 * - Saludable => Cuando tiene toda la vida o la mayor parte (75-100)
 * - Nulo => En cualquier otro caso (ERROR)
 * */

public abstract class patronState{
	
	public abstract void hacerEstado();
}
