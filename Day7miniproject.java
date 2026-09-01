package TheoryClass;

import java.util.Scanner;

public class Project {
	static Scanner input = new Scanner(System.in);
	
	public static void greet() {
		System.out.println("---------------  Welcome  To ---------------");
		System.out.println("--------------  Crema & Crust  ---------------\n");
	}

	public static void menu() {
		String foodList[] = {
				"Appetizers & Starters 🥟",
				"Soups & Salads 🥗",
				"Main Courses & Entrées 🍽️",
				"Fast Food & Burgers 🍔",
				"Pizza & Italian 🍕",
				"Asian & Noodles 🍜",
				"Mexican & Tacos 🌮",
				"Seafood & Fish 🦐",
				"Desserts & Sweets 🍰",
				"Drinks & Beverages 🍹"};

		for(int i=0;i<foodList.length;i++) {
			System.out.println((i+1)+") "+foodList[i]);
		}
		
		System.out.println("\n Enter the Menu Choice (1-10 / 0 for Exit)");
		int choice = input.nextInt();
		if(choice==0) {
			System.out.println("-----  Thank You For Coming! Visit Again!  -----");
			System.exit(0);
		}
		else {
			choiceList(choice);
			input.nextLine();
		}
	}
	
	public static void choiceList(int ch) {
		switch (ch) {
		case 1: {
			Appetizers();
			break;
		}
		case 2: {
			soupsAndSalads();
			break;
		}
		default:
			System.out.println("Invalid Choice");
			System.out.println("Type 'goto' For Menu / Type 'exit' For Exit");
			input.nextLine();
			String choice = input.nextLine();
			if(choice.equalsIgnoreCase("goto")) {
				menu();
			}
			else if(choice.equalsIgnoreCase("exit")) {
				System.out.println("-----  Thank You For Coming! Visit Again!  -----");
				System.exit(0);
			}
			else {
				System.out.println("Invalid Choice ! Thank You ....");
				System.exit(0);
			}
		}
	}
	
	public static void Appetizers() {
		System.out.println("Appetizers & Starters 🥟");
		String foodMenu[]= {
			    "🥟 Dumplings          - 190", 
			    "🥟 Samosa             - 120", 
			    "🍢 Kebab              - 250", 
			    "🍤 Prawn Tempura      - 280", 
			    "🥗 Bruschetta         - 180", 
			    "🧆 Falafel            - 150", 
			    "🧀 Mozzarella Sticks  - 210", 
			    "🥣 Spring Rolls       - 160", 
			    "🍗 Chicken Wings      - 240", 
			    "🥑 Guacamole          - 220"
			};
		int foodPrice[] = {190,120,250,280,180,150,210,160,240,220};
		for(int i=0;i<10;i++) {
			System.out.println((i+1)+") "+foodMenu[i]);
		}
		System.out.println("\nEnter the Menu Choice (1-10 / 0 for Exit)");
		int choice = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter the Quantity (In numbers): ");
		int Quantity = input.nextInt();
		input.nextLine();
		
		System.out.println("Did You Want Mayonnaise (Enter 'yes' or 'no') :");
		String Id01 = input.nextLine();
		
		System.out.println("Did You Want Ketchup (Enter 'yes' or 'no') :");
		String Id02 = input.nextLine();
		System.out.println();
		bill(choice,foodMenu,foodPrice,Quantity,Id01,Id02);
	}

	public static void soupsAndSalads() {
		System.out.println("Soups & Salads 🥗");
	}
	public static void bill(int choice, String[] foodMenu, int[] foodPrice, int quantity, String id01, String id02) {
		System.out.println("--------------  Crema & Crust  ---------------\n");
		System.out.println("Your Ordered Food : "+foodMenu[choice-1]);
		System.out.println("Food Quantity     : "+quantity);
		int total = quantity*foodPrice[choice-1];
		System.out.println("Food Price        : "+total);
		int addon = 0;
		if(id01.equalsIgnoreCase("yes")) {
			System.out.println("Add-on(Mayonnaise): "+50);
			addon+=50;
		}
		else {
			System.out.println("Add-on(Mayonnaise): "+0);
		}
		if(id02.equalsIgnoreCase("yes")) {
			System.out.println("Add-on(Ketchup)   : "+30);
			addon+=30;
		}
		else {
			System.out.println("Add-on(Ketchup)   : "+0);
		}
		System.out.println("-------------    Amount To Pay    ------------");
		System.out.println("Total Amount          : "+(total+addon));
		System.out.println("----  Thank You For Coming! Visit Again!  ----\n");
		menu();
	}
	
	public static void main(String[] args) {
		greet();
		menu();
	}
}
