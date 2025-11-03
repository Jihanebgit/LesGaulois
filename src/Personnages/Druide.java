package Personnages;
import Objets.Chaudron;
import Personnages.Gaulois;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron ;

	public String getNom() {
		return nom;
	}

	public Druide(String nom, int force, Chaudron chaudron) {
		super();
		this.nom = nom;
		this.force = force;
		this.chaudron = chaudron;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le Druide " + nom + " : ";
	}

	public void fabriquerPotion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		parler("J'ai concocté " + chaudron.getQuantitePotion() + 
				" doses de potion magique. Elle a une force de " + forcePotion
				+ ".");

	}

	public void boosterGaulois(Gaulois gaulois) {
		boolean contientPotion = chaudron.resterPotion();
		String nomGaulois = gaulois.getNom();
		if (contientPotion == true) {
			if (nomGaulois == "Obélix") {
				parler("Non," + nomGaulois + " Non!... Et tu le sais très bien !");
			} else {
				chaudron.prendreLouche();
				chaudron.setQuantitePotion(chaudron.getQuantitePotion()-1);
				gaulois.boirePotion(chaudron.getForcePotion());
				parler("Tiens " + nomGaulois + " un peu de potion magique.");
			}

		} else {
			parler("Désolé " + nomGaulois + " il n'y a plus une seule goutte de potion.");

		}
	}

}
