package edu.iit.cs445.spring22;

public class Button {
	
	private Switchable switchable;
	/**
	 * Constructor to take switchable object as dependency Injection
	 */
	public Button(Switchable switchable) {
		this.switchable = switchable;		
	}

	public void switchOn() {
		System.out.println("Button switched to ON");		
		this.switchable.switchOn();
	}

	public void switchOff() {
		System.out.println("Button switched to OFF");
		this.switchable.switchOff();
	}	
}