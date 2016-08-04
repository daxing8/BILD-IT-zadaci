
/***********************************************************************************************************
 * 
 * Napisati metodu koja printa 100 nasumiènih uppercase karaktera i 100 nasumiènih brojeva, 10 po liniji.
 *  
 ***********************************************************************************************************/



package zadaci_04_08_2016;

public class Zadatak_4 {
	
	//Metoda ne prima argument samo ispisuje brojeve i karaktere
	public static void printCharactersAndNumbers() {
		
		//Varijabla broji karaktere 		
		int brojacKaraktera = 0;
		
		//Varijabla broji brojeve
		int brojacBrojeva = 0;
		
		//Ispisivanje 100 random velikih slova upotrebom metode Math.random
		for (int i = 0; i < 100; i++) {
			System.out.print(" " + (char)('A' + Math.random() * ('Z' - 'A' + 1)));
			brojacKaraktera++;
			
			//Ako je brojac jednak broju 10 prebaci u sljedeci red
			if (brojacKaraktera == 10) {
				System.out.println();
				
				//Brojac se vraca na nulu
				brojacKaraktera = 0;
			}
		}
		
		System.out.println();
		
		//Ispisivanje 100 random jednocifrenih brojeva 
		for (int i = 0; i < 100; i++) {
			System.out.print(" " + (int)(Math.random() * 10));
			brojacBrojeva++;
			
			//Ako je brojac jednak broju 10 prebaci u sljedeci red
			if (brojacBrojeva == 10) {
				System.out.println();
				brojacBrojeva = 0; //brojac se ponistava na nulu
			}
		}

	}

	public static void main(String[] args) {
		
		//Pozivanje metode u main metodi
		printCharactersAndNumbers();

	}
}
