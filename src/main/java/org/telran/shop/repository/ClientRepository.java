package org.telran.shop.repository;

import org.telran.shop.model.Client;

import java.util.List;

public interface ClientRepository {

    List<Client> getAll();
    Client getByLogin(String login);

    Client create(Client client);
}