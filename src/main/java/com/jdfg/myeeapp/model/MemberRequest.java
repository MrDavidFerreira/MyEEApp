package com.jdfg.myeeapp.model;


import org.omnifaces.persistence.model.GeneratedIdEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Entity
@Table(name = "member_request")
public class MemberRequest extends GeneratedIdEntity<Long> {

    @Column(name = "date_requested")
    private Instant dateRequested;

    @NotNull
    @ManyToOne
    @JoinColumn()
    private Book book;

    public Instant getDateRequested() {
        return dateRequested;
    }

    public void setDateRequested(Instant dateRequested) {
        this.dateRequested = dateRequested;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
