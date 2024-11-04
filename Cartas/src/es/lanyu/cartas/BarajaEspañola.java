package es.lanyu.cartas;

public class BarajaEspañola extends Baraja{

	private final String[] PALOS = {"OROS", "BASTOS", "COPAS", "ESPADAS" };
	private final String[] fIGURAS = {"As", "Sota", "Caballo", "Rey"};
	
	public BarajaEspañola() {
		super("Española", 40);
	}
	
	public void crearCartasNumero(int inicio, int fin, String palo) {
		for(int i = inicio; i <= fin; i++) {
			Carta carta = new Carta(palo, i);
			super.getCartas().add(carta);
		}
	}
	
	
	
	@Override
	public void generarCartas() {
		for (String palo : PALOS) {
			crearCartasNumero(1, 10, palo);
			
		}
	}

  @Override
  public void addCard(CartaI carta) {
    // TODO Auto-generated method stub
    
  }

}
