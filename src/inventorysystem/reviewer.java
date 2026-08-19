package inventorysystem;

public interface reviewer {
	String STAR_MARK = "★";
	
	void setScore(int score);
	int getScore();
	void printScore();
}
