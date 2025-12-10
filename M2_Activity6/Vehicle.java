package M2_Activity6;

public abstract class Vehicle {

	protected int numberOfWheels;
	protected String brand;
	
	public abstract void startEngine();
	
	public void destroy() {
		System.out.println("VEHICLE: Output destroy() from " +this.getClass().getSimpleName() + " > " + this.numberOfWheels +" wheel " + this.brand);
	}//end of public void destroy() 
	
}//end of public abstract class Vehicle 
