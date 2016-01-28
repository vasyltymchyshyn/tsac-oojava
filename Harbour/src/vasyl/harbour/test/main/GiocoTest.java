package vasyl.harbour.test.main;

import static org.junit.Assert.*;

import org.junit.Test;

import vasyl.harbour.main.Aereo;
import vasyl.harbour.main.Gioco;
import vasyl.harbour.main.Invasore;
import vasyl.harbour.main.PortoNavale;
import vasyl.harbour.main.Sottomarino;

public class GiocoTest {

	@Test
	public void test() {
		
		PortoNavale harbour = new PortoNavale();
		harbour.setNomePorto("harbour");
		harbour.setImbarcazioniPresenti(50);
		harbour.setDimensionem2(100);
		
		Aereo t100=new Aereo();
		t100.setCodIdentificativo("t100");
		t100.setModello("iovolo");
		t100.setArmamentiAlpha(1);
		t100.setArmamentiBeta(1); // 35
		
		Sottomarino nonsonuotare =new Sottomarino();
		nonsonuotare.setCodIdentificativo("pew12");
		nonsonuotare.setnArmamenti(5);
		nonsonuotare.setStazza(5); // 25
		
		Gioco gg = new Gioco(harbour);
		gg.setAereo(new Aereo[]{t100});
		gg.setSm(new Sottomarino[]{nonsonuotare});
		
		//assertEquals(100,gg.attacco());
		
		
	
		

		
		
		
		
		
		
	}

}
