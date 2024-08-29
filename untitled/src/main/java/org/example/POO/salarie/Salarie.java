package org.example.POO.salarie;

import java.util.ArrayList;
import java.util.List;

public class Salarie {
    private int matricule;
    private String service;
    private String categorie;
    protected String nom;
    protected int salaire;
    public static List<Salarie> listSalaries = new ArrayList<>();

    private static int nbEmployes = 0;
    private static int totalSalaires = 0;

    public Salarie(int matricule, String service, String categorie, String nom, int salaire) {
        this.matricule = matricule;
        this.service = service;
        this.categorie = categorie;
        this.nom = nom;
        this.salaire = salaire;
        nbEmployes++;
        totalSalaires += salaire;
    }

    public void afficherSalaire() {
        System.out.println("Le salaire de "+this.nom+" est de "+this.salaire+" euros");
    }

    public int getMatricule() {
        return this.matricule;
    }

    public String getNom() {
        return this.nom;
    }

    public static void afficherNbEmployes() {
        System.out.println("Il y a "+nbEmployes+" salariés");
    }

    public static void afficherTotalSalaires() {
        System.out.println("Le montant total des salaires des "+nbEmployes+" employés est de "+totalSalaires+" euros");
    }

    public static void viderBiz() {
        nbEmployes = 0;
        totalSalaires = 0;
        listSalaries.clear();
        System.out.println("Succès");
    }
}