package org.telran.library.repository;

import org.springframework.stereotype.Repository;
import org.telran.library.model.Reader;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ReaderRepositoryImpl implements ReaderRepository {

    private Map<String, Reader> readerStorage = new HashMap<>();

    @PostConstruct
    public void init() {
        readerStorage.put("User1", new Reader("Mark", "Antonov", "User1", "qwerty", 25));
        readerStorage.put("User2", new Reader("Alex", "Svengard", "User2", "asdfg", 29));
        readerStorage.put("User3", new Reader("Sven", "Oxter", "User3", "yxcvb", 15));
    }

    @Override
    public List<Reader> getAll() {
        return new ArrayList<>(readerStorage.values());
    }

    @Override
    public Reader getByLogin(String login) {
        return readerStorage.get(login);
    }

    @Override
    public Reader create(Reader reader) {
        return readerStorage.put(reader.getLogin(), reader);
    }
}