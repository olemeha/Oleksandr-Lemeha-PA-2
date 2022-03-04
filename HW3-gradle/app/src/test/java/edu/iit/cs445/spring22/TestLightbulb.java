package edu.iit.cs445.spring22;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.*;
import tablelamp.lightbulb.Lightbulb;

class TestLightbulb {

	// To Capture the stdout screen outputs
	private final PrintStream out = System.out;
	private ByteArrayOutputStream byteOutputStream;

	// Setup the streams
	@BeforeEach
	public void setupStream() {
		byteOutputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(byteOutputStream));
	}

	@Test
	void testSwitchOn() {
		Lightbulb instance = new Lightbulb();
		final String testString1 = "Lightbulb on" + System.lineSeparator();
		instance.switchOn();
		assertEquals(byteOutputStream.toString(), testString1);
	}

	@Test
	void testSwitchOff() {
		Lightbulb instance = new Lightbulb();
		final String testString1 = "Lightbulb on" + System.lineSeparator();
		final String testString2 = "Lightbulb on" + System.lineSeparator() + "Lightbulb off";
		instance.switchOn();
		assertEquals(byteOutputStream.toString(), testString1);
		instance.switchOff();
		assertEquals(byteOutputStream.toString().trim(), testString2);
	}

	// Release the stdout stream
	@AfterEach
	public void releaseStream() {
		System.setOut(out);
	}
}