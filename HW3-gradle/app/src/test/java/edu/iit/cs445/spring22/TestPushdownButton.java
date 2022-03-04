package edu.iit.cs445.spring22;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestPushdownButton {

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
	void testSwitchOff() {
		Lightbulb bulbInstance = new Lightbulb();
		PushdownButton instance = new PushdownButton(bulbInstance);

		final String testString1 = "PushdownButton is PUSHED" + System.lineSeparator() + "Lightbulb on"
				+ System.lineSeparator();
		final String testString2 = "PushdownButton is PUSHED" + System.lineSeparator() + "Lightbulb off"
				+ System.lineSeparator();

		instance.PushButton();
		assertEquals(byteOutputStream.toString(), testString1);

		instance.PushButton();
		assertEquals(byteOutputStream.toString(), testString1 + testString2);

	}

	// Release the stdOut stream
	@AfterEach
	public void releaseStream() {
		System.setOut(out);
	}

}
