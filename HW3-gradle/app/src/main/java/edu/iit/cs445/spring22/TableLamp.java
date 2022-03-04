/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.iit.cs445.spring22;

import tablelamp.button.*;
import tablelamp.lightbulb.*;

public class TableLamp {

	public static void main(String[] args) {
		
		// Lightbulb as per Part 2 - Inversion of Dependency
		Switchable bulb = new Lightbulb();
		
		// Create button and inject switchable object
		Button button = new Button(bulb);
		
		// Put it on and off
		button.switchOn();
		System.out.println();
		button.switchOff();
		System.out.println();
		
		
		// Part 3 - PushdownButton
		Switchable bulb2 = new Lightbulb();
		PushdownButton pushDownButton = new PushdownButton(bulb2); 
		
		pushDownButton.PushButton();
		System.out.println();
		pushDownButton.PushButton();
	}
}