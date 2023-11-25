package com.hoangtien2k3.annotationspringboot.lombok.GetterAndSetter;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: hoangtien2k3
 * @create: 25/11/2023 - 11:24
 * @project: GetterAndSetter.java
 * @description: @Getter and Setter
 * @update: 25/11/2023
 */
@Getter
@Setter
public class GetterAndSetter {
    private int id;
    private String name;
    @Setter(AccessLevel.PROTECTED)
    private String surname;
}


//public class User {
//    private int id;
//    private String name;
//    private String surname;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    protected void setSurname(String surname) {
//        this.surname = surname;
//    }
//}
