package tn.esprit.aysserdhifallah4emiot3.Services.Impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.aysserdhifallah4emiot3.Domain.Client;
import tn.esprit.aysserdhifallah4emiot3.Repositories.IClientrepositories;
import tn.esprit.aysserdhifallah4emiot3.Services.IClientService;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientService implements IClientService {
    private final IClientrepositories clientRepository;

    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void deleteClientById(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}
