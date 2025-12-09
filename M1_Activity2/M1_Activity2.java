package Activity_2;

import java.util.Scanner;

public class Activity_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		
		String usr_age = sc.next();
		Integer int_age = Integer.parseInt(usr_age);
		Double dbl_age = Double.parseDouble(int_age.toString());
		
		System.out.println("Your age as int: " + int_age);
		System.out.println("Your age as double: " + dbl_age);
		
		sc.close();
		
	}

}
