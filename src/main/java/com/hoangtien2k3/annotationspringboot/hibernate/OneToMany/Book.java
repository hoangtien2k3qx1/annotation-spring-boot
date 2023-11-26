package com.hoangtien2k3.annotationspringboot.hibernate.OneToMany;

import lombok.Data;

import javax.persistence.*;

/**
 * @author: hoangtien2k3
 * @create: 26/11/2023 - 14:04
 * @file: Book.java
 * @update: 26/11/2023
 * @description:
 */
@Data
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    /**
     * @Annotation: @ManyToOne: Mối quan hệ ManyToOne với entity ở phía "One" (Ví dụ: Author)
     * @Annotation: @JoinColumn: đánh dấu khoá ngoại liên kết với bảng "Author"
     */
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

}