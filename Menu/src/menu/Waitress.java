package menu;

// creates the waitress class

public class Waitress {
	 SmokeHouseMenu smokeHouseMenu;
	 ItalianMenu italianMenu;
	 CafeMenu cafeMenu;
 
	public Waitress(SmokeHouseMenu smokeHouseMenu, ItalianMenu italianMenu, CafeMenu cafeMenu) {
		this.smokeHouseMenu = smokeHouseMenu;
		this.italianMenu = italianMenu;
		this.cafeMenu = cafeMenu;
	}
 
	public void printMenu() {
		Iterator smokeHouseIterator = smokeHouseMenu.createIterator();
		Iterator italianMenuIterator = italianMenu.createIterator();
		Iterator cafeMenuIterator = cafeMenu.createIterator();

		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(smokeHouseIterator);
		System.out.println("\nLUNCH");
		printMenu(italianMenuIterator);
		System.out.println("\nDINNER");
		printMenu(cafeMenuIterator);
	}
 
	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuContent MenuContent = iterator.next();
			System.out.print(MenuContent.getName() + ", ");
			System.out.print(MenuContent.getPrice() + " -- ");
			System.out.println(MenuContent.getDescription());
		}
	}
 
	public void printVegetarianMenu() {
		System.out.println("\nVEGETARIAN MENU\n---------------");
		printVegetarianMenu(smokeHouseMenu.createIterator());
		printVegetarianMenu(italianMenu.createIterator());
		printVegetarianMenu(cafeMenu.createIterator());
	}
 
	public boolean isItemVegetarian(String name) {
		Iterator smokeHouseIterator = smokeHouseMenu.createIterator();
		if (isVegetarian(name, smokeHouseIterator)) {
			return true;
		}
		Iterator italianMenuIterator = italianMenu.createIterator();
		if (isVegetarian(name, italianMenuIterator)) {
			return true;
		}
		Iterator cafeMenuIterator = cafeMenu.createIterator();
		if (isVegetarian(name, cafeMenuIterator)) {
			return true;
		}
		return false;
	}


	private void printVegetarianMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuContent MenuContent = iterator.next();
			if (MenuContent.isVegetarian()) {
				System.out.print(MenuContent.getName() + ", ");
				System.out.print(MenuContent.getPrice() + " -- ");
				System.out.println(MenuContent.getDescription());
			}
		}
	}

	private boolean isVegetarian(String name, Iterator iterator) {
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