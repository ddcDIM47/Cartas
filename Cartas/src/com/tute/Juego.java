package com.tute;

import es.lanyu.cartas.Baraja;
import es.lanyu.cartas.BarajaEspañola;
import es.lanyu.cartas.BarajaFrancesa;
import es.lanyu.cartas.Carta;
import es.lanyu.cartas.Mano;

public class Juego {



	
	public static void main(String[] args) {
		
		Baraja española = new BarajaEspañola();
		española.generarCartas();
		System.out.println("Baraja española generada");
		//española.imprimirCartas();
		española.barajar();
		//española.imprimirCartas();
		Mano mano1 = new Mano("mano1");
		Mano mano2 = new Mano("Mano2");
		
		mano1.crearMano(5, española);
		mano2.crearMano(5, española);
		
		System.out.println("Mano1:"); 
		mano1.imprimirMano();
		System.out.println("Mano2:"); 
		mano2.imprimirMano();
		
		int res = mano1.compare(mano1, mano2);
		if (res == 0) {
			//manos iguales
			System.out.println("empate"); 
      	}
		if (res > 0) {
			//manos 1 mayor
			System.out.println("1 gana"); 
      	}
		if (res < 0) {
			//mano 2 mayor
			System.out.println("2 gana"); 
      	}
		
		//Carta c = new Carta("BASTOS", 2);
		//System.out.println(española.isIn(c));
		//española.getCartas().sort(null);
		//española.imprimirCartas();
		//Baraja americana = new Baraja(null, 0);
//		Baraja americana = new BarajaFrancesa();
//		americana.generarBaraja();
//		americana.barajar();
//		americana.imprimirCartas();
//		americana.getCartas().sort(null);
//		americana.imprimirCartas();
		
		
		
	}

}
