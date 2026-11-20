package tn.esprit.aysserdhifallah4emiot3.Services.Impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.aysserdhifallah4emiot3.Domain.Equipement;
import tn.esprit.aysserdhifallah4emiot3.Repositories.IEquipementrepositories;
import tn.esprit.aysserdhifallah4emiot3.Services.IEquipementService;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipementService implements IEquipementService {
    private final IEquipementrepositories equipementRepository;

    @Override
    public Equipement createEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public Equipement getEquipementById(Long id) {
        return equipementRepository.findById(id).orElse(null);
    }

    @Override
    public Equipement updateEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public void deleteEquipementById(Long id) {
        equipementRepository.deleteById(id);
    }

    @Override
    public List<Equipement> getAllEquipements() {
        return equipementRepository.findAll();
    }
}
