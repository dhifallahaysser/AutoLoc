package tn.esprit.aysserdhifallah4emiot3.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.aysserdhifallah4emiot3.Domain.Paiement;

public interface IPaiementrepositories extends JpaRepository<Paiement, Long> {
}
