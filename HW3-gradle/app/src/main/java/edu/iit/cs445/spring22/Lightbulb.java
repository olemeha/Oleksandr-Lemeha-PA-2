package edu.iit.cs445.spring22;

public class Lightbulb implements Switchable {
	
	/**
	 * Put the Bulb on and print to screen the message Lightbulb on
	 */
	public void switchOn () {
		System.out.println("Lightbulb on");
	}
	
	/**
	 * Put the bulb off and print the screen off message. 
	 */
	public void switchOff() {
		System.out.println("Lightbulb off");
	}
}