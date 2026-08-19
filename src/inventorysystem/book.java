package inventorysystem;

public class book extends item{

	private String author;
	
	public book(String title, String author, int price, int stock) {
		super(title, price, stock);
		this.author = author;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Author: " + author);
	}
	
	public void printScore() {
		System.out.println("Score: " + reviewer.STAR_MARK.repeat(getScore()));
	}
}
