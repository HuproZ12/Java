package org.example.JDBC.Exercice_01;
import lombok.*;
import java.sql.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant {
    private int id;
    private String nom;
    private String prenom;
    private int numClasse;
    private Date dateDiplome;
}