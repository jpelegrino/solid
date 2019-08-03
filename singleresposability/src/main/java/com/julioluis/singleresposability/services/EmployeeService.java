package com.julioluis.singleresposability.services;

import com.julioluis.singleresposability.FormatType;
import com.julioluis.singleresposability.formatter.EmployeeReportFormatter;
import com.julioluis.singleresposability.model.Employee;
import com.julioluis.singleresposability.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeReportFormatter employeeReportFormatter;

    public void hireEmployee(Employee employee) {
        employeeRepository.saveEmployee(employee);
    }

    public void terminateEmployee(Employee employee) {
        employeeRepository.deleteEmployee(employee);
    }

    public void printEmployeeReport(Employee employee, FormatType formatType) {
        employeeReportFormatter.setEmployee(employee);
        employeeReportFormatter.setFormatType(formatType);

        employeeReportFormatter.getFormatEmployee();

    }
}
