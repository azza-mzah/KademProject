package tn.ey.tsd.kademproject.services;

import tn.ey.tsd.kademproject.entities.Equipe;

import java.util.List;

public interface IEquipeServices {
    void ajouterEquipe(Equipe e);
    void updateEquipe(Equipe e);
    List<Equipe> getAllEquipe();
    Equipe getByIdEquipe(Integer id);
    void deleteEquipe(Integer id);
}
