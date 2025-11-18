package personnage;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	

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
	
	protected void parler(String texte) {
		System.out.println(getNom() + " - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + getNom() + " et j’aime boire du " + boissonFavorite);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}
	
	protected void gagnerArgent(int argentGagne) {
		argent += argentGagne;
	}
	
	protected void perdreArgent(int argentPerdu) {
		argent -= argentPerdu;
	}
	
	public void acheter(String bien, int prix) {
		if(prix <= getArgent()) {
			parler(" J'ai " + getArgent() + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		}
		else {
			parler(" Je n'ai plus que " + getArgent() + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous");
		}
	}
	
	
	

}
