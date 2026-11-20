package tn.esprit.aysserdhifallah4emiot3.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.aysserdhifallah4emiot3.Domain.Reservation;
import tn.esprit.aysserdhifallah4emiot3.Services.IReservationService;

import java.util.List;

@Tag(name = "Reservation", description = "Gestion reservation")
@RequiredArgsConstructor
@RestController
@RequestMapping("/reservation")
public class ReservationRestController {
    private final IReservationService service;

    @Operation(summary = "Create a new reservation")
    @PostMapping
    public Reservation createReservation(@RequestBody Reservation reservation) {
        return service.createReservation(reservation);
    }

    @GetMapping("/{id}")
    public Reservation getReservationById(@PathVariable Long id) {
        return service.getReservationById(id);
    }

    @PutMapping
    public Reservation updateReservation(@RequestBody Reservation reservation) {
        return service.updateReservation(reservation);
    }

    @DeleteMapping("/{id}")
    public void deleteReservationById(@PathVariable Long id) {
        service.deleteReservationById(id);
    }

    @GetMapping
    public List<Reservation> getAllReservations() {
        return service.getAllReservations();
    }
}
