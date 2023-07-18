package org.telran.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.telran.library.model.Reader;
import org.telran.library.service.ReaderService;

import java.util.List;

@RestController
@RequestMapping("readers")
public class ReaderController {

    @Autowired
    private ReaderService readerService;

    @GetMapping
    public List<Reader> getAll() {
        return readerService.getAll();
    }

    @GetMapping("/{login}")
    public Reader getByLogin(@PathVariable(name = "login") String login) {
        return readerService.getByLogin(login);
    }

    @PostMapping("/create")
    public Reader create(@RequestBody Reader reader) {
        return readerService.create(reader);
    }
}