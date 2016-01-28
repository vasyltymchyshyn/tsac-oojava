package vasyl.polimorfismo.test.main;

import static org.junit.Assert.*;

import org.junit.Test;

import vasyl.polimorfismo.main.Commercialista;
import vasyl.polimorfismo.main.Dipendenti;
import vasyl.polimorfismo.main.Imprenditori;
import vasyl.polimorfismo.main.LiberiProfessionisti;

public class CommercialistaTest {

	@Test
	public void test() {

		Imprenditori i1 = new Imprenditori();

		i1.setCognome("cognome i1");
		i1.setNome("nome i1");
		i1.setCf("dsaadasi1");
		i1.setNfatture(5); // 500

		LiberiProfessionisti lp = new LiberiProfessionisti();

		lp.setCognome("cognome lp");
		lp.setNome("nome lp");
		lp.setCf("dsaadaslp");
		lp.setNfatture(10); // 55

		Dipendenti d1 = new Dipendenti(); // 50

		d1.setCognome("cognome lp");
		d1.setNome("nome lp");
		d1.setCf("dsaadaslp");

		Commercialista comm = new Commercialista();

		comm.setImprenditori(new Imprenditori[] { i1 });
		comm.setLiberiprofessionisti(new LiberiProfessionisti[] { lp });
		comm.setDipendenti(new Dipendenti[] { d1 });

		// comm.setClienti(new Clienti[]{i1});

		assertEquals(605, comm.totaleIncasso(), 00001);
	}

}
