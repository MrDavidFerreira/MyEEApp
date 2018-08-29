package com.jdfg.myeeapp.model;

import org.omnifaces.persistence.model.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "book_details")
public class BookDetails extends BaseEntity<Long> {

    @Id
    private Long id;

    @MapsId
    @OneToOne
    private Book book;

    @NotNull
    @Column(name = "number_of_pages")
    private int numberOfPages;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long bookId) {
        this.id = bookId;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
