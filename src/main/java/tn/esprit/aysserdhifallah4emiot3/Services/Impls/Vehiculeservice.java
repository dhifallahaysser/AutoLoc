package tn.esprit.aysserdhifallah4emiot3.Services.Impls;

import tn.esprit.aysserdhifallah4emiot3.Domain.Vehicule;
import tn.esprit.aysserdhifallah4emiot3.Repositories.IVehiculerepositories;
import tn.esprit.aysserdhifallah4emiot3.Services.IVehiculeService;

import java.util.List;

public class Vehiculeservice implements IVehiculeService {
    private IVehiculerepositories vehiculeerepository;

    @Override
    public Vehicule createVehicule(Vehicule vehicule) {
        return (Vehicule) vehiculeerepository.save(vehicule);
    }

    @Override
    public Vehicule getVehiculeById(int id) {
        return (Vehicule) vehiculeerepository.findById(id).get();
    }

    @Override
    public void updateVehicule(Vehicule vehicule) {
        return (Vehicule) vehiculeerepository.save(vehicule);
    }

    @Override
    public void deleteVehiculeById(int id) {

    }

    @Override
    public List<Vehicule> getAllVehicules() {
        return vehiculeerepository.findAll();
    }
}
