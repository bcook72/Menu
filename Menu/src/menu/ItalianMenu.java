package menu;

//This sets up the Italian House Menu

public class ItalianMenu implements Menu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuContent[] menuContents;
	
  
	public ItalianMenu() {
		menuContents = new MenuContent[MAX_ITEMS];
		
		addItem("Spaghetti Nights",
			"Spaghetti with Garlic Bread", true, 7.49);
		addItem("Italian Sub",
			"Wheat Roll with Italian Lunch Meat and Veggies", false, 9.99);
		addItem("Minestrone Soup",
			"Soup of the day, with a side of garlic bread", false, 5.29);
		addItem("Lasagna",
			"Lasagna with bread sticks and salad",
			false, 10.05);
		addItem("Salad",
			"Salad with Ceasar", true, 3.99);
		addItem("Pizza",
			"Pizza with salad",
			true, 8.89);
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
  
	public Iterator createIterator() {
		return new ItalianMenuIterator(menuContents);
		}
 
}
