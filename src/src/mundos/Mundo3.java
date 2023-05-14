package mundos;

import personajes.enemigos.GuerreroMundo3;
import personajes.enemigos.MagoMundo3;
import personajes.enemigos.MutanteMundo3;
import personajes.tipos.Guerrero;
import personajes.tipos.Mago;
import personajes.tipos.Mutante;

public class Mundo3 implements Mundos{


    @Override
    public Mago creaMago() {
        return new MagoMundo3();
    }

    @Override
    public Guerrero creaGuerrero() {
        return new GuerreroMundo3();
    }

    @Override
    public Mutante creaMutante() {
        return new MutanteMundo3();
    }
}

