package tn.esprit.aysserdhifallah4emiot3.Services;

import tn.esprit.aysserdhifallah4emiot3.Domain.Agence;

import java.util.List;

public interface IAgenceService {
    Agence createAgence(Agence agence);
    Agence getAgenceById(Long id);
    Agence updateAgence(Agence agence);
    void deleteAgenceById(Long id);
    List<Agence> getAllAgences();
}
