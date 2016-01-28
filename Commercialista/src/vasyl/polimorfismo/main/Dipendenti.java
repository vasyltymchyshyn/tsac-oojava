package vasyl.polimorfismo.main;

public class Dipendenti extends Clienti {

	// Nome, Cognome e CF.
	double parcellaFissa;
	
	public Dipendenti() {
		
		this.setParcellaFissa(50);

	}

	public double getParcellaFissa() {
		return parcellaFissa;
	}

	public void setParcellaFissa(double parcellaFissa) {
		this.parcellaFissa = parcellaFissa;
	}

	

	public double parcella() {
		return getParcellaFissa();
	}

}
