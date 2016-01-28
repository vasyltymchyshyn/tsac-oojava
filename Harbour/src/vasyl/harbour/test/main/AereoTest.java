package vasyl.harbour.test.main;

import static org.junit.Assert.*;

import org.junit.Test;

import vasyl.harbour.main.Aereo;

public class AereoTest {

	@Test
	public void test() {

		Aereo t100=new Aereo();
		t100.setCodIdentificativo("t100");
		t100.setModello("iovolo");
		t100.setArmamentiAlpha(1);
		t100.setArmamentiBeta(1);
		
		assertEquals(35,t100.calcolaPotenza());
	}

}
