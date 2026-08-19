package inventorysystem;

public class cinema extends item{

	private String director;
	private String starring;
	private int runTime;
	
	public cinema (String title,  String director, int price, int stock, String starring, int runTime) {
		super(title, price, stock);
		this.director = director;
		this.starring = starring;
		this.runTime = runTime;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Director: " + director);
		System.out.println("Starring: " + starring);
		System.out.println("RunTime: " + (runTime/60) + " hours "+ (runTime % 60) + " minutes ");

	}
	
	public void printScore() {
		System.out.println("Score: " + reviewer.STAR_MARK.repeat(getScore()));
	}
	
}
