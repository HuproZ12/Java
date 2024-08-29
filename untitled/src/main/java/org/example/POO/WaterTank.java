package org.example.POO;

public class WaterTank {
    private String lab;
    private int pVide;
    private int capacite;
    private int remplissage;

    private static int totalTanks = 0;
    public static int getTotalTanks() { return totalTanks; }

    @Override
    public String toString() {
        return this.lab;
    }

    public WaterTank(String lab, int pVide, int capacite, int remplissage) {
        this.lab = lab;
        this.pVide = pVide;
        this.capacite = capacite;
        this.remplissage = remplissage;
        totalTanks += this.remplissage;
    }

    public int getPTotal(){
        return this.pVide + this.remplissage;
    }

    public void moreWater(int quantite){
        System.out.print("Quantité d'eau dans "+this.lab+" après ajout de "+quantite+" litres : ");
        int newAmount = this.remplissage + quantite;
        if ( newAmount > this.capacite){
            System.out.println(this.capacite+"/"+this.capacite);
            System.out.println("Excès d'eau récupéré : "+(newAmount - this.capacite));
            totalTanks += this.capacite - this.remplissage;
            this.remplissage = this.capacite;
        }
        else {
            System.out.println(newAmount+"/"+this.capacite);
            this.remplissage = newAmount;
            totalTanks += quantite;
        }
    }

    public void lessWater(int quantite){
        System.out.print("Quantité d'eau dans "+this.lab+" après tentative de retrait de "+quantite+" litres : ");
        int newAmount = this.remplissage - quantite;
        if ( newAmount <= 0){
            System.out.println("0/"+this.capacite);
            System.out.println("Quantité d'eau récupérée : "+this.remplissage);
            totalTanks -= this.remplissage;
            this.remplissage = 0;
        }
        else {
            System.out.println(newAmount+"/"+this.capacite);
            this.remplissage = newAmount;
            totalTanks -= quantite;
        }
    }
}