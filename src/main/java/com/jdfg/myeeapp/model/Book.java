package com.jdfg.myeeapp.model;

import org.omnifaces.persistence.model.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "book")
@NamedQuery(name = "Book.findAllMemberRequests", query = "SELECT mr FROM MemberRequest mr WHERE mr.book.id = :bookId")
public class Book extends BaseEntity<Long> {

    @Id
    private Long id;

    @NotNull
    private String name;

    @OneToOne(mappedBy = "book")
    private BookDetails details;

    @OneToMany(
            mappedBy = "book",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<BookReview> reviews = new ArrayList<>();

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BookDetails getDetails() {
        return details;
    }

    public void setDetails(BookDetails details) {
        this.details = details;
    }

    public void addReview(BookReview review) {
        reviews.add(review);
        review.setBook(this);
    }

    public void removeReview(BookReview review) {
        reviews.remove(review);
        review.setBook(null);
    }
}
