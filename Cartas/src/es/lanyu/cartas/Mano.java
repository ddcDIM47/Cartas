package es.lanyu.cartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mano<T> extends Mazo implements Comparator<Mano>{
	
	private List<CartaI> cartas;
	
	public Mano(String nombre) {
		super(nombre);
		cartas = new ArrayList<CartaI>();
	}

	
	public void crearMano(int numeroCartas, Baraja baraja){
		
		for (int i = 0; i < numeroCartas; i++) {
			cartas.add( baraja.robar(null));
		}
	}
	
	public void imprimirMano() {
		for (CartaI cartaI : cartas) {
      		System.out.println(cartaI.toString()); 
		}
	}
	
  @Override
  public int compare(Mano o1, Mano o2) {
    Map<T, Integer> map = new HashMap<T, Integer>(); 
    List<CartaI> lista = o1.cartas;
    List<CartaI> lista2 = o2.cartas;
    for (CartaI cartaI : lista) {
    	if(map.containsKey(cartaI.getPalo())) {
    		String a = (String) cartaI.getPalo();
    		map.replace((T) cartaI.getPalo(), map.get(cartaI.getPalo())+1);
    	}else {
    		map.put((T) cartaI.getPalo(), 1);
    	}
    
    }
    Map<T, Integer> map2 = new HashMap<T, Integer>();
    for (CartaI cartaI : lista2) {
    	if(map2.containsKey(cartaI.getPalo())) {
    		map2.replace((T) cartaI.getPalo(), map2.get(cartaI.getPalo())+1);
    	}else {
    		map2.put((T) cartaI.getPalo(), 1);
    	}		
    }
    
    T val = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();	
    Integer i = map.get(val);
    Integer i2 = map2.get(val);
    if (i2 == null) {
	  i2 = 0;
    }
    Integer i3 = i - i2;
    return i3;
  }


@Override public void generarCartas(){// TODO Auto-generated method stub
}


@Override public void addCard(CartaI carta){// TODO Auto-generated method stub
}
	
}
