package com.hoangtien2k3.annotationspringboot.hibernate.ManyToMany;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: hoangtien2k3
 * @create: 26/11/2023 - 14:04
 * @file: Source.java
 * @update: 26/11/2023
 * @description: 
 */
@Entity
public class Source {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "courses")
    private Set<Student> students = new HashSet<>();

    // getters and setters
}
