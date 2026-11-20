package tn.esprit.aysserdhifallah4emiot3.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.aysserdhifallah4emiot3.Domain.Vehicule;
import tn.esprit.aysserdhifallah4emiot3.Services.Impls.Vehiculeservice;

import java.util.List;
@Tag(name= " Vehicule" ,  description = "Gestion vehicule")
@RequiredArgsConstructor
@RestController
@RequestMapping("vehicule")
public class VehiculeRestController {
    private final Vehiculeservice vehiculeservice;
    @Operation(summary = "Create a new vehicule")
    @PostMapping
    public void createVehicule(@RequestBody Vehicule vehicule) {
        vehiculeservice.createVehicule(vehicule);
    }
    @GetMapping("/{id}")
    public Vehicule getVehiculeById(@PathVariable long id) {
        return vehiculeservice.getVehiculeById(id);
    }
   @PutMapping
    public Vehicule updateVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeservice.updateVehicule(vehicule);
    }
    @DeleteMapping("/{id}")
    public void deleteVehiculeById(@PathVariable long id) {
        vehiculeservice.deleteVehiculeById(id);
    }
    @GetMapping
    public List<Vehicule> getAllVehicules() {
        return vehiculeservice.getAllVehicules();
    }
    @PutMapping("/{idVehicule}/agence/{idAgence}")
    public Vehicule assignVehiculeToAgence(@PathVariable long idVehicule, @PathVariable Long idAgence) {
        return vehiculeservice.assignVehiculeToAgence(idVehicule, idAgence);
    }
    @PutMapping("/{idVehicule}/equipement/{idEquipement}")
    public Vehicule assignVehiculeToEquipement(
            @PathVariable("idVehicule") long idVehicule,
            @PathVariable("idEquipement") long idEquipement) {

        return vehiculeservice.assignVehiculeToEquipement(
                idVehicule, idEquipement);
    }
}
