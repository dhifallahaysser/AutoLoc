package tn.esprit.aysserdhifallah4emiot3.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.aysserdhifallah4emiot3.Domain.Employe;
import tn.esprit.aysserdhifallah4emiot3.Services.IEmployeService;

import java.util.List;

@Tag(name = "Employe", description = "Gestion employe")
@RequiredArgsConstructor
@RestController
@RequestMapping("/employe")
public class EmployeRestController {
    private final IEmployeService service;

    @Operation(summary = "Create a new employe")
    @PostMapping
    public Employe createEmploye(@RequestBody Employe employe) {
        return service.createEmploye(employe);
    }

    @GetMapping("/{id}")
    public Employe getEmployeById(@PathVariable Long id) {
        return service.getEmployeById(id);
    }

    @PutMapping
    public Employe updateEmploye(@RequestBody Employe employe) {
        return service.updateEmploye(employe);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployeById(@PathVariable Long id) {
        service.deleteEmployeById(id);
    }

    @GetMapping
    public List<Employe> getAllEmployes() {
        return service.getAllEmployes();
    }
}
