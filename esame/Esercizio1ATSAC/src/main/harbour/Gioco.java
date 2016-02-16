package main.harbour;

/**
 * ************* * DA COMPLETARE * ************* *
 */
public class Gioco {

	private Porto p;

	public Gioco(Porto p) {
		this.p = p;
	}

	public void attacco(Invasore invasori[]) {
		for (Invasore i : invasori) {
			int potenzadifuoco = i.potenzaFuoco();
			p.addMetriQuadriDistrutti(potenzadifuoco * 2.5);
		}
	}
	// metri_quadri_distrutti_del_porto = potenza_di_fuoco_invasori * 2.5

	public boolean portoDistrutto() {
		return p.getDimensioneSqMetersNonDistrutta() <= 0;
	}

	// Porto p = new Porto();
	// p.setDimensioneSqMeters(5000);
	//
	// Gioco gioco = new Gioco(p);
	//
	// Sottomarino s = new Sottomarino();
	//
	// Cacciabombardiere a = new Cacciabombardiere();

	//
	// Invasore[] invasoriA = new Invasore[]{ s, a };
	// /*
	// * L'attacco somma la potenza di fuoco degli invasori e
	// * distrugge il porto secondo questa equazione:
	// * metri_quadri_distrutti_del_porto = potenza_di_fuoco_invasori * 2.5
	// */
	//
	// gioco.attacco(invasoriA);
	// assertFalse(gioco.portoDistrutto());
	//
	// Cacciabombardiere a2 = new Cacciabombardiere();
	// a2.setnArmamentiAlpha(10);
	// a2.setnArmamentiBeta(20);
	//
	// Invasore[] invasoriB = new Invasore[]{ s, a, a2 };
	// gioco.attacco(invasoriB);
	// assertTrue(gioco.portoDistrutto());

}
