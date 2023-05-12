package estrategias;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca lo que quiere hacer");
		System.out.println("Ataque, defensa, pasar, curar o reparar");
		String opcion = sc.nextLine();

		//Dentro de este parametro establecemos que personaje queremos que realice las acciones
		EstrategiaPersonaje personaje = null;//new Personaje();

			//Menu encargado de realizar diferentes operaciones
			if (opcion.equals("ataque")){
				personaje = new EstrategiaPersonaje(new Ataque());
				Pasar pasar=new Pasar();
				pasar.pasar();
			}else if(opcion.equals("defensa")){
				personaje = new EstrategiaPersonaje(new Defender());
				Pasar pasar=new Pasar();
				pasar.pasar();
			}else if(opcion.equals("pasar")){
				personaje = new EstrategiaPersonaje(new Pasar());
				Pasar pasar=new Pasar();
				pasar.pasar();
			}else if(opcion.equals("curar")){
				personaje = new EstrategiaPersonaje(new Curar());
				Pasar pasar=new Pasar();
				pasar.pasar();
			}else if(opcion.equals("reparar")){
				personaje = new EstrategiaPersonaje(new RepararArma());
				Pasar pasar=new Pasar();
				pasar.pasar();
			}else {
				System.out.println("Argumento no valido, ingrese: ataque, defensa, pasar, curar o reparar. ");
			}
			//Responsable de ejecutar lo que se encuentra dentro de la clase EstrategiaPersonaje
			//personaje.seleccionarAccion();

	}
}
