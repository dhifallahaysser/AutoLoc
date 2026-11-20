package tn.esprit.aysserdhifallah4emiot3.Services;

import tn.esprit.aysserdhifallah4emiot3.Domain.Employe;

import java.util.List;

public interface IEmployeService {
    Employe createEmploye(Employe employe);
    Employe getEmployeById(Long id);
    Employe updateEmploye(Employe employe);
    void deleteEmployeById(Long id);
    List<Employe> getAllEmployes();
}
