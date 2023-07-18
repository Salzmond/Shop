package org.telran.library.repository;

import org.telran.library.model.Reader;

import java.util.List;

public interface ReaderRepository {

    List<Reader> getAll();

    Reader getByLogin(String login);

    Reader create(Reader reader);
}