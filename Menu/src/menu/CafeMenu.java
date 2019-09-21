package menu;

// implements menu cafe

import java.util.*;
import java.util.Iterator;

public class CafeMenu implements Menu {
	
	HashMap<String, MenuContent> menuContents = new HashMap<String, MenuContent>();
  
	public CafeMenu() {
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
		menuContents.put(menuContent.getName(), menuContent);
	}
  
	public Iterator<MenuContent> createIterator() {
		return menuContents.values() .iterator();
		}
}
