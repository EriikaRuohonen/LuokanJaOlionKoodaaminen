
public class Main {

	public static void main(String[] args) {
		// Muodostetaan olio
		Pyykkikone kone1 = new Pyykkikone("Upo", "Pesukarhu", 7);
		Pyykkikone kone2 = new Pyykkikone("Siemens", "PK1000S", 8);
		kone1.tulostaTiedot();
		kone1.Kaynnisty();
		kone1.muutaTiedot("Miele", "Super10", 9);
		kone1.tulostaTiedot(); // Tulostetaan muutetut tiedot
	}

}

class Pyykkikone {
	
		// Ominaisuudet
		public String merkki;
		public String malli;
		public int tayttomaara;
		
		// Luodaan konstruktori
		public Pyykkikone(String merkki, String malli, int tayttomaara)
		{
			this.merkki = merkki;
			this.malli = malli;
			this.tayttomaara = tayttomaara;
		}
		
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
		
		public void tulostaTiedot()	// Tulostetaan pesukoneen tiedot
		{
			System.out.println("Pesukone");
			System.out.println("Merkki: " + merkki);
			System.out.println("Malli: " + malli);
			System.out.println("Täyttömäärä: " + tayttomaara + " kg");
		}
		
		public void muutaTiedot(String merkki, String malli, int tayttomaara) // Muutetaan tiedot parametreina saaduiksi
		{
			this.merkki = merkki;
			this.malli = malli;
			this.tayttomaara = tayttomaara;
		}
	}

