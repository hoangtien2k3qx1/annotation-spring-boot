package com.hoangtien2k3.annotationspringboot.hibernate.OneToOne;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author: hoangtien2k3
 * @create: 26/11/2023 - 13:25
 * @file: EmployeeDetail.java
 * @update: 26/11/2023
 * @description: 
 */
@Entity
@Table(name = "employeeDetail")
public class EmployeeDetail implements Serializable {

    @Id
    @Column(name = "id")
    private int id;
}