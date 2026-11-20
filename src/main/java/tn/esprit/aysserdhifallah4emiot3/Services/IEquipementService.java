package tn.esprit.aysserdhifallah4emiot3.Services;

import tn.esprit.aysserdhifallah4emiot3.Domain.Equipement;

import java.util.List;

public interface IEquipementService {
    Equipement createEquipement(Equipement equipement);
    Equipement getEquipementById(Long id);
    Equipement updateEquipement(Equipement equipement);
    void deleteEquipementById(Long id);
    List<Equipement> getAllEquipements();
}
