package personnage;

public class Yakuza extends Humain {
	private String clan;
	private int réputation = 0;

	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commerçant victime) {
		System.out.println(parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?"));
		System.out.println(parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !"));
		int argentDeVictime = victime.seFaireExtorquer();
		gagnerArgent(argentDeVictime);
		réputation += 1;
		System.out.println(parler("J’ai piqué les " + argentDeVictime + " sous de Marco, ce qui me fait " + argent + " sous dans ma poche. Hi ! Hi ! "));
	}

}
