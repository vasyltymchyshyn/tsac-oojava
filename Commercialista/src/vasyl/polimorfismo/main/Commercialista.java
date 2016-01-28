package vasyl.polimorfismo.main;

public class Commercialista {

	private Dipendenti[] dipendenti;
	private Imprenditori[] imprenditori;
	private LiberiProfessionisti[] liberiprofessionisti;
	private Clienti[] clienti;

	public Clienti[] getClienti() {
		return clienti;
	}

	public void setClienti(Clienti[] clienti) {
		this.clienti = clienti;
	}

	public Dipendenti[] getDipendenti() {
		return dipendenti;
	}

	public void setDipendenti(Dipendenti[] dipendenti) {
		this.dipendenti = dipendenti;
	}

	public Imprenditori[] getImprenditori() {
		return imprenditori;
	}

	public void setImprenditori(Imprenditori[] imprenditori) {
		this.imprenditori = imprenditori;
	}

	public LiberiProfessionisti[] getLiberiprofessionisti() {
		return liberiprofessionisti;
	}

	public void setLiberiprofessionisti(LiberiProfessionisti[] liberiprofessionisti) {
		this.liberiprofessionisti = liberiprofessionisti;
	}

	public double totaleIncasso() {

		double tot = 0;

		for (Dipendenti i : dipendenti) {
			tot += i.parcella();
		}

		for (Imprenditori m : imprenditori) {
			tot += m.parcella();
		}
		for (LiberiProfessionisti s : liberiprofessionisti) {
			tot += s.parcella();
		}

		return tot;

	}

}
