package M2_Activity6;

public class Car extends Vehicle implements Refuelable {

	@Override
	public void startEngine() {
		System.out.println("CAR: Output startEngine() inherited from Vehicle. " );
	}//public void startEngine() -- inherited from Vehicle
	
	@Override
	public void refuel() {
		System.out.println("CAR: Output refuel() inherited from Refuelable. " );
	}//public void refuel()
	
}//end of public class Car extends Vehicle implements Refuelable
