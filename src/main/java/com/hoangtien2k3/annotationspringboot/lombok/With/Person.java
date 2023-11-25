package com.hoangtien2k3.annotationspringboot.lombok.With;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.With;
import lombok.experimental.Accessors;


/**
 * @author: hoangtien2k3
 * @create: 25/11/2023 - 11:26
 * @project: Person.java
 * @description: @With @Accessors
 * @update: 25/11/2023
 */
@AllArgsConstructor
@Accessors(fluent = true)
@Data
@With
public class Person {
    private String name;
    private int age;
}

class test {

    public static void toString(Person person) {
        System.out.println(person.name());
        System.out.println(person.age());
    }

    public static void main(String[] args) {
        Person person1 = new Person("John", 25);

        // Sử dụng phương thức withName để tạo ra một bản sao với tên mới
        Person person2 = person1.withName("hoangtien2k3");

        // Sử dụng phương thức withAge để tạo ra một bản sao với tuổi mới
        Person person3 = person1.withAge(30);

        toString(person1);
        toString(person2);
        toString(person3);

    }
}