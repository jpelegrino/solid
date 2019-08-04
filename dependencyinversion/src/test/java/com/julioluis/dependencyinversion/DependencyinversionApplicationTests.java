package com.julioluis.dependencyinversion;

import com.julioluis.dependencyinversion.processes.ComputerManufactorProccess;
import com.julioluis.dependencyinversion.processes.GeneralProcessManufactorProccess;
import com.julioluis.dependencyinversion.processes.SmartPhoneManufactorProccess;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DependencyinversionApplicationTests {

	@Autowired
	private SmartPhoneManufactorProccess smartphonceProccess;

	@Autowired
	private ComputerManufactorProccess computerManufactorProccess;



	@Test
	public void testSmartphoneProccessManufactor() {

		smartphonceProccess.lunchProcess();
	}

	@Test
	public void testComputerManufactorProcess() {
		computerManufactorProccess.lunchProcess();
	}

}
