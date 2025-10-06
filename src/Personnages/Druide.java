package Personnages;

public class Druide {
	private String nom;
	private int force;
	private int chaudron=1;
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le Druide " + nom + " : ";
	}
	
	
	
	
}


