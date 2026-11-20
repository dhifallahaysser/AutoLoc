package tn.esprit.aysserdhifallah4emiot3.Services.Impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.aysserdhifallah4emiot3.Domain.Employe;
import tn.esprit.aysserdhifallah4emiot3.Repositories.IEmployerepositories;
import tn.esprit.aysserdhifallah4emiot3.Services.IEmployeService;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeService implements IEmployeService {
    private final IEmployerepositories employeRepository;

    @Override
    public Employe createEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe getEmployeById(Long id) {
        return employeRepository.findById(id).orElse(null);
    }

    @Override
    public Employe updateEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public void deleteEmployeById(Long id) {
        employeRepository.deleteById(id);
    }

    @Override
    public List<Employe> getAllEmployes() {
        return employeRepository.findAll();
    }
}
