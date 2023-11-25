package com.hoangtien2k3.annotationspringboot.lombok.Value;

// @Value is the `immutable` variant(bất biến) of `@Data`
// @Value : tương đương với class `record`

import lombok.Value;

/**
 * @author: hoangtien2k3
 * @create: 25/11/2023 - 11:26
 * @project: value.java
 * @description: @Value
 * @update: 25/11/2023
 */
@Value
public class value {
    int id;
    String name;
    String surname;
}


//public final class Author {
//    private final int id;
//    private final String name;
//    private final String surname;
//
//    public Author(int id, String name, String surname) {
//        this.id = id
//        this.name = name
//        this.surname = surname
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    @Override
//    public int hashCode() {
//        final int PRIME = 31;
//        int result = 1;
//        result = prime * result + getId();
//        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
//        result = prime * result + ((getSurname() == null) ? 0 : getSurname().hashCode());
//        return result;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == this) return true;
//        if (!(o instanceof Author)) return false;
//        Author other = (Author) o;
//        if (!other.canEqual((Object)this)) return false;
//        if (this.getId() == null ? other.getId() != null : !this.getId().equals(other.getId())) return false;
//        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
//        if (this.getSurname() == null ? other.getSurname() != null : !this.getSurname().equals(other.getSurname())) return false;
//        return true;
//    }
//}
