package Exercise_1;

public class Exercise_1_Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//assigning of values to attributes
		System.out.println("Assigning values to attributes");
		Car var_Car = new Car();
		var_Car.var_color = "Purple";
		var_Car.var_model = "Land Rover";
		var_Car.var_year = "1990";
		
		//call method
		var_Car.mtd_displayCarInfo();
	
		//call parameterized constructor
		System.out.println("Parameterized constructor");		
		Car var_Car2 = new Car("Red", "Range Rover", "2009");
		var_Car2.mtd_displayCarInfo();
		
		//No-Args Constructor
		System.out.println("No-Args Constructor");
		Car var_Car3 = new Car();
		var_Car3.mtd_displayCarInfo();
	}

}
