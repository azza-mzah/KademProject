package tn.ey.tsd.kademproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.ey.tsd.kademproject.entities.Etudiant;
import tn.ey.tsd.kademproject.services.IEtudiantServices;

import java.util.List;

@RestController
@RequestMapping("etudiant")
@RequiredArgsConstructor
public class EtudiantController {

    private final IEtudiantServices iEtudiantServices;
    @GetMapping()
    public List<Etudiant> getAll(){
        return iEtudiantServices.getAll();
    }
    @GetMapping("{id}")
    public Etudiant getById(@PathVariable int id){
        return iEtudiantServices.getById(id);
    }
    @PostMapping()
    public void ajouterEtudiant(@RequestBody Etudiant e){
        iEtudiantServices.ajouterEtudiant(e);
    }
    @PutMapping("{etudiantId}/{departementId}")
    public void assignEtudiantToDepartement(@PathVariable Integer etudiantId,@PathVariable Integer departementId){
        iEtudiantServices.assignEtudiantToDepartement(etudiantId,departementId);
    }
}
