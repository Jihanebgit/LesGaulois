package Personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion =1;
	private Village village;
 

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.village= null;
		
	}

	public String getNom() {
		return nom;
	}
	
	public void setVillage(Village village) {
        this.village = village;
    }

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	
	
	@Override
	public String toString() {
		return nom;
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom +" envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup((force*effetPotion)/3);
		effetPotion-=1;
		
	}
	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
	}
	
	public void sePresenter() {
        System.out.print("Le Gaulois " + nom + " : \"");
        
        if (village != null) {
            if (this.equals(village.getChef())) {
                System.out.println("Bonjour, je m'appelle " + nom + 
                                 ". Je suis le chef du village " + village.getNom() + ".\"");
            } else {
                System.out.println("Bonjour, je m'appelle " + nom + 
                                 ". J'habite le village " + village.getNom() + ".\"");
            }
        } else {
            System.out.println("Bonjour, je m'appelle " + nom + 
                             ". Je voyage de villages en villages.\"");
        }
    }
	
	
	
	public static void main(String[] args) {
		Gaulois asterix= new Gaulois("Astérix", 8);
		System.out.println(asterix);
	}

}

