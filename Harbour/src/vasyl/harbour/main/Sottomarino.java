package vasyl.harbour.main;

public class Sottomarino extends Invasore {

	// Sottomarino: la potenza di fuoco è data dal prodotto tra
	// il numero di armamenti presenti nel sottomarino e la stazza espressa in
	// tonnellate.

	private int nArmamenti;
	private int stazza;

	public Sottomarino() {

	}

	public int getnArmamenti() {
		return nArmamenti;
	}

	public void setnArmamenti(int nArmamenti) {
		this.nArmamenti = nArmamenti;
	}

	public int getStazza() {
		return stazza;
	}

	public void setStazza(int stazza) {
		this.stazza = stazza;
	}

	public int calcoloPotenza() {
		return this.nArmamenti * this.stazza;
	}

}
