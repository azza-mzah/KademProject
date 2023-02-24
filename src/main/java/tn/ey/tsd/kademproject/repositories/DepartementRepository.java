package tn.ey.tsd.kademproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.ey.tsd.kademproject.entities.Departement;

public interface DepartementRepository extends JpaRepository<Departement,Integer> {
}
