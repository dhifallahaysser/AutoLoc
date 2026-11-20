package tn.esprit.aysserdhifallah4emiot3.Services.Impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.aysserdhifallah4emiot3.Domain.Agence;
import tn.esprit.aysserdhifallah4emiot3.Domain.Equipement;
import tn.esprit.aysserdhifallah4emiot3.Domain.Vehicule;
import tn.esprit.aysserdhifallah4emiot3.Repositories.IAgencerepositories;
import tn.esprit.aysserdhifallah4emiot3.Repositories.IEquipementrepositories;
import tn.esprit.aysserdhifallah4emiot3.Repositories.IVehiculerepositories;
import tn.esprit.aysserdhifallah4emiot3.Services.IVehiculeService;

import java.util.List;
@AllArgsConstructor
@Service


public class Vehiculeservice implements IVehiculeService {
    private IVehiculerepositories vehiculeerepository;
    private IAgencerepositories agenceRepository;
    private IEquipementrepositories equipementrepository;


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

    @Override
    public Vehicule assignVehiculeToAgence(Long idVehicule, Long idAgence) {
        Vehicule vehicule = vehiculeerepository.findById(idVehicule).orElse(null);
        Agence agence = agenceRepository.findById(idAgence).orElse(null);
        if(vehicule!=null || agence!=null){
            vehicule.setAgence(agence);

        }
        return vehiculeerepository.save(vehicule);

    }

    @Override
    public Vehicule assignVehiculeToEquipement(Long idVehicule, Long idEquipement) {
        Vehicule vehicule = vehiculeerepository.findById(idVehicule).orElse(null);
        Equipement equipement = equipementrepository.findById(idEquipement).orElse(null);
        if (vehicule != null || equipement != null) {
            vehicule.getEquipements().add(equipement);
        }
        return vehiculeerepository.save(vehicule);
    }
}
