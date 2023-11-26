package com.hoangtien2k3.annotationspringboot.hibernate.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @author: hoangtien2k3
 * @create: 26/11/2023 - 13:26
 * @file: Address.java
 * @update: 26/11/2023
 * @description: 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="address")
public class Address {
    // @id make address_id as a primary key and @GeneratedValue
    // auto increment
    @Id
    @GeneratedValue
    @Column(name="address_id")
    private int addid;

    // This will override and make column length 50 in
    // place of street
    @Getter
    @Column(length=50)
    private String street;

    // This will override and make column name City in
    // place of City
    @Getter
    @Column(name="city")
    private String city;

    private boolean isOpen;

    // This will not create column name x in database
    @Getter
    @Transient
    private double x;

    // This will override and make column name date with specific Date format
    @Getter
    @Temporal(TemporalType.DATE)
    private Date date;

    //Lob to tell hibernate that image’s a large object and is not a simple object
    @Getter
    @Lob
    private byte[] images;

}