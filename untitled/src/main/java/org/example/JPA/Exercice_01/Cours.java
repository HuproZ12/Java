package org.example.JPA.Exercice_01;

import lombok.*;
import javax.persistence.*;
import java.util.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cours")
public class Cours {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_cours") private int id;
    private String matière;
    private String professeur;
    private String salle;
    private String horaire;

    @ManyToMany(mappedBy = "courss") private List<Etudiant> etudiants;

    public void addEtu(Etudiant etu) {
        etudiants.add(etu);
    }

    @Override
    public String toString() {
        return (getMatière()+", "+getProfesseur()+", "+getSalle()+", "+getHoraire());
    }
}