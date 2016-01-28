package vasyl.videoteca.main;

public class Videoteca {

	private Dvd[] dvd;
	private Cassetta[] cassetta;
	private BluRay[] bluray;

	public Videoteca() {

	}

	public Dvd[] getDvd() {
		return dvd;
	}

	public void setDvd(Dvd[] dvd) {
		this.dvd = dvd;
	}

	public Cassetta[] getCassetta() {
		return cassetta;
	}

	public void setCassetta(Cassetta[] cassetta) {
		this.cassetta = cassetta;
	}

	public BluRay[] getBluray() {
		return bluray;
	}

	public void setBluray(BluRay[] bluray) {
		this.bluray = bluray;
	}

	public double totaleIncasso() {

		double tot = 0;

		for (BluRay b : bluray) {
			tot += b.costoNoleggio();
		}
		for (Dvd d : dvd) {
			tot += d.costoNoleggio();
		}
		for (Cassetta c : cassetta) {
			tot += c.costoNoleggio();
		}

		return tot;

	}

}
