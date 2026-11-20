package tn.esprit.aysserdhifallah4emiot3.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.aysserdhifallah4emiot3.Domain.Employe;

public interface IEmployerepositories extends JpaRepository<Employe, Long> {
}
