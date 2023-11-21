package com.hoangtien2k3.annotationspringboot.lombok.Accessors;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true, chain = true)
public class Person {
    public String name;
    public int age;
}

class test {
    public static void main(String[] args) {
        // Sử dụng fluent getter và setter thông thường
        Person person = new Person();
        person.name("John").age(25);

        // Hoặc sử dụng cú pháp setter thông thường
        Person person2 = new Person();
        person2.name("Tiến").age(20);
        System.out.println(person2.name().toUpperCase());

    }
}




