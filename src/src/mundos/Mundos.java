package mundos;

import personajes.tipos.Mago;
import personajes.tipos.Guerrero;
import personajes.tipos.Mutante;

public interface Mundos {

    public Mago creaMago();
    public Guerrero creaGuerrero();
    public Mutante creaMutante();

}
