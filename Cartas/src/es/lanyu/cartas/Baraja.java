package es.lanyu.cartas;



public abstract class Baraja extends Mazo{

	private int numeroCartas;
	
	
	public Baraja(String nombre, int nCartas) {
		super(nombre);
		this.numeroCartas = nCartas;
	}
	
	
	
}
