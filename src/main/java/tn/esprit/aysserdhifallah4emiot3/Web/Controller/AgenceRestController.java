package tn.esprit.aysserdhifallah4emiot3.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.aysserdhifallah4emiot3.Domain.Agence;
import tn.esprit.aysserdhifallah4emiot3.Services.IAgenceService;

import java.util.List;

@Tag(name = "Agence", description = "Gestion agence")
@RequiredArgsConstructor
@RestController
@RequestMapping("/agence")
public class AgenceRestController {
    private final IAgenceService service;

    @Operation(summary = "Create a new agence")
    @PostMapping
    public Agence createAgence(@RequestBody Agence agence) {
        return service.createAgence(agence);
    }

    @GetMapping("/{id}")
    public Agence getAgenceById(@PathVariable Long id) {
        return service.getAgenceById(id);
    }

    @PutMapping
    public Agence updateAgence(@RequestBody Agence agence) {
        return service.updateAgence(agence);
    }

    @DeleteMapping("/{id}")
    public void deleteAgenceById(@PathVariable Long id) {
        service.deleteAgenceById(id);
    }

    @GetMapping
    public List<Agence> getAllAgences() {
        return service.getAllAgences();
    }
}
