package main.harbour;

/**
 * ************* * DA COMPLETARE * ************* *
 */
public class Porto {

	private double dimensioneSqMeters;
	private double dimensioneSqMetersNonDistrutta;

	public Porto() {
	}

	public double getDimensioneSqMeters() {
		return dimensioneSqMeters;
	}

	public void setDimensioneSqMeters(double dimensione) {
		this.dimensioneSqMeters = dimensione;
		this.dimensioneSqMetersNonDistrutta = dimensione;
	}

	public void addMetriQuadriDistrutti(double dimensione) {
		dimensioneSqMetersNonDistrutta = Math.max(dimensioneSqMetersNonDistrutta - dimensione, 0);
	}

	public double getDimensioneSqMetersNonDistrutta() {
		return dimensioneSqMetersNonDistrutta;
	}

}
