package com.jdfg.myeeapp.model;


import org.omnifaces.persistence.model.GeneratedIdEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import com.jdfg.myeeapp.model.Book;

@Entity
@Table(name = "book_review")
public class BookReview extends GeneratedIdEntity<Long> {

    private String comment;

    @NotNull
    private float stars;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id")
    private Book book;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public float getStars() {
        return stars;
    }

    public void setStars(float stars) {
        this.stars = stars;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookReview)) return false;
        return getId() != null && getId().equals(((BookReview) o).getId());
    }

    @Override
    public int hashCode() {
        return 3;
    }
}
