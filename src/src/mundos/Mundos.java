package mundos;

import personajes.tipos.Guerrero;
import personajes.tipos.Mago;
import personajes.tipos.Mutante;

//MUNDO!

public interface Mundos
{

	Mago creaMago ( );

	Guerrero creaGuerrero ( );

	Mutante creaMutante ( );

}
