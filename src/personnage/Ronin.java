package personnage;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}
	
	public void donner(Commerçant beneficiaire) {
		int argentADonner = argent/10;
		System.out.println(parler(beneficiaire.getNom() + " prend ces 6 sous."));
		beneficiaire.recevoir(argentADonner);
	}
	
	

}
