package tn.ey.tsd.kademproject.entities;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetailEquipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int idDetailEquipe;
    private int salle;
    private String thematique;
    @OneToOne
    Equipe equipe;
}
