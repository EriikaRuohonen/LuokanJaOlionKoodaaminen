
public class Main {

	public static void main(String[] args) {
		// Muodostetaan olio
		Pyykkikone olio1 = new Pyykkikone();
		olio1.merkki = "Upo";
		olio1.malli = "Pesukarhu";
		olio1.tayttomaara = 7;
		olio1.Kaynnisty();
	}

}

class Pyykkikone {
		// Ominaisuudet
		String merkki;
		String malli;
		int tayttomaara;
		
		// Toiminnot
		public void Kaynnisty()
		{
			System.out.println("Pesukone käynnistetty");
			aloitaOhjelma();
		}
		
		public void aloitaOhjelma()
		{
			System.out.println("Pesuohjelma aloitettu");
			lopetaOhjelma();
		}
		
		public void lopetaOhjelma()
		{
			System.out.println("Ohjelma on päättynyt");
		}
	}

