package org.telran.shop.repository;

import org.springframework.stereotype.Repository;
import org.telran.shop.model.Client;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ClientRepositoryImpl implements ClientRepository {

    private Map<String, Client> clients = new HashMap<>();

    @PostConstruct
    public void init() {
        clients.put("User1", new Client("Mark", "Antonov", 25, "User1",
                "qwerty", "12345 Berlin Arkadenstr. 8"));
        clients.put("User2", new Client("Alex", "Svengard", 30, "User2",
                "asdfg", "88789 München Odessaring 25"));
        clients.put("User3", new Client("Sven", "Oxter", 15, "User3",
                "yxcvb", "21129 Hamburg Hohenwischer Str. 19 "));
    }

    @Override
    public List<Client> getAll() {
        return new ArrayList<>(clients.values());
    }

    @Override
    public Client getByLogin(String login) {
        return clients.get(login);
    }

    @Override
    public Client create(Client client) {
        return clients.put(client.getLogin(), client);
    }
}