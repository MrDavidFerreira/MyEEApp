package com.jdfg.myeeapp.service;

import com.jdfg.myeeapp.model.Book;
import org.omnifaces.persistence.service.BaseEntityService;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class BookService extends BaseEntityService<Long, Book> {

    public void createBook(Book book) {
        super.getEntityManager().persist(book);
    }

    public void updateBook(Book book) {
        super.update(book);
    }

    public void deleteBook(Book book) {
        super.delete(book);
    }

    public Book findBook(Long id) {
        return super.getById(id);
    }

    public List<Book> findAllBooks() {
        return super.getAll();
    }
}
