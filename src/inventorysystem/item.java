package inventorysystem;

public class item implements reviewer{
	private static int count=0;
	private int itemCode;
	private String title;
	private int price;
	private int stock;
	private int score;

	public item(String title, int price, int stock) {
		this.title = title;
		this.price = price;
		this.stock = stock;
		count ++;
		this.itemCode = count;
	}

	public void printInfo() {
		System.out.println("Item Code: " + itemCode);
		System.out.println("Title: " + title);
		System.out.println("Price: " + price);
		System.out.println("Tax: " + getTax());
		System.out.println("Stock: " + stock);
		System.out.println("Total: " + getTotal());
	}

	public int getTotal() {return price * stock; }
	public void setPrice(int price) { this.price = price; }
	public void setPrice(double price) {this.price = (int) price; }
	public String getTitle() { return title; }
	public int getPrice() { return price; }
	public int getStock() { return stock; }
	public int getTax() { return price * setting.TAX_RATE / 100; }
	public static int getCount() { return count; }
	public int getitemCode() { return itemCode; }
	public void setScore(int score) {this.score =score; }
	public int getScore() { return score; }
	public void printScore() {
		System.out.println("Score: " + reviewer.STAR_MARK.repeat(score));
	}

}




