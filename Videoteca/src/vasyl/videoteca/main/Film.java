package vasyl.videoteca.main;

public class Film {

	// Ogni film è caratterizzato dal titolo, dal nome del registra, dall’anno
	// di produzione e dal nome degli attori principali.

	private String titolo;
	private String nomeRegistra;
	private int annoProduzione;
	private String attoreP;

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getNomeRegistra() {
		return nomeRegistra;
	}

	public void setNomeRegistra(String nomeRegistra) {
		this.nomeRegistra = nomeRegistra;
	}

	public int getAnnoProduzione() {
		return annoProduzione;
	}

	public void setAnnoProduzione(int annoProduzione) {
		this.annoProduzione = annoProduzione;
	}

	public String getAttoreP() {
		return attoreP;
	}

	public void setAttoreP(String attoreP) {
		this.attoreP = attoreP;
	}

}
