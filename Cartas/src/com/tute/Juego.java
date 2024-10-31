package com.tute;


import es.lanyu.cartas.Baraja;
import es.lanyu.cartas.BarajaEspañola;
import es.lanyu.cartas.Carta;

public class Juego {

	public static void main(String[] args) {
		
		Baraja española = new BarajaEspañola();
		española.generarBaraja();
		System.out.println("Baraja española generada");
		
		for (Carta carta : española.getCartas()) {
			System.out.println(carta.toString());
		}
		
	}

}
