package tn.ey.tsd.kademproject.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int idEquipe;
    private String nomEquipe;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;
    @OneToOne(mappedBy = "equipe")
    DetailEquipe detailEquipe;
    @ManyToMany
    List<Etudiant> attribut_etudiant_classeequipe;
}
