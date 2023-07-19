package org.telran.shop.service;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.telran.shop.model.Client;
import org.telran.shop.repository.ClientRepositoryImpl;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ClientServiceImplTest {

    private ClientService clientService;

    @BeforeEach
    void init() {
        ClientRepositoryImpl clientRepository = new ClientRepositoryImpl();
        clientRepository.init();
        clientService = new ClientServiceImpl(clientRepository);
    }

    @Test
    void getAll() {
        assertEquals(3, clientService.getAll().size());
    }

    @Test
    void getByLogin() {
        Client client = clientService.getByLogin("User3");
        assertNotNull(client);
        assertEquals(15, client.getAge());
        assertEquals("Sven", client.getFirstName());
        assertEquals("Oxter", client.getLastName());
    }

    @Test
    void create() {
        Client client = clientService.create(new Client("Alex", "Morozov", 85, "User4",
                "AMorozov", "603081 NN Uspenskogo 2b"));
        assertEquals(4, clientService.getAll().size());
    }
}