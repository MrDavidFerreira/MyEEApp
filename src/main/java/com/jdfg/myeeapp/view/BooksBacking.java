package com.jdfg.myeeapp.view;

import com.jdfg.myeeapp.model.Book;
import com.jdfg.myeeapp.model.BookDetails;
import com.jdfg.myeeapp.service.BookDetailsService;
import com.jdfg.myeeapp.service.BookService;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class BooksBacking implements Serializable {

    @Inject
    BookDetailsService bookDetailsService;

    @Inject
    BookService bookService;

    public void newBook() {
        Book b = new Book();
        b.setId(123L);
        b.setName("Bible");

        bookService.createBook(b);

        BookDetails d = new BookDetails();
        d.setNumberOfPages(999);
        d.setBook(b);

        bookDetailsService.createBookDetails(d);
    }
}
