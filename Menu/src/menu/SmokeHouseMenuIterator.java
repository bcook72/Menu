package menu;

//iterators through the smoke house menu

import java.util.Iterator;

public class SmokeHouseMenuIterator implements Iterator<MenuContent> {
	MenuContent[] list;
	int position = 0;
 
	public SmokeHouseMenuIterator(MenuContent[] list) {
		this.list = list;
	}
 
	public MenuContent next() {
		MenuContent MenuContent = list[position];
		position = position + 1;
		return MenuContent;
	}
 
	public boolean hasNext() {
		if (position >= list.length || list[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException
				("You can't remove an item until you've done at least one next()");
		}
		if (list[position-1] != null) {
			for (int i = position-1; i < (list.length-1); i++) {
				list[i] = list[i+1];
			}
			list[list.length-1] = null;
		}
	}
}