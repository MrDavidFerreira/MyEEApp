package com.jdfg.myeeapp.model;

import org.omnifaces.persistence.model.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "book")
public class Book extends BaseEntity<Long> {

    @Id
    private Long id;

    @NotNull
    private String name;

    @OneToOne(mappedBy = "book", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private BookDetails details;

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
}
