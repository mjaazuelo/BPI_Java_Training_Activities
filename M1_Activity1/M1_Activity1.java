package Activity_1;

import java.util.Scanner;
/**
 * 
 */
public class Activity_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?");
		
		String npt_name = sc.next();
		System.out.println("Hello " + npt_name);
		
		sc.close();
	}

}