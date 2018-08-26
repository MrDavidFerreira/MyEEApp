package com.jdfg.myeeapp.service;

import com.jdfg.myeeapp.model.BookDetails;
import org.omnifaces.persistence.service.BaseEntityService;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class BookDetailsService extends BaseEntityService<Long, BookDetails> {

    public void createBookDetails(BookDetails details) {
        super.getEntityManager().persist(details);
//        super.persist(details);
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
