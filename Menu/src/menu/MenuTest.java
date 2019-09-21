package menu;

//test our menu items

public class MenuTest {

	public static void main(String args[]) {
		SmokeHouseMenu smokeHouseMenu = new SmokeHouseMenu();
		ItalianMenu italianMenu = new ItalianMenu();
		CafeMenu cafeMenu = new CafeMenu();

		Waitress waitress = new Waitress (smokeHouseMenu, italianMenu, cafeMenu);
		
		waitress.printMenu();
	}
}
