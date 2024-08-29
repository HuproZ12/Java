package org.example.JDBC.Exercice_01;
import java.util.Scanner;

public class IHM {

    public static void lancer() {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("1- Saisie étudiant\n" +
                             "2- Affichage étudiants\n" +
                             "3- Affichage classe\n" +
                             "4- Suppression étudiant\n" +
                             "5- Quitter\n" +
                             "Choix : ");

            switch (scanner.nextInt()) {
                case 1: {
                    System.out.print("Nom : ");
                    String nom = scanner.next();
                    System.out.print("Prénom : ");
                    String prenom = scanner.next();
                    System.out.print("N° de classe : ");
                    int numClasse = scanner.nextInt();
                    System.out.println("Diplôme : ");
                    System.out.print("\tjour : ");
                    int jour = scanner.nextInt();
                    System.out.print("\tmois : ");
                    int mois = scanner.nextInt();
                    System.out.print("\tannée : ");
                    int annee = scanner.nextInt();

                    Database.connexion();
                    EtudiantDAO.addEtu(nom, prenom, numClasse, jour, mois, annee);
                    Database.deconnexion();
                    break;
                }
                case 2: {
                    Database.connexion();
                    EtudiantDAO.baseRequest("SELECT * FROM etudiant", "");
                    Database.deconnexion();
                    break;
                }
                case 3: {
                    Database.connexion();
                    System.out.print("N° de classe : ");
                    EtudiantDAO.baseRequest("SELECT * FROM etudiant WHERE numclasse = ?", scanner.next());
                    Database.deconnexion();
                    break;
                }
                case 4: {
                    Database.connexion();
                    EtudiantDAO.baseRequest("SELECT * FROM etudiant", "");
                    System.out.print("ID à supprimer : ");
                    EtudiantDAO.baseRequest("DELETE FROM etudiant WHERE id = ?", scanner.next());
                    Database.deconnexion();
                    break;
                }
                case 5: {
                    scanner.close();
                    return;
                }
            }
        }
    }
}