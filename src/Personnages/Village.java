package Personnages;

import Personnages.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois= 0;
	private Gaulois chef;
	private Gaulois[] villageois;
	private static final int NB_VILLAGEOIS_MAX=30;
	
	public Village(String nom, Gaulois chef, int nb_habitant_max) {
		this.nom= nom;
		this.chef= chef;
		this.villageois= new Gaulois[nb_habitant_max];
		ajouterVillageois(chef);
	}
	
	public String getNom() {
		return nom;
	} 
	
	public Gaulois getChef() {
		return chef;
	}
	
	public void ajouterVillageois(Gaulois gaulois) {
        if (nbVillageois < villageois.length) {
            villageois[nbVillageois] = gaulois;
            nbVillageois++;
            gaulois.setVillage(this);
        } else {
            System.out.println("Le village est plein !");
        }
    }
	
	public Gaulois trouverVillageois(int numVillageois) {
        int i = numVillageois - 1;
        if (i >= 0 && i < nbVillageois) {
            return villageois[i];
        } else {
            System.out.println("Il n'y a pas autant d'habitants dans notre village !");
            return null;
        }
    }
	
	public void afficherVillageois() {
        System.out.println("Dans le village \"" + nom + "\" du chef " + chef.getNom() + 
                          " vivent les légendaires gaulois :");
        for (int i = 1; i < nbVillageois; i++) {
            System.out.println("- " + villageois[i].getNom());
        }
    }
	
	public static void main(String[] args) {
        Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
        Village village = new Village("Village des Irréductibles", abraracourcix, 30);
        Gaulois gaulois = village.trouverVillageois(30);
        Gaulois asterix = new Gaulois("Astérix", 8);
        village.ajouterVillageois(asterix);
        gaulois = village.trouverVillageois(1);
        System.out.println(gaulois);
        gaulois = village.trouverVillageois(2);
        System.out.println(gaulois);
        village.afficherVillageois();
        
        System.out.println("\nPrésentations :");
        abraracourcix.sePresenter();
        asterix.sePresenter();
        
        Gaulois obelix = new Gaulois("Obélix", 25);
        village.ajouterVillageois(obelix);
        village.afficherVillageois();
        Gaulois doublePolemix = new Gaulois("DoublePolémix", 4);
        
        System.out.println("\nPrésentations :");
        abraracourcix.sePresenter();
        asterix.sePresenter();
        doublePolemix.sePresenter();
   
    }
}
	
