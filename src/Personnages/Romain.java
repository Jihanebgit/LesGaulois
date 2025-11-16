package Personnages;

public class Romain {
    private String nom;
    private int force;

    public Romain(String nom, int force) {
        this.nom = nom;
        this.force = force;
        assert isInvariantVerified() : "Erreur Invariant ";
    }

    public String getNom() {
        return nom;
    }
    
    public int getForce() {
        return force;
    }

    public void parler(String texte) {
        System.out.println(prendreParole() + "\"" + texte + "\"");
    }

    private String prendreParole() {
        return "Le romain " + nom + " : ";
    }
    
    public void recevoirCoup(int forceCoup) {
    	assert forceCoup>=0 : "la force du coup reçu est positive";
        int forceInit=force;
    	force -= forceCoup;
        if (force > 0) {
            parler("Aïe");
        } else {
            parler("J'abandonne !");
        }
        assert isInvariantVerified() : "Erreur Invariant neg ";
        assert force<forceInit : "la force d'un Romain a diminué";
    }
    
    private boolean isInvariantVerified() {
        return force >= 0;
    }

    public static void main(String[] args) {

        
        System.out.println("invariant test");
        
        System.out.println("romain normal");
        Romain brutus = new Romain("Brutus", 5);
        System.out.println("Force de Brutus : " + brutus.getForce());
        System.out.println("Invariant vérifié : " + brutus.isInvariantVerified());
        
        System.out.println("\n recevoir coup");
        brutus.recevoirCoup(3);
        System.out.println("Force de Brutus après coup : " + brutus.getForce());
        System.out.println("Invariant vérifié : " + brutus.isInvariantVerified());
        
        System.out.println("\n recevoir coup fort");
        brutus.recevoirCoup(2); 
        System.out.println("Force de Brutus après coup fort : " + brutus.getForce());
        System.out.println("Invariant vérifié : " + brutus.isInvariantVerified());
        
        System.out.println("\n force negative");
        Romain minus = new Romain("Minus",6);
        System.out.println("Assertion vérifier");
        
        System.out.println("\n force diminue");
        Romain minus2 = new Romain("Minus2", 6);
        minus2.recevoirCoup(1);
        System.out.println("Assertion vérifier");
        
    }
}