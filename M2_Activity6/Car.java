package M2_Activity6;

public class Car extends Vehicle implements Refuelable {

	public Car (int parm_numberOfWheels, String parm_brand) {
		this.numberOfWheels = parm_numberOfWheels;
		this.brand = parm_brand;
	}//public Car (int parm_numberOfWheels, String parm_brand)
	
	@Override
	public void startEngine() {
		System.out.println("CAR: Output startEngine() inherited from Vehicle. " );
	}//public void startEngine() -- inherited from Vehicle
	
	@Override
	public void refuel() {
		System.out.println("CAR: Output refuel() inherited from Refuelable. " );
	}//public void refuel()
	
}//end of public class Car extends Vehicle implements Refuelable
