package tn.esprit.aysserdhifallah4emiot3.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.aysserdhifallah4emiot3.Domain.Client;
import tn.esprit.aysserdhifallah4emiot3.Services.IClientService;

import java.util.List;

@Tag(name = "Client", description = "Gestion client")
@RequiredArgsConstructor
@RestController
@RequestMapping("/client")
public class ClientRestController {
    private final IClientService service;

    @Operation(summary = "Create a new client")
    @PostMapping
    public Client createClient(@RequestBody Client client) {
        return service.createClient(client);
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id) {
        return service.getClientById(id);
    }

    @PutMapping
    public Client updateClient(@RequestBody Client client) {
        return service.updateClient(client);
    }

    @DeleteMapping("/{id}")
    public void deleteClientById(@PathVariable Long id) {
        service.deleteClientById(id);
    }

    @GetMapping
    public List<Client> getAllClients() {
        return service.getAllClients();
    }
}
