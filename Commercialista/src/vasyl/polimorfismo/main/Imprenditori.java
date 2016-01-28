package vasyl.polimorfismo.main;

public class Imprenditori extends Clienti {

	// Nome, Cognome, CF, PIVA della Società, Ragione Sociale della Società e
	// numero di fatture della Società registrate nell'anno soggetto alla
	// dichiarazione dei redditi.

	private String piva;
	private String rss;
	private int nfatture;
	private int limiteNfatture = 100;

	public Imprenditori() {

	}

	public int getLimiteNfatture() {
		return limiteNfatture;
	}

	public void setLimiteNfatture(int limiteNfatture) {
		this.limiteNfatture = limiteNfatture;
	}

	public String getPiva() {
		return piva;
	}

	public void setPiva(String piva) {
		this.piva = piva;
	}

	public String getRss() {
		return rss;
	}

	public void setRss(String rss) {
		this.rss = rss;
	}

	public int getNfatture() {
		return nfatture;
	}

	public void setNfatture(int nfatture) {
		this.nfatture = nfatture;
	}

	// per gli imprenditori è di 500 euro se vengono registrate meno di 100
	// fatture.

	// Ogni fattura dalla 101 esima in poi viene calcolata a 1 euro a fattura.

	public double parcella() {
		if (nfatture <= this.getLimiteNfatture()) {
			return 500;
		} else {
			return 500 + (nfatture - 100);
		}
	}

}
