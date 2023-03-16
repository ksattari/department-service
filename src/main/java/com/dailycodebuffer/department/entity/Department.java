package com.dailycodebuffer.department.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import net.bytebuddy.dynamic.loading.InjectionClassLoader;
//import org.hibernate.annotations.Generated;
//import org.hibernate.annotations.GeneratorType;
//import org.springframework.boot.autoconfigure.web.WebProperties;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
