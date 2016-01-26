package vasyl.polimorfismo.test.main;

import static org.junit.Assert.*;

import org.junit.Test;

import vasyl.polimorfismo.main.LiberiProfessionisti;

public class LiberiProfessionistiTest {

	@Test
	public void test() {
		LiberiProfessionisti lp=new LiberiProfessionisti();
		
		lp.setCognome("cognome lp");
		lp.setNome("nome lp");
		lp.setCf("dsaadaslp");
		lp.setNfatture(10);
		
		assertEquals(500,lp.parcella());
		
	}

}
