package org.telran.library.service;

import org.telran.library.model.Book;

import java.util.List;

public interface BookService {

    List<Book> getAll();

    Book findOne(long isbn);

    Book borrowFromLibrary(long isbn);

    boolean returnToLibrary(Book book);
}