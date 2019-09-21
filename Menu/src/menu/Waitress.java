package menu;

// creates the waitress class

import java.util.Iterator;

public class Waitress {
	Menu SmokeHouseMenu;
	Menu ItalianMenu;
	Menu cafeMenu;
 
	public Waitress(Menu SmokeHouseMenu, Menu ItalianMenu, Menu cafeMenu) {
		this.SmokeHouseMenu = SmokeHouseMenu;
		this.ItalianMenu = ItalianMenu;
		this.cafeMenu = cafeMenu;
	}
 
	public void printMenu() {
		Iterator<MenuContent> smokeHouseIterator = SmokeHouseMenu.createIterator();
		Iterator<MenuContent> italianIterator = ItalianMenu.createIterator();
		Iterator<MenuContent> cafeIterator = cafeMenu.createIterator();

		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(smokeHouseIterator);
		System.out.println("\nLUNCH");
		printMenu(italianIterator);
		System.out.println("\nDINNER");
		printMenu(cafeIterator);
	}
 
	private void printMenu(Iterator<MenuContent> iterator) {
		while (iterator.hasNext()) {
			MenuContent MenuContent = iterator.next();
			System.out.print(MenuContent.getName() + ", ");
			System.out.print(MenuContent.getPrice() + " -- ");
			System.out.println(MenuContent.getDescription());
		}
	}
 
	public void printVegetarianMenu() {
		System.out.println("\nVEGETARIAN MENU\n---------------");
		printVegetarianMenu(SmokeHouseMenu.createIterator());
		printVegetarianMenu(ItalianMenu.createIterator());
		printVegetarianMenu(cafeMenu.createIterator());
	}
 
	public boolean isItemVegetarian(String name) {
		Iterator<MenuContent> smokeHouseIterator = SmokeHouseMenu.createIterator();
		if (isVegetarian(name, smokeHouseIterator)) {
			return true;
		}
		Iterator<MenuContent> italianIterator = ItalianMenu.createIterator();
		if (isVegetarian(name, italianIterator)) {
			return true;
		}
		Iterator<MenuContent> cafeIterator = cafeMenu.createIterator();
		if (isVegetarian(name, cafeIterator)) {
			return true;
		}
		return false;
	}


	private void printVegetarianMenu(Iterator<MenuContent> iterator) {
		while (iterator.hasNext()) {
			MenuContent MenuContent = iterator.next();
			if (MenuContent.isVegetarian()) {
				System.out.print(MenuContent.getName() + ", ");
				System.out.print(MenuContent.getPrice() + " -- ");
				System.out.println(MenuContent.getDescription());
			}
		}
	}

	private boolean isVegetarian(String name, Iterator<MenuContent> iterator) {
		while (iterator.hasNext()) {
			MenuContent MenuContent = iterator.next();
			if (MenuContent.getName().equals(name)) {
				if (MenuContent.isVegetarian()) {
					return true;
				}
			}
		}
		return false;
	}
}