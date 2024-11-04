package es.lanyu.cartas;

public class BarajaFrancesa extends Baraja{

	private final String[] PALOS = {"PICAS", "CORAZONES", "ROMBOS", "TROBOLES" };
	
	
  public BarajaFrancesa() {
    super("Francesa", 52);
  }
  
  @Override
  public void addCard(CartaI carta) {
	  super.getCartas().add(carta);
  }
  
  @Override
	public void generarCartas() {
		for (int i = 0; i < PALOS.length; i++) {
			for (int j = 1; j < 13; j++) {
				CartaExterna carta = new CartaExterna(i, j);
				addCard(carta);
			}
		}
	}

	
}
