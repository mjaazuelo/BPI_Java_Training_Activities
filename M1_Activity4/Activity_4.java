package Activity_4;
import java.util.Scanner;

public class Activity_4 {

public static void main(String[] args) {
        
    Scanner npt_age = new Scanner(System.in);
      
        System.out.println("Enter your Age: ");
        int age = npt_age.nextInt();
        
        String output_str = "";
        
        if (age < 18) {
        	output_str = "Minor";
        } else if (age >=18 && age <=59) {
        	output_str = "Adult";
        } else if (age >= 60) {
        	output_str = "Senior Citizen";
        }      
       
        npt_age.close();
        
    System.out.println(output_str);
}
}
