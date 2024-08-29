package org.example.JPA.Exercice_01;

import lombok.*;
import javax.persistence.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Adresse {
    private int numero;
    private String rue;
    private String ville;
    private int cp;
}