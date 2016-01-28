package vasyl.harbour.main;

public class Aereo extends Invasore {

	// Aereo: la potenza di fuoco è data dalla somma del numero di armamenti
	// di tipo Alpha e dal numero di armamenti di tipo Beta. Un armamento di
	// tipo Alpha
	// ha una potenza di fuoco pari a 10 unità, mentre un armamento di tipo Beta
	// ha una potenza di fuoco pari a 25 unità.

	private int armamentiAlpha;
	private int armamentiBeta;

	public Aereo() {
	}

	public int getArmamentiAlpha() {
		return armamentiAlpha;
	}

	public void setArmamentiAlpha(int armamentiAlpha) {
		this.armamentiAlpha = armamentiAlpha;
	}

	public int getArmamentiBeta() {
		return armamentiBeta;
	}

	public void setArmamentiBeta(int armamentiBeta) {
		this.armamentiBeta = armamentiBeta;
	}

	public int calcolaPotenza() {
		return (this.armamentiAlpha * 10) + (this.armamentiBeta * 25);

	}

}
