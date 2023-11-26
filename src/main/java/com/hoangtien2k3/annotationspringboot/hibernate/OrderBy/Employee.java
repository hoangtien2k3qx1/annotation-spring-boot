package com.hoangtien2k3.annotationspringboot.hibernate.OrderBy;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author: hoangtien2k3
 * @create: 26/11/2023 - 13:23
 * @file: Employee.java
 * @update: 26/11/2023
 * @description:
 */
@Entity
@Table(name = "employee")
public class Employee implements Serializable {

//    @OneToMany(mappedBy = "employee", fetch = FetchType.EAGER)
//    @OrderBy("firstName asc")
//    private Set communications;
}