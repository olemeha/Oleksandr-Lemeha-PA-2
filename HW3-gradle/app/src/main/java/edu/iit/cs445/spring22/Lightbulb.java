package edu.iit.cs445.spring22;

public class Lightbulb implements Switchable {
	
	public void switchOn () {
		System.out.println("Lightbulb on");
	}

	public void switchOff() {
		System.out.println("Lightbulb off");
	}
}