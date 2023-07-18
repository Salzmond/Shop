package org.telran.library.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.telran.library.model.Author;
import org.telran.library.model.Book;
import org.telran.library.repository.BookRepositoryImpl;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookServiceImplTest {

    private BookService service;

    @BeforeEach
    void init() {
        BookRepositoryImpl bookRepository = new BookRepositoryImpl();
        bookRepository.init();
        service = new BookServiceImpl(bookRepository);
    }

    @Test
    void getAll() {
        assertEquals(3, service.getAll().size());
    }

    @Test
    void findOne() {
        Book book = service.findOne(12345L);
        assertNotNull(book);
        assertEquals("Harry Potter", book.getName());
        assertEquals("Roaling", book.getAuthor().getSurname());
        assertEquals(1995, book.getYear());
    }

    @Test
    void borrowFromLibrary() {
        Book book = service.borrowFromLibrary(12346L);
        List<Book> books = service.getAll();
        assertEquals(2, books.size());
    }

    @Test
    void returnToLibrary() {
        Book book = new Book("Harry Potter", 12345L,
                new Author("J", "Roaling"), 1995);
        boolean returned = service.returnToLibrary(book);
        Book book1 = service.findOne(12345L);
        assertEquals("Harry Potter", book.getName());
        assertEquals("Roaling", book.getAuthor().getSurname());
        assertEquals(1995, book.getYear());
    }
}