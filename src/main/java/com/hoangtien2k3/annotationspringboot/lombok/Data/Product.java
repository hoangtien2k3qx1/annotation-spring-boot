package com.hoangtien2k3.annotationspringboot.lombok.Data;

import lombok.Data;

@Data
public class Product {
    public String name;
    public int price;
}

class test {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Hoang Anh Tien");
        product.setPrice(12345);
    }
}
