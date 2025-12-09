package M2_Activity6;

public abstract class Vehicle {

	public abstract void startEngine();
	
	public void destroy() {
		System.out.println("VEHICLE: Output destroy() from " +this.getClass().getSimpleName() );
	}//end of public void destroy() 
	
}//end of public abstract class Vehicle 
