package main.harbour;

/**
 * ************* * DA COMPLETARE * ************* *
 */
public class Cacciabombardiere extends Invasore {

	private int nArmamentiAlpha;
	private int nArmamentiBeta;

	public Cacciabombardiere() {
	}

	public int getnArmamentiAlpha() {
		return nArmamentiAlpha;
	}

	public void setnArmamentiAlpha(int nArmamentiAlpha) {
		this.nArmamentiAlpha = nArmamentiAlpha;
	}

	public int getnArmamentiBeta() {
		return nArmamentiBeta;
	}

	public void setnArmamentiBeta(int nArmamentiBeta) {
		this.nArmamentiBeta = nArmamentiBeta;
	}

	@Override
	public int potenzaFuoco() {
		return (this.getnArmamentiAlpha() + this.getnArmamentiBeta()) * 40;
	}

}
