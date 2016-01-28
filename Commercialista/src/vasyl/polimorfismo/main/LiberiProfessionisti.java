package vasyl.polimorfismo.main;

public class LiberiProfessionisti extends Clienti {

	// I liberi professionisti sono caratterizzati da Nome, Cognome, CF, PIVA e
	// numero di fatture
	// registrate nell'anno soggetto alla dichiarazione dei redditi.

	private String piva;
	private int nfatture;
	double parcellaFissa = 50;

	public double getParcellaFissa() {
		return parcellaFissa;
	}

	public void setParcellaFissa(double parcellaFissa) {
		this.parcellaFissa = parcellaFissa;
	}

	public LiberiProfessionisti() {
	}

	public String getPiva() {
		return piva;
	}

	public void setPiva(String piva) {
		this.piva = piva;
	}

	public int getNfatture() {
		return nfatture;
	}

	public void setNfatture(int nfatture) {
		this.nfatture = nfatture;
	}

	// per i liberi professionisti c'è una quota fissa di 50 euro a cui si deve
	// aggiungere 50 centesimi a fattura;

	public double parcella() {

		return this.getParcellaFissa() + (nfatture * 0.5);

	}

}
