package org.example.POO.plante;

public class Plante {
    private String nom;
    private float hauteur;
    private String couleurF;

    public Plante(String nom, float hauteur, String couleurF) {
        this.nom = nom;
        this.hauteur = hauteur;
        this.couleurF = couleurF;
    }

    ///////////////////////////////////////////////////////////////////////

    public void afficher() {
        System.out.println("Plante : "+this.nom+" | Hauteur : "+this.hauteur+"m | Couleur feuilles : "+this.couleurF);
    }

    ///////////////////////////////////////////////////////////////////////

    public String getNom() {
        return this.nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getHauteur() {
        return this.hauteur;
    }
    public void setHauteur(float hauteur) {
        this.hauteur = hauteur;
    }

    public String getCouleurF() {
        return this.couleurF;
    }
    public void setCouleurF(String couleurF) {
        this.couleurF = couleurF;
    }
}