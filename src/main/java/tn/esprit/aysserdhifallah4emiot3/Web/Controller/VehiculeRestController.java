package tn.esprit.aysserdhifallah4emiot3.Web.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.aysserdhifallah4emiot3.Domain.Vehicule;
import tn.esprit.aysserdhifallah4emiot3.Services.Impls.Vehiculeservice;
@RequiredArgsConstructor
@RestController
@RequestMapping("vehicule")
public class VehiculeRestController {
    private final Vehiculeservice vehiculeservice;
    @PostMapping
    public void createVehicule(@RequestBody Vehicule vehicule) {
        vehiculeservice.createVehicule(vehicule);
    }
    @GetMapping("/{id}")
    public Vehicule getVehiculeById(@RequestParam long id) {
        return vehiculeservice.getVehiculeById(id);
    }
}
