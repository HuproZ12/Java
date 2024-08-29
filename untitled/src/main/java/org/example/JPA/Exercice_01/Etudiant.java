package org.example.JPA.Exercice_01;

import lombok.*;
import javax.persistence.*;
import java.util.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "etudiant")
public class Etudiant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_etu") private int id;
    private String nom;
    private String prenom;
    private int classe;

    @Embedded
    private Adresse adresse;

    @OneToMany(mappedBy = "etudiant", cascade = CascadeType.ALL) private List<Examen> examens;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "etudiant_cours",
            joinColumns = @JoinColumn(name = "id_etu"),
            inverseJoinColumns = @JoinColumn(name = "id_cours")
    )
    private List<Cours> courss;

    public void addCours(Cours cours) {
        courss.add(cours);
    }
}