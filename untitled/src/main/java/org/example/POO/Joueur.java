package org.example.POO;

public class Joueur {
    private String nom;
    private int niveau;
    private int experience;
    private static int nombreDeJoueurs = 0;

    public static void compterNbJoueurs() { System.out.println(nombreDeJoueurs); }

    public Joueur() {
        nombreDeJoueurs++;
    }
    public Joueur(String nom) {
        this();
        this.nom = nom;
    }
    public Joueur(String nom, int niveau, int experience){
        this();
        this.nom = nom;
        this.niveau = niveau;
        this.experience = experience;
    }

    public void validerLaQuete() {
        this.experience = this.experience + 33;
        System.out.println("Quête validée");
    }

    public void getExperience() {
        System.out.println(this.experience);
    }

    public void monterDeNiveau() {
        if ( this.experience >= 100 ) {
            this.niveau = this.niveau + 1;
            this.experience = 0;
            System.out.println("Montée en niveau");
        }
        else {
            System.out.println("Poursuite");
        }
    }

    public void afficher() {
        System.out.println(this.nom);
    }
}
