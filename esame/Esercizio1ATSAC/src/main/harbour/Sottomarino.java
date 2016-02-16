package main.harbour;

/**
 * ************* * DA COMPLETARE * ************* *
 */
public class Sottomarino extends Invasore {

	private int nArmamenti;
	private int Stazza;

	// public class SottomarinoTest {
	//
	// @Test
	// public void testPotenzaFuoco() {
	// Sottomarino s = new Sottomarino();
	// s.setnArmamenti(13);
	// s.setStazza(47);
	// int pf = s.potenzaFuoco();
	//
	// // la potenza di fuoco è il
	// // 25% del prodotto tra numero armamenti e stazza.
	// // il valore è arrotondato all'intero più vicino.
	// assertEquals(153, pf);
	// }
	//
	// }
	public Sottomarino() {
	}

	public int getnArmamenti() {
		return nArmamenti;
	}

	public void setnArmamenti(int nArmamenti) {
		this.nArmamenti = nArmamenti;
	}

	public int getStazza() {
		return Stazza;
	}

	public void setStazza(int stazza) {
		Stazza = stazza;
	}

	@Override
	public int potenzaFuoco() {

		int prodotto = this.getnArmamenti() * this.getStazza();
		float x = (prodotto * 25) / 100f;

		return Math.round(x);

	}

}
