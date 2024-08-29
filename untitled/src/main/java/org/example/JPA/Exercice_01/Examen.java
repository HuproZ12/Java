package org.example.JPA.Exercice_01;

import lombok.*;
import javax.persistence.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "examen")
public class Examen {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_exam") private int id;
    private int note;
    private String matiere;
    @ManyToOne @JoinColumn(name = "id_etu") private Etudiant etudiant;

    @Override
    public String toString() {
        return (getMatiere()+", "+getNote());
    }
}