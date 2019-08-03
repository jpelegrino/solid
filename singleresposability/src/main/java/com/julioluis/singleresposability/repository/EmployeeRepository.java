package com.julioluis.singleresposability.repository;

import com.julioluis.singleresposability.model.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRepository {

    private String dataSource;

    public EmployeeRepository() {
        dataSource="";
    }

    public void saveEmployee(Employee employee) {
        dataSource="save: ";
        dataSource+= employee.toString();
        System.out.println(dataSource);
    }


    public void deleteEmployee(Employee employee) {
        dataSource="delete: ";
        dataSource+= employee.toString();
        System.out.println(dataSource);
    }
}
