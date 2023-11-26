package com.hoangtien2k3.annotationspringboot.hibernate.NaturalId;

import org.hibernate.annotations.NaturalId;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * @author: hoangtien2k3
     * @create: 26/11/2023 - 11:47
     * @file: Person.java
     * @update: 26/11/2023
     * @description: @NaturalId Hibernate sẽ tối ưu hóa truy vấn dựa trên email.
     * Khi bạn thực hiện truy vấn HQL, câu lệnh SQL có thể được tối ưu hóa thành
     * "SELECT * FROM Person WHERE email = 'hoangtien2k3qx1@gmail.com'" mà không cần phải scan qua toàn bộ bảng.
     */
    @NaturalId
    private String email;

    private String name;
    private int age;

    // Constructors, getters, setters, và các phương thức khác
}
