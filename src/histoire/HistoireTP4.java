package histoire;

import personnage.Commercant;
import personnage.Humain;
import personnage.Ronin;
import personnage.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("une jeu", 2);
		prof.acheter("kimono", 50);
		
		Commercant marco = new Commercant("Marco", null, 100);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
		Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", "Whisky", 30, "Warsong");
		yakuLeNoir.direBonjour();
		yakuLeNoir.extorquer(marco);
		
		Ronin roro = new Ronin("Roro", "shochu", 100);
		roro.direBonjour();
		roro.donner(marco);
		roro.provoquer(yakuLeNoir);
	}

}