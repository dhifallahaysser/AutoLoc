package tn.esprit.aysserdhifallah4emiot3.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.aysserdhifallah4emiot3.Domain.Equipement;
import tn.esprit.aysserdhifallah4emiot3.Services.IEquipementService;

import java.util.List;

@Tag(name = "Equipement", description = "Gestion equipement")
@RequiredArgsConstructor
@RestController
@RequestMapping("/equipement")
public class EquipementRestController {
    private final IEquipementService service;

    @Operation(summary = "Create a new equipement")
    @PostMapping
    public Equipement createEquipement(@RequestBody Equipement equipement) {
        return service.createEquipement(equipement);
    }

    @GetMapping("/{id}")
    public Equipement getEquipementById(@PathVariable Long id) {
        return service.getEquipementById(id);
    }

    @PutMapping
    public Equipement updateEquipement(@RequestBody Equipement equipement) {
        return service.updateEquipement(equipement);
    }

    @DeleteMapping("/{id}")
    public void deleteEquipementById(@PathVariable Long id) {
        service.deleteEquipementById(id);
    }

    @GetMapping
    public List<Equipement> getAllEquipements() {
        return service.getAllEquipements();
    }
}
