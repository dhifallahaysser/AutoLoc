package tn.esprit.aysserdhifallah4emiot3.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.aysserdhifallah4emiot3.Domain.Maintenance;
import tn.esprit.aysserdhifallah4emiot3.Services.IMaintenanceService;

import java.util.List;

@Tag(name = "Maintenance", description = "Gestion maintenance")
@RequiredArgsConstructor
@RestController
@RequestMapping("/maintenance")
public class MaintenanceRestController {
    private final IMaintenanceService service;

    @Operation(summary = "Create a new maintenance")
    @PostMapping
    public Maintenance createMaintenance(@RequestBody Maintenance maintenance) {
        return service.createMaintenance(maintenance);
    }

    @GetMapping("/{id}")
    public Maintenance getMaintenanceById(@PathVariable Long id) {
        return service.getMaintenanceById(id);
    }

    @PutMapping
    public Maintenance updateMaintenance(@RequestBody Maintenance maintenance) {
        return service.updateMaintenance(maintenance);
    }

    @DeleteMapping("/{id}")
    public void deleteMaintenanceById(@PathVariable Long id) {
        service.deleteMaintenanceById(id);
    }

    @GetMapping
    public List<Maintenance> getAllMaintenances() {
        return service.getAllMaintenances();
    }
}
