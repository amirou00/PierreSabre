package personnage;

public class Commercant extends Humain {

	public Commercant(String nom, String boissonFavorite, int argent) {
		super(nom, "thé", argent);
	}
	
	public int seFaireExtorquer() {
		int argentExtoruqe = getArgent();
		super.perdreArgent(getArgent());
		parler("J’ai tout perdu! Le monde est trop injuste .");
		return argentExtoruqe;
	}
	
	public void recevoir(int argent) {
		super.gagnerArgent(argent);
		parler(argent + " sous ! Je te remercie généreux donateur! ");
	}
	
	

}
