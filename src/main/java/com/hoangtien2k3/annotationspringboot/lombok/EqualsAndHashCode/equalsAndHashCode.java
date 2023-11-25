package com.hoangtien2k3.annotationspringboot.lombok.EqualsAndHashCode;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: hoangtien2k3
 * @create: 25/11/2023 - 11:24
 * @project: equalsAndHashCode.java
 * @description: @EqualsAndHashCode
 * @update: 25/11/2023
 */
@Getter
@Setter
@EqualsAndHashCode
public class equalsAndHashCode {
    private int id;
    private String name;
    private String surname;
}


//public class Author {
//
//    // gettes and setters ...
//
//    @Override
//    public int hashCode() {
//        final int PRIME = 31;
//        int result = 1;
//        result = prime * result + id;
//        result = prime * result + ((name == null) ? 0 : name.hashCode());
//        result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
