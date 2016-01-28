package vasyl.videoteca.main;

public class BluRay extends Film {

	private int noleggioG;

	public BluRay() {

	}

	public int getNoleggioG() {
		return noleggioG;
	}

	public void setNoleggioG(int noleggioG) {
		this.noleggioG = noleggioG;
	}

	public double costoNoleggio() {
		if (this.getNoleggioG() == 1) {
			return 1;
		} else {
			double tot = 0;
			for (int i = 0; i < this.getNoleggioG(); i++) {
				tot += 1 + 1 * (i * 0.1);
			}
			return tot;
		}

	}
}
