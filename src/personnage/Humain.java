package personnage;

public class Humain {
	private String nom;
	private String boissonFavorite;
	protected int argent;
	

	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	protected String parler(String texte) {
		return getNom() + " - " + texte;
	}
	
	public void direBonjour() {
		System.out.println(parler("Bonjour ! Je m’appelle " + getNom() + " et j’aime boire du " + boissonFavorite));
	}
	
	public void boire() {
		System.out.println(parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !"));
	}
	
	public void gagnerArgent(int argentGagne) {
		argent += argentGagne;
	}
	
	public void perdreArgent(int argentPerdu) {
		argent -= argentPerdu;
	}
	
	public void acheter(String bien, int prix) {
		if(prix <= getArgent()) {
			System.out.println(parler(" J'ai " + getArgent() + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous"));
			perdreArgent(prix);
		}
		else {
			System.out.println(parler(" Je n'ai plus que " + getArgent() + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous"));
		}
	}
	
	
	

}
