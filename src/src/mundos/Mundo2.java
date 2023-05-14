package mundos;

import personajes.enemigos.GuerreroMundo2;
import personajes.enemigos.MagoMundo2;
import personajes.enemigos.MutanteMundo2;
import personajes.tipos.Guerrero;
import personajes.tipos.Mago;
import personajes.tipos.Mutante;

//MUNDO!
public class Mundo2 implements Mundos{
    @Override
    public Mago creaMago() {
        return new MagoMundo2();
    }

    @Override
    public Guerrero creaGuerrero() {
        return new GuerreroMundo2();
    }

    @Override
    public Mutante creaMutante() {
        return new MutanteMundo2();
    }
}
