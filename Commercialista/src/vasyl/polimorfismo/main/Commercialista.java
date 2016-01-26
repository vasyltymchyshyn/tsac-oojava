package vasyl.polimorfismo.main;

public class Commercialista {
	

		private Dipendenti[] dipendenti;
		private Imprenditori[] imprenditori;
		private LiberiProfessionisti[] liberiprofessionisti;
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
		
		public int totaleIncasso() {
			
			int tot = 0;
			for(Imprenditori m: imprenditori) {
				tot += m.parcella();
			}
			for(LiberiProfessionisti s: liberiprofessionisti) {
				tot += s.parcella();
			}
			
			return tot;
			
		}
	
}
