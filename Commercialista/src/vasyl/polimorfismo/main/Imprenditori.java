package vasyl.polimorfismo.main;

public class Imprenditori extends Dipendenti {
	
	//Nome, Cognome, CF, PIVA della Società, Ragione Sociale della Società e 
	//numero di fatture della Società registrate nell'anno soggetto alla dichiarazione dei redditi.
	
	 private String piva;
	 private String rss;
	 private int nfatture;
	 
	 
	 public Imprenditori(){
			
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
	
	//per gli imprenditori è di 500 euro se vengono registrate meno di 100 fatture. O
	//gni fattura dalla 101 esima in poi viene calcolata a 1 euro a fattura.

	
	public int parcella(){
		if(nfatture <=100){
			return 500;
		}else{
			return 1*nfatture;
		}
	}


	
	
	

}
