package Activity_3;
import java.util.Scanner;
public class Activity_3 {

public static void main(String[] args) {
        
        Scanner npt_num = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int num1 = npt_num.nextInt();
        
        System.out.print("Enter second integer: ");
        int num2 = npt_num.nextInt();
        
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        
        
        npt_num.close();
    } 

}
