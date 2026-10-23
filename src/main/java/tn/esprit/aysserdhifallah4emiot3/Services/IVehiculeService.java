package tn.esprit.aysserdhifallah4emiot3.Services;

import tn.esprit.aysserdhifallah4emiot3.Domain.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule createVehicule(Vehicule vehicule);
    Vehicule getVehiculeById(Long id);
    Vehicule updateVehicule(Vehicule vehicule);
    void deleteVehiculeById(Long id);
    List<Vehicule> getAllVehicules();

}
