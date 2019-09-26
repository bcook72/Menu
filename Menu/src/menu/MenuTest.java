package menu;

//test our menu items

//import java.util.*;

public class MenuTest {
	
	public static void main(String args[]) {
       
		SmokeHouseMenu smokeHouseMenu = new SmokeHouseMenu();
        ItalianMenu italianMenu = new ItalianMenu();
        CafeMenu cafeMenu = new CafeMenu();
 
		Waitress waitress = new Waitress(smokeHouseMenu, italianMenu, cafeMenu);
 
		// Without iterators
		//printMenu()
		
		// With iterators
		waitress.printMenu();	
	}
	/*
	public static void printMenu() {
		SmokeHouseMenu smokeHouseMenu = new SmokeHouseMenu();
		ItalianMenu italianMenu = new ItalianMenu();

		ArrayList<MenuContent> breakfastItems = smokeHouseMenu.getMenuItems();
		MenuContent[] lunchItems = italianMenu.getMenuItems();

		// Hiding implementation
		System.out.println("USING FOR EACH");
		for (MenuContent menuContent : breakfastItems) {
			System.out.print(menuContent.getName());
			System.out.println("\t\t" + menuContent.getPrice());
			System.out.println("\t" + menuContent.getDescription());
		}
		for (MenuContent menuContent : lunchItems) {
			System.out.print(menuContent.getName());
			System.out.println("\t\t" + menuContent.getPrice());
			System.out.println("\t" + menuContent.getDescription());
		}
 
		// Exposing implementation
		System.out.println("USING FOR LOOPS");
		for (int i = 0; i < breakfastItems.size(); i++) {
			MenuContent menuContent = (MenuContent)breakfastItems.get(i);
			System.out.print(menuContent.getName());
			System.out.println("\t\t" + menuContent.getPrice());
			System.out.println("\t" + menuContent.getDescription());
		}

		for (int i = 0; i < lunchItems.length; i++) {
			MenuContent menuContent = lunchItems[i];
			System.out.print(menuContent.getName());
			System.out.println("\t\t" + menuContent.getPrice());
			System.out.println("\t" + menuContent.getDescription());
		}
	}
	*/
}

