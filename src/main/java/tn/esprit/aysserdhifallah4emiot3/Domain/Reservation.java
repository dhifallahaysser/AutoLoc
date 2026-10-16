package tn.esprit.aysserdhifallah4emiot3.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"vehicule", "client", "contrat"})
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idReservation;
    LocalDate dateDebut;
    LocalDate dateFin;

    @Enumerated(EnumType.STRING)
    StatutReservation statut;

    @ManyToOne
    Vehicule vehicule;

    @ManyToOne
    Client client;

    @OneToOne
    Contrat contrat;
}
