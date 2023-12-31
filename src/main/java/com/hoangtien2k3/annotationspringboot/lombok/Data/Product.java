package com.hoangtien2k3.annotationspringboot.lombok.Data;

import lombok.Data;

/**
 * @author: hoangtien2k3
 * @create: 25/11/2023 - 11:23
 * @project: Product.java
 * @description: @Data
 * @update: 25/11/2023
 */
@Data
public class Product {
    public String name;
    public int price;
}

//public class Author {
//    private final int id;
//    private String name;
//    private String surname;
//
//    public Author(int id) {
//        this.id = id;
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
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
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

class test {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Hoang Anh Tien");
        product.setPrice(12345);
    }
}
