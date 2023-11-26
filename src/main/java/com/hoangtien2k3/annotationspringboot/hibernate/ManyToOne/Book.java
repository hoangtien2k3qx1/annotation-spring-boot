package com.hoangtien2k3.annotationspringboot.hibernate.ManyToOne;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    // getters and setters
}