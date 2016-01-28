package vasyl.videoteca.main;

public class Dvd extends Film {

	private double tariffaNoleggio1 = 1.50;
	private double tariffaNoleggio2 = 2;
	private int noleggioG;

	public Dvd() {

	}

	public int getNoleggioG() {
		return noleggioG;
	}

	public void setNoleggioG(int noleggioG) {
		this.noleggioG = noleggioG;
	}

	public double getTariffaNoleggio1() {
		return tariffaNoleggio1;
	}

	public void setTariffaNoleggio1(double tariffaNoleggio1) {
		this.tariffaNoleggio1 = tariffaNoleggio1;
	}

	public double getTariffaNoleggio2() {
		return tariffaNoleggio2;
	}

	public void setTariffaNoleggio2(double tariffaNoleggio2) {
		this.tariffaNoleggio2 = tariffaNoleggio2;
	}

	// dvd: 1.50 euro al giorno per i primi 2 giorni, poi dal terzo giorno 2
	// euro;

	public double costoNoleggio() {

		double i = 0;
		double tot = 0;
		for (i = 0; i < this.getNoleggioG(); i++) {
			if (i < 2) {
				tot += this.tariffaNoleggio1;
			} else {
				tot += this.tariffaNoleggio2;
			}
		}
		return tot;
	}

}
