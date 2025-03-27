package personnages;

public class Commercant extends Humain{
	
	private String nom;
	private int argent;
	
	public Commercant(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
		// TODO Auto-generated constructor stub
	}

	
	
	public int seFaireExtorquer() {
        int argentPerdu = getArgent();
        perdreArgent(argentPerdu);
        parler("J’ai tout perdu! Le monde est trop injuste...");
        return argentPerdu;
    }

    public void recevoir(int argent) {
        gagnerArgent(argent);
        parler(argent + " sous ! Je te remercie généreux donateur!");
    }
	
    
}
