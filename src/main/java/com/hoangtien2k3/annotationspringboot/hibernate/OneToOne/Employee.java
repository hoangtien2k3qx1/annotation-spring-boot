package com.hoangtien2k3.annotationspringboot.hibernate.OneToOne;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author: hoangtien2k3
 * @create: 26/11/2023 - 11:55
 * @file: Employee.java
 * @update: 26/11/2023
 * @description:
 */
@Entity
@Table(name = "employee")
public class Employee implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;


    /**
     * @Annotation: @OneToOne: CascadeType.MERGE: thực hiện một thao tác merge (ghép)
     * trên Employee, nó cũng sẽ được áp dụng cho EmployeeDetail.
     * @Annotation: @PrimaryKeyJoinColumn: khoá chính của Employee cũng là khoá chính của EmployeeDetail (sử dụng khi liên kết có chung khoá chính)
     */
    @OneToOne(cascade = CascadeType.MERGE)
    @PrimaryKeyJoinColumn
    private EmployeeDetail employeeDetail;
}

