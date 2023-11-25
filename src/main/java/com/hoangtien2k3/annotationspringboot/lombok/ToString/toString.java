package com.hoangtien2k3.annotationspringboot.lombok.ToString;

import lombok.ToString;

/**
 * @author: hoangtien2k3
 * @create: 25/11/2023 - 11:26
 * @project: toString.java
 * @description: @ToString
 * @update: 25/11/2023
 */
@ToString(includeFieldNames = true)
public class toString {
    private int id;
    private String name;
    private String surname;
}

//public class Author {
//    private int id;
//    private String name;
//    private String surname;
//
//    @Override
//    public String toString() {
//        return "Author(id=" + this.id + ", name=" + this.name + ", surnname=" + this.surname + ")";
//    }
//}
