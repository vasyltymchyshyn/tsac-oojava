package vasyl.harbour.test.main;

import static org.junit.Assert.*;

import org.junit.Test;

import vasyl.harbour.main.Sottomarino;

public class SottomarinoTest {

	@Test
	public void test() {
		
		Sottomarino nonsonuotare =new Sottomarino();
		nonsonuotare.setCodIdentificativo("pew12");
		nonsonuotare.setnArmamenti(5);
		nonsonuotare.setStazza(5);
		
		assertEquals(25,nonsonuotare.calcoloPotenza());
	}

}
