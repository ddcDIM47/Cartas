package es.lanyu.cartas;

import java.util.Objects;

public class Carta<T extends Comparable<T>> implements CartaI<T>{
	
	T palo;
	int nCarta;
	
	public String getNCarta() {
		return String.valueOf(nCarta);
	}
	
	public String getPaloString() {
		return palo.toString();
	}
	
	public Carta(T palo, int valor) {
		this.palo = palo;
		this.nCarta = valor;
	}
	
	public T getPalo() {
		return palo;
	}
	
	public int getnCarta() {
		return nCarta;
	}
	
	@Override
	public String toString() {
		String numero = "";
		switch (nCarta) {
			case 1: {
				numero = "As";
				break;
			}
			case 8:{
				numero = "Sota";
				break;
	        }
			case 9:{
				numero = "Caballo";
				break;
			}
			case 10:{
				numero = "Rey";
				break;
			}
		      default:{
		    	  numero = String.valueOf(nCarta);
		      }
	        
		}
		return numero + " de " + palo;
	}

  @Override
  public int hashCode() {
    return Objects.hash(nCarta, palo);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    Carta other = (Carta) obj;
    return Objects.equals(nCarta, other.nCarta) && Objects.equals(palo, other.palo);
  }

	@Override 
	public int compareTo(T carta){
		int resultado = 0;
		Carta other = (Carta<?>) carta;
		if (this.getPalo().equals(other.getPalo())) {
			resultado = this.getnCarta() - other.getnCarta();
        } else {
        	resultado = this.getPaloString().compareTo(other.getPaloString());
        }
		return resultado;
	}
}
	

