package menu;

// This sets up the Smoke House Menu

import java.util.Iterator;

public class SmokeHouseMenu implements Menu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuContent[] menuContents;
	 
		public SmokeHouseMenu() {
			menuContents = new MenuContent[MAX_ITEMS];
	    
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
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			menuContents[numberOfItems] = menuContent;
			numberOfItems = numberOfItems + 1;
		}
		}
		
		public MenuContent[] getMenuItems() {
		return menuContents;
		}
		
		public Iterator<MenuContent> createIterator() {
		return new SmokeHouseMenuIterator(menuContents);
		}

	}


