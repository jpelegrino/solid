package com.julioluis.ocpremotecontrol;

import com.julioluis.ocpremotecontrol.model.Projector;
import com.julioluis.ocpremotecontrol.model.SoundSystem;
import com.julioluis.ocpremotecontrol.model.TV;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OcpRemotecontrolApplicationTests {

	@Autowired
	private RemoteControl remoteControl;

	@Autowired
	private TV tv;

	@Autowired
	private Projector projector;

	@Autowired
	private SoundSystem soundSystem;

	@Test
	public void testTurnOnTV() {
		remoteControl.connect(tv);
		remoteControl.turnOn();
	}

	@Test
	public void testTurnOffTV() {
		remoteControl.connect(tv);
		remoteControl.turnOff();
	}


	@Test
	public void testTurnOnProjector() {
		remoteControl.connect(projector);
		remoteControl.turnOn();
	}

	@Test
	public void testTurnOffProjector() {
		remoteControl.connect(projector);
		remoteControl.turnOff();
	}

	@Test
	public void testTurnOnSystemSound() {
		remoteControl.connect(soundSystem);
		remoteControl.turnOn();
	}

	@Test
	public void testTurnOffSystemSound() {
		remoteControl.connect(soundSystem);
		remoteControl.turnOff();
	}

}
