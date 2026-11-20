package tn.esprit.aysserdhifallah4emiot3.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.aysserdhifallah4emiot3.Domain.Reservation;

public interface IReservationrepositories extends JpaRepository<Reservation, Long> {
}
