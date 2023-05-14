package mundos;

import personajes.enemigos.GuerreroMundo1;
import personajes.enemigos.MagoMundo1;
import personajes.enemigos.MutanteMundo1;
import personajes.tipos.Guerrero;
import personajes.tipos.Mago;
import personajes.tipos.Mutante;


//MUNDO!
public class Mundo1 implements Mundos{

    @Override
    public Mago creaMago() {
        return new MagoMundo1();
    }

    @Override
    public Guerrero creaGuerrero() {
        return new GuerreroMundo1();
    }

    @Override
    public Mutante creaMutante() {
        return new MutanteMundo1();
    }
}
