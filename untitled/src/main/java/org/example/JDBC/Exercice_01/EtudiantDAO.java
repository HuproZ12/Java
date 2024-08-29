package org.example.JDBC.Exercice_01;
import java.sql.*;

import static org.example.JDBC.Exercice_01.Database.connection;

public class EtudiantDAO {
    public static void addEtu(String nom, String prenom, int numClasse, int jour, int mois, int annee) {
        try {
            Etudiant etu = Etudiant.builder()
                    .nom(nom)
                    .prenom(prenom)
                    .numClasse(numClasse)
                    .dateDiplome(Date.valueOf(annee + "-" + mois + "-" + jour))
                    .build();

            String requestAdd = "INSERT INTO etudiant (nom,prenom,numClasse,dateDiplome) VALUES (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(requestAdd, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, etu.getNom());
            preparedStatement.setString(2, etu.getPrenom());
            preparedStatement.setInt(3, etu.getNumClasse());
            preparedStatement.setDate(4, etu.getDateDiplome());
            preparedStatement.executeUpdate();

            System.out.println("Etudiant ajouté à la base.");
        } catch (SQLException e) {
            System.out.println("Erreur\n" + e.getMessage());
        }
    }

    public static void baseRequest(String requete, String parametre) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(requete);
            if (!parametre.isEmpty()) {
                preparedStatement.setInt(1, Integer.parseInt(parametre));
            }

            if (requete.contains("DELETE")) {
                int resultat = preparedStatement.executeUpdate();
                if(resultat>0) {
                    System.out.println("Etudiant supprimé");
                }
            } else {
                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    Etudiant etu = Etudiant.builder()
                            .id(resultSet.getInt("id"))
                            .nom(resultSet.getString("nom"))
                            .prenom(resultSet.getString("prenom"))
                            .numClasse(resultSet.getInt("numclasse"))
                            .dateDiplome(resultSet.getDate("datediplome"))
                            .build();
                    System.out.println(etu);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erreur\n" + e.getMessage());
        }
    }
}
