package org.example.Design_patterns.builder;

public class Voiture {
    private String couleur;
    private String marque;
    private int nbrRoue;
    private int nbrPorte;

    private Voiture (VoitureBuilder builder){
        this.couleur = builder.couleur;
        this.marque = builder.marque;
        this.nbrRoue = builder.nbrRoue;
        this.nbrPorte = builder.nbrPorte;
    }

    public static class VoitureBuilder{
        private String couleur;
        private String marque;
        private int nbrRoue;
        private int nbrPorte;

        public VoitureBuilder couleur (String couleur){
            this.couleur = couleur;
            return this;
        }

        public VoitureBuilder marque (String marque){
            this.marque = marque;
            return this;
        }

        public VoitureBuilder nbrRoue (int nbrRoue){
            this.nbrRoue = nbrRoue;
            return this;
        }

        public VoitureBuilder nbrPorte (int nbrPorte){
            this.nbrPorte = nbrPorte;
            return this;
        }

        public Voiture build() {
            return new Voiture(this);
        }
    }

    public void display() {
        System.out.printf("%s %s, %d roues, %d portes%n", marque, couleur, nbrRoue, nbrPorte);
    }
}
