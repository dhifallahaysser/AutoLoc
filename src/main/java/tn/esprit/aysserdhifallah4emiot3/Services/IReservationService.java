package tn.esprit.aysserdhifallah4emiot3.Services;

import tn.esprit.aysserdhifallah4emiot3.Domain.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation createReservation(Reservation reservation);
    Reservation getReservationById(Long id);
    Reservation updateReservation(Reservation reservation);
    void deleteReservationById(Long id);
    List<Reservation> getAllReservations();
}
