package es.lanyu.cartas;

import java.util.ArrayList;
import java.util.List;

public class Mazo {
	
	private String nombreMazo;
	private List<Carta> cartas;
	
	public Mazo(String nombre) {
		this.nombreMazo = nombre;
		this.cartas = new ArrayList<Carta>();
	}
		
	
	public void crearCartasNumero(int inicio, int fin, String palo) {
		for(int i = inicio; i <= fin; i++) {
			
			Carta carta = new Carta(palo, String.valueOf(i));
			cartas.add(carta);
		}
	}
	
	public void crearCartaFigura(String valor, String palo) {
		
		Carta figura = new Carta(palo, valor);
		cartas.add(figura);
	}
	
	public String getNombreMazo() {
		return nombreMazo;
	}
	
	public List<Carta> getCartas(){
		return cartas;
	}
	
}
