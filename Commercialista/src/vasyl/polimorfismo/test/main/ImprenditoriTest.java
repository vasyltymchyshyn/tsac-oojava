package vasyl.polimorfismo.test.main;

import static org.junit.Assert.*;

import org.junit.Test;

import vasyl.polimorfismo.main.Imprenditori;

public class ImprenditoriTest {

	@Test
	public void test() {
		Imprenditori i1 = new Imprenditori();

		i1.setCognome("cognome i1");
		i1.setNome("nome i1");
		i1.setCf("dsaadasi1");
		i1.setNfatture(5);

		assertEquals(500, i1.parcella(), 0001);

	}

	@Test
	public void test2() {

		Imprenditori i2 = new Imprenditori();

		i2.setCognome("cognome i1");
		i2.setNome("nome i1");
		i2.setCf("dsaadasi1");
		i2.setNfatture(105);

		assertEquals(505, i2.parcella(), 00001);

	}

}
