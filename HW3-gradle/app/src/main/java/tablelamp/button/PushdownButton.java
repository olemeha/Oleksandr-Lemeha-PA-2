package tablelamp.button;

import tablelamp.lightbulb.*;

public class PushdownButton {
	
	private boolean pushed;
	private Switchable switchable;

	/**
	 * Constructor takes the dependency injection. 
	 */
	public PushdownButton(Switchable switchable) {
		this.switchable = switchable;
		// initially it is not pushed
		this.pushed = false; 
	}
	
	/**
	 * Function to push this button. The internals of this message will be based
	 * on the state of this button. 
	 * 
	 * If the state is "Pushed" the button will be toggled to off
	 * If the state is "Not Pushed" then button will be toggled to on. 
	 * 
	 */
	public void PushButton() {
		
		// toggle push
		this.pushed = !pushed; 
		
		System.out.println("PushdownButton is PUSHED");
		
		// Send appropriate message to the switchable object
		if(pushed) {
			this.switchable.switchOn();
		} else {
			this.switchable.switchOff();
		}
	}
}