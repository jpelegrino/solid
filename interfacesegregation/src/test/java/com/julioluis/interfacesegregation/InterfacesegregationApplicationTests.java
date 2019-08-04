package com.julioluis.interfacesegregation;

import com.julioluis.interfacesegregation.model.Product;
import com.julioluis.interfacesegregation.services.AccountProccess;
import com.julioluis.interfacesegregation.services.CustomerTransaction;
import com.julioluis.interfacesegregation.services.ReportProccess;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InterfacesegregationApplicationTests {

	@Autowired
	private AccountProccess accountProccess;
	@Autowired
	private ReportProccess reportProccess;

	@Test
	public void testExecuteAccountTransaction() {
		accountProccess.executeTransaction();
	}


	@Test
	public void testReportingProccess() {
		reportProccess.printReport();
	}
}
