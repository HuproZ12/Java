package org.example.JDBC.TP_recettes.entities;

import lombok.*;
import java.util.List;

@Data
@Builder
public class Recette {
    private int id;
    private String nom;
    private int tempsPrep;
    private int tempsCuisson;
    private String difficulte;
    private List<Ingredient> ingredients;
    private int etapesId;
    private List<Commentaire> commentaires;
    private int categorieId;
}
