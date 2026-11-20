package tn.esprit.aysserdhifallah4emiot3.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.aysserdhifallah4emiot3.Domain.Paiement;
import tn.esprit.aysserdhifallah4emiot3.Services.IPaiementService;

import java.util.List;

@Tag(name = "Paiement", description = "Gestion paiement")
@RequiredArgsConstructor
@RestController
@RequestMapping("/paiement")
public class PaiementRestController {
    private final IPaiementService service;

    @Operation(summary = "Create a new paiement")
    @PostMapping
    public Paiement createPaiement(@RequestBody Paiement paiement) {
        return service.createPaiement(paiement);
    }

    @GetMapping("/{id}")
    public Paiement getPaiementById(@PathVariable Long id) {
        return service.getPaiementById(id);
    }

    @PutMapping
    public Paiement updatePaiement(@RequestBody Paiement paiement) {
        return service.updatePaiement(paiement);
    }

    @DeleteMapping("/{id}")
    public void deletePaiementById(@PathVariable Long id) {
        service.deletePaiementById(id);
    }

    @GetMapping
    public List<Paiement> getAllPaiements() {
        return service.getAllPaiements();
    }
}
