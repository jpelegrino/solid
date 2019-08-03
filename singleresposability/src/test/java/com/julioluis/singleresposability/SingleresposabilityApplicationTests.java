package com.julioluis.singleresposability;

import com.julioluis.singleresposability.model.Employee;
import com.julioluis.singleresposability.services.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SingleresposabilityApplicationTests {

	@Autowired
	private EmployeeService employeeService;

	@Test
	public void testHireEmployee() {
		Employee employee=new Employee();
		employee.setId(1l);
		employee.setDepartment("HR");
		employee.setWorking(Boolean.TRUE);
		employee.setName("Peter");

		employeeService.hireEmployee(employee);
	}


	@Test
	public void testTerminateEmployee() {
		Employee employee=new Employee();
		employee.setId(1l);
		employee.setDepartment("HR");
		employee.setWorking(Boolean.TRUE);
		employee.setName("Peter");

		employeeService.terminateEmployee(employee);
	}

	@Test
	public void testPrintEmployeeReport() {
		Employee employee=new Employee();
		employee.setId(1l);
		employee.setDepartment("HR");
		employee.setWorking(Boolean.TRUE);
		employee.setName("Peter");

		employeeService.printEmployeeReport(employee,FormatType.XML);
	}

}
