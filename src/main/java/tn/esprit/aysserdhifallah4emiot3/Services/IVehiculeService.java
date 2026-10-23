package tn.esprit.aysserdhifallah4emiot3.Services;

import tn.esprit.aysserdhifallah4emiot3.Domain.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule createVehicule(Vehicule vehicule);
    Vehicule getVehiculeById(int id);
    void updateVehicule(Vehicule vehicule);
    void deleteVehiculeById(int id);
    List<Vehicule> getAllVehicules();

}
