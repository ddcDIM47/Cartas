package es.lanyu.cartas;

public class Carta{
	
	String palo;
	String nCarta;
	
	
	public Carta(String palo, String valor) {
		this.palo = palo;
		this.nCarta = valor;
	}
	
	public String getPalo() {
		return palo;
	}
	
	public String getnCarta() {
		return nCarta;
	}
	
	@Override
	public String toString() {
		return nCarta + " de " + palo;
	}
}
