package com.hoangtien2k3.annotationspringboot.hibernate.ManyToMany;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: hoangtien2k3
 * @create: 26/11/2023 - 13:26
 * @file: Student.java
 * @update: 26/11/2023
 * @description:
 */
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany
    @JoinTable(name = "student_course",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    public Set<Source> courses = new HashSet<>();

    // getters and setters
}