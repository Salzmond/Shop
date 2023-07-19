package org.telran.shop.service;

import org.springframework.stereotype.Service;
import org.telran.shop.model.Client;
import org.telran.shop.repository.ClientRepository;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    private ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.getAll();
    }

    @Override
    public Client getByLogin(String login) {
        return clientRepository.getByLogin(login);
    }

    @Override
    public Client create(Client client) {
        return clientRepository.create(client);
    }
}