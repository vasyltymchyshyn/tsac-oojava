package vasyl.harbour.main;

public class Main {
	
	public static void main( String[] args){
		

		PortoNavale harbour = new PortoNavale();
		harbour.setNomePorto("harbour");
		harbour.setImbarcazioniPresenti(50);
		harbour.setDimensionem2(103);
		
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
		
		gg.attacco();
		System.out.println(harbour.getDimensionem2());
		
	}

}
