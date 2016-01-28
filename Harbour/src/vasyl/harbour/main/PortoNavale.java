package vasyl.harbour.main;

public class PortoNavale {

	// Il porto navale è caratterizzato da un nome,
	// dal numero di imbarcazioni presenti e dalla dimensione in metri quadri.

	private String nomePorto;
	private int imbarcazioniPresenti;
	private int dimensionem2;

	public PortoNavale() {

	}

	public String getNomePorto() {
		return nomePorto;
	}

	public void setNomePorto(String nomePorto) {
		this.nomePorto = nomePorto;
	}

	public int getImbarcazioniPresenti() {
		return imbarcazioniPresenti;
	}

	public void setImbarcazioniPresenti(int imbarcazioniPresenti) {
		this.imbarcazioniPresenti = imbarcazioniPresenti;
	}

	public int getDimensionem2() {
		return dimensionem2;
	}
	
	public void setDanno(double danno) {
		this.dimensionem2 -= danno;
	}

	public void setDimensionem2(int dimensionem2) {
		this.dimensionem2 = dimensionem2;
	}

	

}
