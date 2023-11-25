package com.hoangtien2k3.annotationspringboot.lombok.NonNull;

import lombok.NonNull;

/**
 * @author: hoangtien2k3
 * @create: 25/11/2023 - 11:25
 * @project: nonNull.java
 * @description: @NonNull
 * @update: 25/11/2023
 */
public class nonNull {
    private int id;
    private String name;
    private String surname;

    public nonNull(@NonNull int id,
                   @NonNull String name,
                   String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
}

//public class Author {
//    private int id;
//    private String name;
//    private String surname;
//
//    public Author(
//            int id,
//            String name,
//            String surname) {
//        if (id == null) {
//            throw new NullPointerException("id is marked @NonNull but is null");
//        }
//        this.id = id;
//        if (name == null) {
//            throw new NullPointerException("name is marked @NonNull but is null");
//        }
//        this.name = name;
//        this.surname = surname;
//    }
//}
