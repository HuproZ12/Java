package org.example.POO.salarie;

import java.util.Scanner;
import static org.example.POO.salarie.Salarie.listSalaries;

public class IHM {
    public static void startGo() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int indice = 1;
            System.out.println("Sélectionnez :");
            for (Salarie sal : listSalaries) {
                System.out.println(sal.getMatricule()+". "+sal.getNom());
                indice++;
            }
            System.out.println(indice+". Total salaires");
            System.out.println((indice+1)+". Total employés");
            System.out.println((indice+2)+". Remise à zéro");
            System.out.println((indice+3)+". Quitter");

            int choix = scanner.nextInt();

            if (choix == indice+3) {
                break;
            } else if (choix == indice+2) {
                Salarie.viderBiz();
            } else if (choix == indice+1) {
                Salarie.afficherNbEmployes();
            } else if (choix == indice) {
                Salarie.afficherTotalSalaires();
            } else if (choix >= 1 && choix <= listSalaries.size() && listSalaries.size() > 0) {
                Salarie cible = null;
                for (Salarie sal : listSalaries) {
                    if (sal.getMatricule() == choix) {
                        cible = sal;
                    }
                }
                cible.afficherSalaire();
            } else {
                System.out.println("Invalide");
            }
        }
    }
}