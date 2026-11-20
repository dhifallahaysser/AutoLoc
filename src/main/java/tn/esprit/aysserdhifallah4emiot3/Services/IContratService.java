package tn.esprit.aysserdhifallah4emiot3.Services;

import tn.esprit.aysserdhifallah4emiot3.Domain.Contrat;

import java.util.List;

public interface IContratService {
    Contrat createContrat(Contrat contrat);
    Contrat getContratById(Long id);
    Contrat updateContrat(Contrat contrat);
    void deleteContratById(Long id);
    List<Contrat> getAllContrats();
}
