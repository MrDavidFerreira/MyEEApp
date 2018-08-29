package com.jdfg.myeeapp.service;

import com.jdfg.myeeapp.model.Book;
import com.jdfg.myeeapp.model.BookDetails;
import org.omnifaces.persistence.service.BaseEntityService;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class BookDetailsService extends BaseEntityService<Long, BookDetails> {

    @Inject
    BookService bookService;

    public void createBookDetails(BookDetails details) {
        Book b = new Book();

        b.setId(details.getId());
        b.setName("Littler2");

        bookService.createBook(b);

        details.setBook(b);


        //super.getEntityManager().persist(details);
        super.persist(details);
    }

    public void updateBookDetails(BookDetails details) {
        super.update(details);
    }

    public void deleteBookDetails(BookDetails details) {
        super.delete(details);
    }

    public BookDetails findBookDetails(Long id) {
        return super.getById(id);
    }
}
