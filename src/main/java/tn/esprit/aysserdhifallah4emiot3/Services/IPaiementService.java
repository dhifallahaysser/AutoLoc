package tn.esprit.aysserdhifallah4emiot3.Services;

import tn.esprit.aysserdhifallah4emiot3.Domain.Paiement;

import java.util.List;

public interface IPaiementService {
    Paiement createPaiement(Paiement paiement);
    Paiement getPaiementById(Long id);
    Paiement updatePaiement(Paiement paiement);
    void deletePaiementById(Long id);
    List<Paiement> getAllPaiements();
}
