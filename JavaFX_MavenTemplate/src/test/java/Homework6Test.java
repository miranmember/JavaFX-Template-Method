import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class Homework6Test {
	static GamingComputer gamingComputer;
	static OfficeComputer officeComputer;

	@BeforeAll
	static void Setup(){
		gamingComputer = new GamingComputer();
		officeComputer = new OfficeComputer();
	}

	@Test
	void GamingComputerTest1(){
		String[] gpu = gamingComputer.GPU;
		String CustomerGPU = gamingComputer.addGPU();
		for (int i = 0; i < gpu.length; i++) {
			if (CustomerGPU.equals("GPU:"+gpu[i])) {
				return;
			}
		}
		fail();
	}

	@Test
	void GamingComputerTest2(){
		assertEquals(false,gamingComputer.customerWantsOpticalDrive());
		assertEquals(false, gamingComputer.customerWantsSoundCard());
	}

	@Test
	void GamingComputerTest3(){
		assertEquals("",gamingComputer.addSoundCard());
		assertEquals("", gamingComputer.addOpticalDrive());
	}

	@Test
	void GamingComputerTest4(){
		assertEquals(true,gamingComputer.customerWantsGPU());
		assertEquals(true, gamingComputer.customerWantsCPU());
		assertEquals(true,gamingComputer.customerWantsMotherBoard());
		assertEquals(true, gamingComputer.customerWantsPSU());
	}

	@Test
	void GamingComputerTest5(){
		String[] cpu = gamingComputer.CPU;
		String CustomerGPU = gamingComputer.addCPU();
		for (int i = 0; i < cpu.length; i++) {
			if (CustomerGPU.equals("CPU:"+cpu[i])) {
				return;
			}
		}
		fail();
	}

	@Test
	void GamingComputerTest6(){
		String[] cpu = officeComputer.CPU;
		String CustomerGPU = officeComputer.addCPU();
		for (int i = 0; i < cpu.length; i++) {
			if (CustomerGPU.equals("CPU:"+cpu[i])) {
				return;
			}
		}
		fail();
	}

	@Test
	void GamingComputerTest7(){
		assertEquals(false,officeComputer.customerWantsGPU());
	}

	@Test
	void GamingComputerTest8(){
		assertEquals("",officeComputer.addGPU());
	}

	@Test
	void GamingComputerTest9(){
		assertEquals(true, officeComputer.customerWantsCPU());
		assertEquals(true,officeComputer.customerWantsMotherBoard());
		assertEquals(true, officeComputer.customerWantsPSU());
		assertEquals(true, officeComputer.customerWantsSoundCard());
		assertEquals(true, officeComputer.customerWantsOpticalDrive());
	}

	@Test
	void GamingComputerTest10(){
		String[] SoundCard = officeComputer.SoundCard;
		String CustomerSoundCard = officeComputer.addSoundCard();
		for (int i = 0; i < SoundCard.length; i++) {
			if (CustomerSoundCard.equals("SoundCard:"+SoundCard[i])) {
				return;
			}
		}
		fail();
	}

}
