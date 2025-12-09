package Exercise_1;

public class Car {
	//Car Attributes
	public String var_color;
	public String var_model;
	public String var_year; 
	
	//Method: Display Car Info
	public void mtd_displayCarInfo() {
        System.out.println("====== Car Info =====");
        System.out.println("Color: " + var_color);
        System.out.println("Model: " + var_model);
        System.out.println("Year: " + var_year);
        System.out.println("===========\n");
	}//end of mtd_displayCarInfo() method
	
    // Parameterized Constructor
    public Car(String parm_color, String parm_model, String parm_year) {
        var_color = parm_color;
        var_model = parm_model;
        var_year = parm_year;
    }//end of Parameterized Constructor

    // No-Args Constructor
    public Car() {
        var_color = "Unknown";
        var_model = "Unknown";
        var_year = "Unknown";
    }//end of No-Args Constructor


}//end of public class Car 
