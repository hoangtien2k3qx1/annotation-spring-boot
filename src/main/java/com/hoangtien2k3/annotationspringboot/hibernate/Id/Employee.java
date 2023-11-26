package com.hoangtien2k3.annotationspringboot.hibernate.Id;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.proxy.HibernateProxy;

import javax.persistence.*;
import java.io.Serializable;


//     create table EMPLOYEE (
//        id INT NOT NULL auto_increment,
//        first_name VARCHAR(20) default NULL,
//        last_name  VARCHAR(20) default NULL,
//        salary     INT  default NULL,
//        PRIMARY KEY (id)
//     );

/**
 * @author: hoangtien2k3
 * @create: 25/11/2023 - 14:26
 * @project: Employee.java
 * @description: @Entity
 * @update: 25/11/2023 
 */
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "EMPLOYEE")
public class Employee implements Serializable  {
    @Id @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "salary")
    private int salary;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Employee employee = (Employee) o;
        return false;
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}

