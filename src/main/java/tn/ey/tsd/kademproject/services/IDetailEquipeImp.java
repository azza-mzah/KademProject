package tn.ey.tsd.kademproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.ey.tsd.kademproject.entities.DetailEquipe;
import tn.ey.tsd.kademproject.repositories.DetailEquipeRepository;

import java.util.List;
@Service
@RequiredArgsConstructor

public class IDetailEquipeImp implements IDetailEquipeServices {
    private final DetailEquipeRepository detailEquipeRepository;
    @Override
    public void ajouterDetailEquipe(DetailEquipe de) {
        detailEquipeRepository.save(de);
    }

    @Override
    public void updateDetailEquipe(DetailEquipe de) {
        detailEquipeRepository.save(de);
    }

    @Override
    public List<DetailEquipe> getAllDetailEquipe() {
        return detailEquipeRepository.findAll();
    }

    @Override
    public DetailEquipe getByIdDetailEquipe(Integer id) {
        return detailEquipeRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteDetailEquipe(Integer id) {
        detailEquipeRepository.deleteById(id);
    }
}