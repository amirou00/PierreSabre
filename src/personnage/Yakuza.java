package personnage;

public class Yakuza extends Humain {
	private String clan;
	private int réputation = 0;

	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}
	
	public int getReputation() {
		return réputation;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int argentDeVictime = victime.seFaireExtorquer();
		gagnerArgent(argentDeVictime);
		réputation += 1;
		parler("J’ai piqué les " + argentDeVictime + " sous de Marco, ce qui me fait " + argent + " sous dans ma poche. Hi ! Hi ! ");
	}
	
	public int perdre() {
		int argentPerdu = argent;
		perdreArgent(argent);
		if (réputation > 0) {
			réputation --;
		}
		parler("J’ai perdu mon duel et mes " + argentPerdu + " sous, snif . J'ai déshonoré le clan de " + clan);
		return argentPerdu;
	}
	
	public void gagner(int gain) {
		argent += gain;
		réputation ++;
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + " Je l'ai dépouillé de ses " + gain + " sous");
	}

}
