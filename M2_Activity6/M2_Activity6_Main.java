package M2_Activity6;

public class M2_Activity6_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CAR 
		Car var_car = new Car();
		var_car.startEngine();
		var_car.refuel();
		
		//Method from MAIN
		destroyVehicle(var_car);
		//*****************************/
		
		System.out.println("\n===================\n"); //just a separator for the output
		
		//TRUCK 
		Truck var_truck = new Truck();
		var_truck.startEngine();
		var_truck.refuel();
		
		//Method from MAIN
		destroyVehicle(var_truck);
		//*****************************/
		
	}//end of public static void main(String[] args) 
	
	public static void destroyVehicle(Vehicle parm_vehicle) {
		parm_vehicle.destroy();
	}//public static void destroyVehicle()
	
}//end of public class M2_Activity6_Main
