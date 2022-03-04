package edu.iit.cs445.spring22;

public class Button {
	
	private Switchable switchable;
	
	/**
	 * Constructor to take switchable object as dependency Injection
	 * 
	 * @param swithable
	 */
	public Button(Switchable switchable) {
		this.switchable = switchable;		
	}

	/**
	 * Function Switch on the button
	 */
	public void switchOn() {
		System.out.println("Button switched to ON");		
		this.switchable.switchOn();
	}
	
	/**
	 * Function to switch off the Button. 
	 */
	public void switchOff() {
		System.out.println("Button switched to OFF");
		this.switchable.switchOff();
	}	
}