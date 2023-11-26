package com.hoangtien2k3.annotationspringboot.hibernate.OneToMany;

import lombok.Data;
import java.util.List;
import javax.persistence.*;

/**
 * @author: hoangtien2k3
 * @create: 26/11/2023 - 14:04
 * @file: Author.java
 * @update: 26/11/2023
 * @description: 
 */
@Data
@Entity
@Table(name = "authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Mối quan hệ OneToMany với entity ở phía "Many" (Ví dụ: Book)
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Book> books;

}
