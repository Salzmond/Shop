package org.telran.library.service;

import org.telran.library.model.Reader;

import java.util.List;

public interface ReaderService {

    List<Reader> getAll();

    Reader getByLogin(String login);

    Reader create(Reader reader);
}
