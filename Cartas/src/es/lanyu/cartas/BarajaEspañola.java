package es.lanyu.cartas;

public class BarajaEspañola extends Baraja{

	private final String[] PALOS = {"OROS", "BASTOS", "COPAS", "ESPADAS" };
	private final String[] fIGURAS = {"As", "Sota", "Caballo", "Rey"};
	
	public BarajaEspañola() {
		super("Española", 40);
	}
	
	@Override
	public void generarBaraja() {
		for (String palo : PALOS) {
			super.crearCartasNumero(2, 7, palo);
			for (String figura : fIGURAS) {
				super.crearCartaFigura(figura, palo);
			}
		}
	}

}
