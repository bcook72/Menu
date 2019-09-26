package menu;

public class CafeMenuIterator implements Iterator {
	MenuContent[] items;
	int position = 0;
 
	public CafeMenuIterator(MenuContent[] items) {
		this.items = items;
	}
 
	public MenuContent next() {
		MenuContent menuContent = items[position];
		position = position + 1;
		return menuContent;
	}
 
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}

}
