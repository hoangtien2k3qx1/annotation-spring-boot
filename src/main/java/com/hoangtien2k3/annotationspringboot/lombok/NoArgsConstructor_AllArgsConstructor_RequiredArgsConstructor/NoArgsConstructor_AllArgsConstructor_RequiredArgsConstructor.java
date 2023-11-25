package com.hoangtien2k3.annotationspringboot.lombok.NoArgsConstructor_AllArgsConstructor_RequiredArgsConstructor;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

// lombok

/**
 * @author: hoangtien2k3
 * @create: 25/11/2023 - 11:25
 * @project: NoArgsConstructor_AllArgsConstructor_RequiredArgsConstructor.java
 * @description: @AllArgsConstructor @NoArgsConstructor @RequiredArgsConstructor
 * @update: 25/11/2023
 */
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class NoArgsConstructor_AllArgsConstructor_RequiredArgsConstructor {
    private int id;
    private String name;
    private String surname;
    private String birthPlace;
}


// Java POJO
//public class Author {
//    private int id;
//    private String name;
//    private String surname;
//    private String birthPlace;
//
//    // @NoArgsConstructor
//    public Author() {}
//
//    // @AllArgsConstructor
//    public Author(int id, String name, String surname, String birthPlace) {
//        this.id = id
//        this.name = name
//        this.surname = surname
//        this.birthPlace = birthPlace
//    }
//
//    // @RequiredArgsConstructor
//    public Author(String birthPlace) {
//        this.birthPlace = birthPlace
//    }
//}