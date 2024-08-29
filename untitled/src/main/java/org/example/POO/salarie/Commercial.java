package org.example.POO.salarie;

public class Commercial extends Salarie{
    private int chiffreAffaire;
    private int commission;

    public Commercial(int matricule, String service, String categorie, String nom, int salaire, int chiffreAffaire, int commission) {
        super(matricule, service, categorie, nom, salaire);
        this.chiffreAffaire = chiffreAffaire;
        this.commission = commission;
    }

    public Commercial(int matricule, String service, String categorie, String nom, int salaire) {
        super(matricule, service, categorie, nom, salaire);
    }

    @Override
    public void afficherSalaire() {
        super.afficherSalaire();
        float newSalaire = this.salaire + (this.chiffreAffaire*((float)this.commission/100));
        System.out.println("Le salaire avec commission de "+this.nom+" est de "+(int)newSalaire+" euros");
    }
}