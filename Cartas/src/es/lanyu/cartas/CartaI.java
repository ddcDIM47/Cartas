package es.lanyu.cartas;

public interface CartaI<T extends Comparable<T>> extends Comparable<T>{
	
	public T getPalo();
	
	public String getNCarta ();
	
	
	
}
