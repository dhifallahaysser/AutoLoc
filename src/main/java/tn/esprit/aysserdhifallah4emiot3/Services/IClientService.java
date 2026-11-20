package tn.esprit.aysserdhifallah4emiot3.Services;

import tn.esprit.aysserdhifallah4emiot3.Domain.Client;

import java.util.List;

public interface IClientService {
    Client createClient(Client client);
    Client getClientById(Long id);
    Client updateClient(Client client);
    void deleteClientById(Long id);
    List<Client> getAllClients();
}
