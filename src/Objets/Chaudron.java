package Objets;

import Personnages.Druide;
import Personnages.Gaulois;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	
	

	public int getQuantitePotion() {
		return quantitePotion;
	}
	


	public void setQuantitePotion(int quantitePotion) {
		this.quantitePotion = quantitePotion;
	}
	
	



	public int getForcePotion() {
		return forcePotion;
	}



	public void parler(String texte) {
		System.out.println("\"" + texte + "\"");
	}


	public void remplirChaudron(int quantite, int forcePotion2) {
		quantitePotion = quantite;
		forcePotion = forcePotion2;

	}
	
	public boolean resterPotion() {
		return getQuantitePotion() != 0;

	}

	
	public int prendreLouche() {
		return forcePotion;

	}



	public Chaudron(int quantitePotion, int forcePotion) {
		super();
		this.quantitePotion = quantitePotion;
		this.forcePotion = forcePotion;
	}
	

}
