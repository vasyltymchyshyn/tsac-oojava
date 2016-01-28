package vasyl.videoteca.test.main;

import static org.junit.Assert.*;

import org.junit.Test;

import vasyl.videoteca.main.BluRay;
import vasyl.videoteca.main.Cassetta;
import vasyl.videoteca.main.Dvd;
import vasyl.videoteca.main.Videoteca;

public class VideotecaTest {

	@Test
	public void test() {

		Dvd hp = new Dvd();
		hp.setTitolo("Harry Potter");
		hp.setNoleggioG(5); // 9.0

		Dvd hp2 = new Dvd();
		hp2.setTitolo("Harro Potter 2");
		hp2.setNoleggioG(5);

		Cassetta m = new Cassetta();
		m.setTitolo("Matrix");
		m.setNoleggioG(2); // 3

		BluRay scrubs = new BluRay();
		scrubs.setTitolo("Scrubs");
		scrubs.setNoleggioG(10);

		Videoteca blockbuster = new Videoteca();

		blockbuster.setDvd(new Dvd[] { hp, hp2 });
		blockbuster.setCassetta(new Cassetta[] { m });
		blockbuster.setBluray(new BluRay[] { scrubs });

		assertEquals(35.5, blockbuster.totaleIncasso(), 0.01);

	}

}
