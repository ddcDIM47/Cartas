package es.lanyu.cartas;

import com.github.cards.Card;

public class CartaExterna<T extends Comparable<T>> extends Card implements CartaI<T> {

  public CartaExterna(int suit, int rank) {
    super(suit,rank);
  }
    
  public int getnCarta() {
	  return super.getRank();
  }
  
  @Override
  public T getPalo() {
	  return (T) super.getSuitString();
  }
  
  @Override 
  public String getNCarta(){
	  return super.getRankString();
  }

	@Override 
	public int compareTo(T carta){
		int resultado = 0;
		CartaExterna other = (CartaExterna<?>) carta;
		if (this.getPalo().equals(other.getPalo())) {
			resultado = this.getnCarta() - other.getnCarta();
        } else {
        	resultado = this.getPalo().toString().compareTo(other.getPalo().toString());
        }
		return resultado;
	}
  



}
