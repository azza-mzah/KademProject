package tn.ey.tsd.kademproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.ey.tsd.kademproject.entities.Contrat;
import tn.ey.tsd.kademproject.repositories.ContratRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IContratServicesImp implements IContratServices{
    private final ContratRepository contratRepository;

    @Override
    public void ajouterContrat(Contrat c){
        contratRepository.save(c);
    }
    @Override
    public void updateContrat(Contrat c) {
        contratRepository.save(c);
    }

    @Override
    public List<Contrat> getAllContrat() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat getByIdContrat(Integer id) {
        return contratRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteContrat(Integer id) {
        contratRepository.deleteById(id);
    }

}