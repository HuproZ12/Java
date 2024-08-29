package org.example.POO.plante;

public class Arbre extends Plante{
    private float circonfTronc;

    public Arbre(String nom, float hauteur, String couleurF, float circonfTronc) {
        super(nom, hauteur, couleurF);
        this.circonfTronc = circonfTronc;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Circonférence du tronc : "+this.circonfTronc);
    }
}