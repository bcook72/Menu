package menu;

// This sets up the Smoke House Menu

import java.util.ArrayList;

public class SmokeHouseMenu implements Menu {
	ArrayList<MenuContent> menuContents;
	 
		public SmokeHouseMenu() {
			menuContents = new ArrayList<MenuContent>();
	    
			addItem("K&C's Smoke House Special", 
				"Ribs, Corn, and dinner roll", 
				true,
				8.99);
	 
			addItem("Smoke House Lunch", 
				"BBQ Chicken, Red Beans, and Rice", 
				false,
				11.99);
	 
			addItem("Gumbo",
				"Spicy Gumbo with Corn Bread side",
				true,
				6.49);
	 
			addItem("Craw Daddy Special",
				"Craw Dads with Spicy Green Beans and Corn Bread",
				true,
				12.00);
		}

		public void addItem(String name, String description, 
                boolean vegetarian, double price) 
		{
		MenuContent menuContent = new MenuContent(name, description, vegetarian, price);
		menuContents.add(menuContent);
		}
		
		public ArrayList<MenuContent> getMenuItems() {
			return menuContents;
		}
		
		public Iterator createIterator() {
			return new SmokeHouseMenuIterator(menuContents);
		}
		

		public String toString() {
			return "Smoke House Menu";
		}

	}


