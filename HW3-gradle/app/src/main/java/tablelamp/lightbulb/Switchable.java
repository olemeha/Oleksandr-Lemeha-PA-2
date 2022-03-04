package tablelamp.lightbulb;

//Switchable Interface will help implement Inversion of Dependency. 
public interface Switchable {
	
	// Function to switch on
	public void switchOn();
	
	// Function to Switch off
	public void switchOff();	
}