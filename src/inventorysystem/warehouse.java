package inventorysystem;

public class warehouse {

	private item[] shelf = new item[setting.SHELF_SIZE];
	private int stackIndex;
	
	public void setStock (item item) {
		shelf[stackIndex] = item;
		stackIndex++;
	}
	
	public void printShelf() {
		for (item item:shelf) {
			if (item != null) {
				item.printInfo();
				item.printScore();			}
		}
	}
	
	public item[] getShelf() {
		return shelf;
	}
}
