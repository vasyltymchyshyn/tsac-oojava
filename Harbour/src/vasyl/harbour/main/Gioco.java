package vasyl.harbour.main;

public class Gioco {

	private PortoNavale portonavale;
	private Invasore[] invasori;
	private Aereo[] aereo;
	private Sottomarino[] sm;


	public Aereo[] getAereo() {
		return aereo;
	}

	public void setAereo(Aereo[] aereo) {
		this.aereo = aereo;
	}

	public Sottomarino[] getSm() {
		return sm;
	}

	public void setSm(Sottomarino[] sm) {
		this.sm = sm;
	}

	public Gioco(PortoNavale portonavale){
		this.portonavale = portonavale;

	}

	public PortoNavale getPortonavale() {
		return portonavale;
	}

	public void setPortonavale(PortoNavale portonavale) {
		this.portonavale = portonavale;
	}

	public Invasore[] getInvasori() {
		return invasori;
	}

	public void setInvasori(Invasore[] invasori) {
		this.invasori = invasori;
	}


	public void attacco() {
		
		for(Aereo a: this.aereo){
			this.portonavale.setDanno(a.calcolaPotenza()*1.5);
		}
		
		for(Sottomarino s: this.sm){
			this.portonavale.setDanno(s.calcolaPotenza()*1.5);
		}
		
		
	}
	

}
