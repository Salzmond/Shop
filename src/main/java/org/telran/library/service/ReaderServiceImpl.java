package org.telran.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telran.library.model.Reader;
import org.telran.library.repository.ReaderRepository;

import java.util.List;

@Service
public class ReaderServiceImpl implements ReaderService {

    private ReaderRepository readerRepository;

    public ReaderServiceImpl(ReaderRepository readerRepository) {
        this.readerRepository = readerRepository;
    }

    @Override
    public List<Reader> getAll() {
        return readerRepository.getAll();
    }

    @Override
    public Reader getByLogin(String login) {
        return readerRepository.getByLogin(login);
    }

    @Override
    public Reader create(Reader reader) {
        return readerRepository.create(reader);
    }
}