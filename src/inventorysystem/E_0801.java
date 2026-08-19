package inventorysystem;

public class E_0801 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		book book = new book ("Librong James", "LeBron James", 800, 9);
		book.setScore(5);
		
		cinema cinema = new cinema ("Peaky Blinders", "Steven Knight", 400, 13, "Thomas Shelby", 136);
		cinema.setScore(5);
		
		warehouse warehouse = new warehouse();
		warehouse.setStock(book);
		warehouse.setStock(cinema);
		
		warehouse.printShelf();
	}

}
