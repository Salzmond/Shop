package org.telran.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.telran.shop.model.Client;
import org.telran.shop.service.ClientService;

import java.util.List;

@RestController
@RequestMapping("clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<Client> getAll() {
        return clientService.getAll();
    }

    @GetMapping("/{login}")
    public Client getByLogin(@PathVariable(name = "login") String login) {
        return clientService.getByLogin(login);
    }

    @PostMapping
    public Client create(@RequestBody Client client) {
        return clientService.create(client);
    }
}