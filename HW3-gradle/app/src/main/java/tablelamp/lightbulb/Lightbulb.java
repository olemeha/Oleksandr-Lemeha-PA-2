package tablelamp.lightbulb;

public class Lightbulb implements Switchable {
	
	public void switchOn () {
		System.out.println("Lightbulb on");
	}

	public void switchOff() {
		System.out.println("Lightbulb off");
	}
}