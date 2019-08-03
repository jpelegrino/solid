package com.julioluis.singleresposability.formatter;

import com.julioluis.singleresposability.FormatType;
import com.julioluis.singleresposability.model.Employee;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class EmployeeReportFormatter extends ReportFormatter {

    private Employee employee;
    private FormatType formatType;

    public void getFormatEmployee() {
        if(Objects.isNull(this.employee)) {
            System.out.println("This employee need to be populate");
            return;
        }

        if(Objects.isNull(this.formatType)) {
            System.out.println("This Format Type need to be populate");
            return;
        }

        switch (this.formatType){
            case CVS:
                System.out.println(this.convertObjectToCVS(employee));
                break;
            case XML:
                System.out.println(this.convertObjectToXML(employee));
                break;
                default:
                    System.out.println("Bad format");
        }

    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public FormatType getFormatType() {
        return formatType;
    }

    public void setFormatType(FormatType formatType) {
        this.formatType = formatType;
    }
}
