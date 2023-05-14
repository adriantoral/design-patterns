package mundos;

import personajes.tipos.Mago;
import personajes.tipos.Guerrero;
import personajes.tipos.Mutante;

//MUNDO!

public interface Mundos {

    public Mago creaMago();
    public Guerrero creaGuerrero();
    public Mutante creaMutante();

}
