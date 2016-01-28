package vasyl.harbour.main;

public class Invasore {

	private String codIdentificativo;
	private String modello;
	private int p;
	private Aereo[] aereo;
	private Sottomarino[] sottomarino;
	
	public Invasore(){
		
	}
	public Invasore(Aereo[] aereo, Sottomarino[] sottomarino){
		this.aereo=aereo;
		this.sottomarino=sottomarino;
	}

	public String getCodIdentificativo() {
		return codIdentificativo;
	}

	public void setCodIdentificativo(String codIdentificativo) {
		this.codIdentificativo = codIdentificativo;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}
	
	public int calcolaPotenza() {
		return 0;
	}

}
