package tn.ey.tsd.kademproject.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Universite {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Id
    private int idUniv;
    private String nomUniv;
    @OneToMany
    List<Departement> departement;
}
