package tn.esprit.aysserdhifallah4emiot3.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.aysserdhifallah4emiot3.Domain.Contrat;
import tn.esprit.aysserdhifallah4emiot3.Services.IContratService;

import java.util.List;

@Tag(name = "Contrat", description = "Gestion contrat")
@RequiredArgsConstructor
@RestController
@RequestMapping("/contrat")
public class ContratRestController {
    private final IContratService service;

    @Operation(summary = "Create a new contrat")
    @PostMapping
    public Contrat createContrat(@RequestBody Contrat contrat) {
        return service.createContrat(contrat);
    }

    @GetMapping("/{id}")
    public Contrat getContratById(@PathVariable Long id) {
        return service.getContratById(id);
    }

    @PutMapping
    public Contrat updateContrat(@RequestBody Contrat contrat) {
        return service.updateContrat(contrat);
    }

    @DeleteMapping("/{id}")
    public void deleteContratById(@PathVariable Long id) {
        service.deleteContratById(id);
    }

    @GetMapping
    public List<Contrat> getAllContrats() {
        return service.getAllContrats();
    }
}
