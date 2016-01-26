package vasyl.polimorfismo.main;

public class Dipendenti {
	
	//Nome, Cognome e CF.

	private String nome;
	private String cognome;
	private String cf;
			
	public Dipendenti(){
		
	}
	
	public Dipendenti(String nome,String cognome,String cf){
		this.nome=nome;
		this.cognome=cognome;
		this.cf=cf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}
	
	public int parcella(){
		return 50;
	}

}
