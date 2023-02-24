package tn.ey.tsd.kademproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.ey.tsd.kademproject.entities.Contrat;

public interface ContratRepository extends JpaRepository<Contrat,Integer> {
}