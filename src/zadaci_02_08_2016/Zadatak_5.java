package zadaci_02_08_2016;

import java.util.Scanner;

public class Zadatak_5 {
	
	public static void bacanjeNovcica(int brojBacanja){
		//Metoda prima jedan argument, broj bacanja novcica
		
		int pismo = 0;
		int glava = 0;
		
		//Simuliranje bacanja novcica random brojevima 0 za pismo i 1 za glava
		for (int i = 0; i < brojBacanja; i++) {
			
			//Ukoliko je random broj jednak 0 onda je u pitanju pismo, ako nije onda je glava
			if((int)(Math.random() * 2) == 0){
				pismo++;
			}else {
				glava++;
			}
		}
		
		//Ispisivanje rezultata na konzoli
		System.out.println("Novcic je pokazao pismo: " + pismo + " puta");
		System.out.println("Novcic je pokazao glavu: " + glava + " puta");
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Unos broja bacanja od korisnika
		System.out.println("Unesite broj bacanja novcica koji zelite: ");
		int brojPonavljanja = input.nextInt();
		
		//Pozivanje metode bacanjeNovcica kojoj se proslijedjuje broj bacanja koji korisnik zeli
		bacanjeNovcica(brojPonavljanja);
		
		input.close();
		
	}
}
