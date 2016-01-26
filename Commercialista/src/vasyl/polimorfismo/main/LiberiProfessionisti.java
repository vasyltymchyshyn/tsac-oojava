package vasyl.polimorfismo.main;

public class LiberiProfessionisti extends Dipendenti {
	
	//I liberi professionisti sono caratterizzati da Nome, Cognome, CF, PIVA e numero di fatture
	//registrate nell'anno soggetto alla dichiarazione dei redditi.
	
	private String piva;
	private int nfatture;
	
	public LiberiProfessionisti(){
		
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
	
	//per i liberi professionisti c'è una quota fissa di 50 euro a cui si deve aggiungere 50 centesimi a fattura;
	
		public int parcella(){
			
			return Math.round(super.parcella()+(0.50f*nfatture));
			
		}
	

}
