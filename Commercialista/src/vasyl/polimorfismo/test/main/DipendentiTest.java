package vasyl.polimorfismo.test.main;

import static org.junit.Assert.*;

import org.junit.Test;

import vasyl.polimorfismo.main.Dipendenti;

public class DipendentiTest {

	@Test
	public void test() {
		Dipendenti d1 = new Dipendenti();
		d1.setNome("nome");
		d1.setCognome("cognome");
		d1.setCf("sdadas");

		assertEquals(50, d1.parcella(), 0001);

	}

}
