package armas.rango;
import armas.Arma;

public class Varita extends Arma{
	
	//inicia la clase varita
	 public Varita()
	    {
	        super(15, 17, 4, "Varita de Sauco");
	    }

	 //repara la varita con 3 puntos de utilidad
	   
	    @Override
	    public void reparar()
	    {
	        this.setUtilidad(this.getUtilidad() + 3);
	    }
	}


