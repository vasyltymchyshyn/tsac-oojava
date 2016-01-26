package vasyl.polimorfismo.test.main;

import static org.junit.Assert.*;

import org.junit.Test;

import vasyl.polimorfismo.main.Commercialista;
import vasyl.polimorfismo.main.Imprenditori;
import vasyl.polimorfismo.main.LiberiProfessionisti;

public class CommercialistaTest {

	@Test
	public void test() {
		
		Imprenditori i1=new Imprenditori();
		
		i1.setCognome("cognome i1");
		i1.setNome("nome i1");
		i1.setCf("dsaadasi1");
		i1.setNfatture(5);
		//assertEquals(500,i1.parcella());
		
		
		LiberiProfessionisti lp=new LiberiProfessionisti();		
		
		lp.setCognome("cognome lp");
		lp.setNome("nome lp");
		lp.setCf("dsaadaslp");
		lp.setNfatture(10);
		
	//	assertEquals(500,lp.parcella());55
		
		Commercialista comm=new Commercialista();
		
		comm.setImprenditori(new Imprenditori[]{i1});
		comm.setLiberiprofessionisti(new LiberiProfessionisti[]{lp});
		
		assertEquals(556,comm.totaleIncasso());
	}

}
