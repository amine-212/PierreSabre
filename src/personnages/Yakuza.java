package personnages;

public class Yakuza extends Humain{
	private String clan;
    private int reputation = 0;

	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		 parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
	     parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
	     int argentVole = victime.seFaireExtorquer();
	     gagnerArgent(argentVole);
	     reputation++;
	     parler("J’ai piqué les " + argentVole + " sous de " + victime.getNom() +
	               ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
	    }
		
	}


