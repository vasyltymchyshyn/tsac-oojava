package vasyl.videoteca.main;

public class Cassetta extends Film {

	// cassetta: 1 euro il primo giorno, dal secondo giorno in poi 2 euro al
	// giorno;
	private int noleggioG;

	public Cassetta() {
	}

	public int getNoleggioG() {
		return noleggioG;
	}

	public void setNoleggioG(int noleggioG) {
		this.noleggioG = noleggioG;
	}

	public int costoNoleggio() {
		return (2 * (this.getNoleggioG() - 1)) + 1;
	}

}
