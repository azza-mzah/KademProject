package tn.ey.tsd.kademproject.services;

import tn.ey.tsd.kademproject.entities.Etudiant;

import java.util.List;

public interface IEtudiantServices {
    void ajouterEtudiant(Etudiant e);
    void updateEtudiant(Etudiant e);
    List<Etudiant> getAll();
    Etudiant getById(int id);
    void deleteEtudiant(int id);
    void assignEtudiantToDepartement (Integer etudiantId, Integer departementId);
}
