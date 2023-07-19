package org.telran.shop.service;

import org.telran.shop.model.Client;

import java.util.List;

public interface ClientService {

    List<Client> getAll();
    Client getByLogin(String login);

    Client create(Client client);
}