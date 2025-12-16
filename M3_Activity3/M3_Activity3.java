package M3_Activity3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class M3_Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner npt_scanner = new Scanner(System.in);
		int var_choice = 0;

		// Map of products with 5 initial records:
		Map<String, Integer> map_products = new HashMap<>();
		map_products.put("Throw Blanket", 1500);
		map_products.put("Handpan", 15000);
		map_products.put("Eye Pillow", 500);
		map_products.put("Neck Pillow", 1300);
		map_products.put("Djembe", 9000);

		// Display the menu repeatedly until user chooses 5. Exit

		while (var_choice != 5) {
			printMenu(); // method to print Menu

			var_choice = npt_scanner.nextInt();
			npt_scanner.nextLine();

			switch (var_choice) {
			case 1: // Search a product
				System.out.print("Enter product name to search: ");
				String productToSearch = npt_scanner.nextLine();

				if (map_products.containsKey(productToSearch)) {
					System.out.println("Product found! Price: " + map_products.get(productToSearch));
				} else {
					System.out.println("Product not found!");
				} // end of if (map_products.containsKey(productToSearch))
				break;

			case 2: // Add a product
				System.out.print("Enter product name to add: ");
				String productToAdd_Name = npt_scanner.nextLine();

				System.out.print("Enter price: ");
				int productToAdd_Price = npt_scanner.nextInt();
				npt_scanner.nextLine();

				map_products.put(productToAdd_Name, productToAdd_Price);
				System.out.println("Product added: " + productToAdd_Name);
				break;

			case 3: // Print all products and count
				System.out.println("\nAll products and prices:");

				for (Map.Entry<String, Integer> entry : map_products.entrySet()) {
					System.out.println(entry.getKey() + " - " + entry.getValue());
				} // end of for (Map.Entry<String, Integer> entry : map_products.entrySet())

				System.out.println("Total products: " + map_products.size());
				break;

			case 4: // Find the cheapest product
				String var_cheapestProduct = null;
				int var_lowestPrice = Integer.MAX_VALUE;

				for (Map.Entry<String, Integer> entry : map_products.entrySet()) {
					if (entry.getValue() < var_lowestPrice) {
						var_lowestPrice = entry.getValue();
						var_cheapestProduct = entry.getKey();
					} // end of if (entry.getValue() < var_lowestPrice)
				} // end of for (Map.Entry<String, Integer> entry : map_products.entrySet())

				if (var_cheapestProduct != null) {
					System.out.println("Cheapest product: " + var_cheapestProduct + " - " + var_lowestPrice);
				} // end of if (var_cheapestProduct != null)
				break;
				
			case 5: // Exit
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid option! Please select 1-4.");

			}// end of switch(var_choice)
		} // end of while (!isExit)

		npt_scanner.close(); // close Scanner

	}// end of public static void main(String[] args)

	private static void printMenu() {
		System.out.println("\n==================\n");
		System.out.println("Select an option:");
		System.out.println("1. Search a product");
		System.out.println("2. Add a product");
		System.out.println("3. Print all products and prices");
		System.out.println("4. Find the cheapest product");
		System.out.println("5. Exit");
		System.out.print("--> ");
	}// end of private void printMenu()

}// end of public class M3_Activity3
