package tn.ey.tsd.kademproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.ey.tsd.kademproject.entities.Departement;
import tn.ey.tsd.kademproject.services.IDepartementServices;

import java.util.List;
@RestController
@RequestMapping("departement")
@RequiredArgsConstructor
public class DepartementController {
    private final IDepartementServices iDepartementServices;

    @GetMapping()
    public List<Departement> getAllDepartement(){
        return iDepartementServices.getAllDepartement();
    }
    @GetMapping("{id}")
    public Departement getByIdDepartement(@PathVariable int id){
        return iDepartementServices.getByIdDepartement(id);
    }
    @DeleteMapping("{id}")
    private void deleteDepartement(@PathVariable int id){
        iDepartementServices.deleteDepartement(id);
    }
    @PostMapping()
    public void ajouterDepartement(@RequestBody Departement departement){
        iDepartementServices.ajouterDepartement(departement);
    }
    @PutMapping()
    private Departement updateDepartement(@RequestBody Departement departement){
        iDepartementServices.updateDepartement(departement);
        return departement;
    }}