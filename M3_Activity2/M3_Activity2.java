
package M3_Activity2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class M3_Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner npt_scanner = new Scanner (System.in);
		
		//List of products with 5 records using HashSet:
		Set<String> hash_products = new HashSet<>();
		hash_products.add("Laptop");
		hash_products.add("Mouse");
		hash_products.add("Keyboard");
		hash_products.add("Monitor");
		hash_products.add("Printer");
		
		//Display menu repeatedly until user choose to exit
		boolean isExit = false;
		
		while (!isExit) {
			printMenu(); //method to print Menu
			
			int var_choice = npt_scanner.nextInt();
			npt_scanner.nextLine();
			
			switch(var_choice) {
            case 1:
                //Search a product
                System.out.print("\nEnter product name to search: ");
                String srchProduct = npt_scanner.nextLine();
                
                if (hash_products.contains(srchProduct)) {
                    System.out.println("Product found: " + srchProduct);
                } else {
                    System.out.println("Product not found!");
                }//end of  if (hash_products.contains(srchProduct))
                break;

            case 2:
                //Add a product
                System.out.print("\nEnter product name to add: ");
                String newProduct = npt_scanner.nextLine();
                
                if (hash_products.add(newProduct)) { //if product already exists; returns false
                    System.out.println("Product added: " + newProduct);
                } else {
                    System.out.println("Product already exists: " + newProduct);
                }//end of if (hash_products.add(newProduct))
                break;

            case 3:
                //Print all products and count
                System.out.println("\nAll products:");
                for (String var_product : hash_products) {
                    System.out.println(var_product);
                }
                System.out.println("Total products: " + hash_products.size());
                break;

            case 4:
                //Exit
                System.out.println("Exiting ...");
                isExit = true;
                break;

            default:
                System.out.println("Invalid option! Please select 1-4.");
                
			}//end of switch(var_choice) 
		}//end of while (!isExit) 
		
		npt_scanner.close();
		
	}//end of public static void main(String[] args)

	private static void printMenu() {
		System.out.println("\n==================\n");
	    System.out.println("Select an option:");
	    System.out.println("1. Search a product");
	    System.out.println("2. Add a product");
	    System.out.println("3. Print all products and count");
	    System.out.println("4. Exit");
	    System.out.print("--> ");
	}//end of private void printMenu()
	
}//end of public class M3_Activity2 
