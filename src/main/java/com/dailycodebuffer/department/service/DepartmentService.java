package com.dailycodebuffer.department.service;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    public Department saveDepartment(Department dept) {
        log.info("Inside saveDepartment method of DepartmentService");
        return departmentRepository.save(dept);
    }

    public Department findDepartmentById(long id) {
        log.info("Inside saveDepartment method of DepartmentService");
        return departmentRepository.findByDepartmentId(id);
    }
}
