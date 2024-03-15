
public class MySong {
	
	private String title;
	private int rating;
	
	public MySong() {
		title = title;
		rating = rating;
	}//end constructor
	
	public MySong(String title, int rating) {
		this.title = title;
		this.rating = rating;
	}//end two argument constructor
	
	public String getRating() {
		return String.valueOf(rating);
	}//end getter
	
	public String toString() {
		String output;
		output = "Song name: " + title + "\tRating: " + rating + "\n";
		return output;
	}//end to String
	
}//end class
