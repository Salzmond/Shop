package org.telran.library.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.telran.library.model.Reader;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ReaderServiceImplTest {

    @Autowired
    private ReaderService service;

    @Test
    void getAll() {
        List<Reader> readers = service.getAll();
        assertEquals(3, readers.size());
    }

    @Test
    void getByLogin() {
        Reader user1 = service.getByLogin("User1");
        assertNotNull(user1);
        assertEquals("Mark", user1.getName());
        assertEquals("Antonov", user1.getSurname());
        assertEquals(25, user1.getAge());
    }

    @Test
    void create() {
        Reader reader = service.create(new Reader("Oleg", "Mager", "User5", "qwerty", 17));
        assertEquals(4, service.getAll().size());
    }
}