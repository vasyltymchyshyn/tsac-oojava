package vasyl.videoteca.test.main;

import static org.junit.Assert.*;

import org.junit.Test;

import vasyl.videoteca.main.Dvd;

public class DvdTest {

	@Test
	public void test() {
		Dvd hp = new Dvd();
		hp.setNoleggioG(5);

		assertEquals(9.0, hp.costoNoleggio(), 0.001);

	}
}
