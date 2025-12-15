package M3_Activity1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M3_Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List of products with 5 records:
		List<String> lst_products = new ArrayList();
		lst_products.add("Laptop");
		lst_products.add("Mouse");
		lst_products.add("Keyboard");
		lst_products.add("Monitor");
		lst_products.add("Printer");		
		
		//========================
		//Print all products:
        System.out.println("LIST OF ALL PRODUCTS:");
		for (String var_product : lst_products) {
			System.out.println(var_product);
		}//end of for (String var_product : products)
		System.out.println("\n=====================\n");
		
		//========================
		//Add new product and remove one product:
		lst_products.add("Webcam");
		lst_products.remove("Mouse");
		
		//Print updated list of products:
        System.out.println("LIST OF ALL(UPDATED) PRODUCTS:");
		for (String var_product : lst_products) {
			System.out.println(var_product);
		}//end of for (String var_product : products)
		System.out.println("\n=====================\n");
		
		//========================
		//Find a product name:
		System.out.print("Enter product name to search: ");
		Scanner npt_scanner = new Scanner(System.in);
		String var_fndProduct = npt_scanner.nextLine();
		
		if (lst_products.contains(var_fndProduct)){
			System.out.println("Product found: " + var_fndProduct);
		} else {
			System.out.println("Product not found: " + var_fndProduct);
		}//end of if (lst_products.contains(var_fndProduct))

		npt_scanner.close();
		
	}//end of public static void main(String[] args)

}//end of public class M3_Activity1
