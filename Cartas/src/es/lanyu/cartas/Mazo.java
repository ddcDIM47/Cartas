package es.lanyu.cartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Mazo implements MazoI{
	
	private String nombreMazo;
	private List<CartaI> cartas;
	
	public Mazo(String nombre) {
		this.nombreMazo = nombre;
		this.cartas = new ArrayList<CartaI>();
	}
	
	//TODO: comprobar que lo hace si son iguales no el mismo
	public CartaI robar (CartaI carta) {
	    CartaI devolver = null;
	    if (carta != null) {
	      int i = cartas.indexOf(carta);
	      if (i > -1) {
	    	  devolver = cartas.get(i);
	    	  cartas.remove(devolver);
	      }
	    }else {
			devolver = cartas.getFirst();
			cartas.remove(devolver);
		}
			return devolver;
	}
	
	public boolean isIn(Carta carta) {
		return cartas.contains(carta);
	}
	
	public void imprimirCartas() {
		for (CartaI carta : cartas) {
			System.out.println(carta.toString());
		}
	}
	
	public void barajar() {
		Collections.shuffle(cartas);
	}
	
	
	
	public String getNombreMazo() {
		return nombreMazo;
	}
	
	public List<CartaI> getCartas(){
		return cartas;
	}

  
}
