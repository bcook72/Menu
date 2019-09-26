package menu;

// implements menu cafe

public class CafeMenu implements Menu {
	static final int MAX_ITEMS = 3;
	int numberOfItems = 0;
	MenuContent[] menuContents;
  
	public CafeMenu() {
		menuContents = new MenuContent[MAX_ITEMS];
		
		addItem("Club Sandy",
			"Regular Club with Fries",
			true, 8.20);
		addItem("Soup of the day",
			"A cup of the soup of the day, with a side salad",
			false, 5.88);
		addItem("Taco",
			"Taco with refried beans",
			true, 5.50);
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
  
	public Iterator createIterator() {
		return new CafeMenuIterator(menuContents);
		}
}
