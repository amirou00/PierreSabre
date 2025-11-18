package personnage;

public class Commerçant extends Humain {

	public Commerçant(String nom, String boissonFavorite, int argent) {
		super(nom, "thé", argent);
	}
	
	public int seFaireExtorquer() {
		int argentExtoruqe = argent;
		super.perdreArgent(argent);
		System.out.println(parler("J’ai tout perdu! Le monde est trop injuste ."));
		return argentExtoruqe;
	}
	
	public void recevoir(int argent) {
		super.gagnerArgent(argent);
		System.out.println(parler(argent + " sous ! Je te remercie généreux donateur! "));
	}
	
	

}
