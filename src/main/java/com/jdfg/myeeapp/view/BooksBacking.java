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


    public void newBook() {

        BookDetails d = new BookDetails();
        d.setId(126L);
        d.setNumberOfPages(75);
        //d.setBook(b);

//        b.setDetails(d); throws javax.persistence.EntityExistsException: A different object with the same identifier value was already associated with the session
        bookDetailsService.createBookDetails(d);
    }
}
