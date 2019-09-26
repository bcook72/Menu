package menu;

//iterators through the smoke house menu

import java.util.ArrayList;

public class SmokeHouseMenuIterator implements Iterator{
	ArrayList<MenuContent> items;
	int position = 0;
 
	public SmokeHouseMenuIterator(ArrayList<MenuContent> items) {
		this.items = items;
	}
 
	public MenuContent next() {
		MenuContent item = items.get(position);
		position = position + 1;
		return item;
	}
 
	public boolean hasNext() {
		if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
	}

	/*
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
	*/
}