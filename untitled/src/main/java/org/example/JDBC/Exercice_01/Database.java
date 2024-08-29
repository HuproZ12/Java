package org.example.JDBC.Exercice_01;
import java.sql.*;

public class Database {
    public static Connection connection;

    public static void connexion() {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "Cdjpmy1234567%";

        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.out.println("Erreur durant la connexion\n" + e.getMessage());
        }
    }

    public static void deconnexion() {
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("Erreur durant la déconnexion\n" + e.getMessage());
        }
    }
}