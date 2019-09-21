package menu;

//implements Italian menu

import java.util.HashMap;
import java.util.Iterator;

//This sets up the Italian House Menu

public class ItalianMenu implements Menu {

	HashMap<String, MenuContent> menuContents = new HashMap<String, MenuContent>();
  
	public ItalianMenu() {
 
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
	menuContents.put(menuContent.getName(), menuContent);
	}
 

  
	public Iterator<MenuContent> createIterator() {
		return menuContents.values() .iterator();
		}
 
}
