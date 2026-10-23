package tn.esprit.aysserdhifallah4emiot3.Services.Impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.aysserdhifallah4emiot3.Domain.Vehicule;
import tn.esprit.aysserdhifallah4emiot3.Repositories.IVehiculerepositories;
import tn.esprit.aysserdhifallah4emiot3.Services.IVehiculeService;

import java.util.List;
@AllArgsConstructor
@Service


public class Vehiculeservice implements IVehiculeService {
    private IVehiculerepositories vehiculeerepository;

    @Override
    public Vehicule createVehicule(Vehicule vehicule) {
        return vehiculeerepository.save(vehicule);
    }

    @Override
    public Vehicule getVehiculeById(Long id) {
        return  vehiculeerepository.findById(id).orElse(null);
    }

    @Override
    public Vehicule updateVehicule(Vehicule vehicule) {
        return vehiculeerepository.save(vehicule);
    }

    @Override
    public void deleteVehiculeById(Long id) {
        vehiculeerepository.deleteById(id);
    }

    @Override
    public List<Vehicule> getAllVehicules() {
        return vehiculeerepository.findAll();
    }
}
