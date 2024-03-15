
public class Jukebox {

MySong[][] songList = new MySong[3][4];
	
	public Jukebox() {
		songList[0][0] = new MySong( "Numb", 5 );
		songList[0][1] = new MySong( "Some Girl", 4 );
		songList[0][2] = new MySong( "Middle Of Somewhere", 5 );
		songList[0][3] = new MySong( "No Suprises", 3 );
		songList[1][0] = new MySong( "Me and The Birds", 3 );
		songList[1][1] = new MySong( "Entombed", 5 );
		songList[1][2] = new MySong( "Gold Dust", 2 );
		songList[1][3] = new MySong( "Advice", 4 );
		songList[2][0] = new MySong( "Sea, Swallow Me", 3 );
		songList[2][1] = new MySong( "When The Sun Hits", 5 );
		songList[2][2] = new MySong( "No Ordinary Love", 5 );
		songList[2][3] = new MySong( "Laputa", 4 );
	}//end constructor

	public String randomSong() {
		int randr = (int) (Math.random()*songList.length);
		int randc = (int) (Math.random()*songList[0].length);
			return songList[randr][randc].toString();
	}//end randomSong method
	
	public String playSongOfRating(int rating) {
		String output = "";
			for(int row = 0; row < songList.length; row++) {
				for(int col = 0; col < songList[0].length; col++) {
					if(songList[row][col].getRating() == String.valueOf(rating)) {
						output += songList[row][col].toString() + "\t";
					}//end if
				}//end for
			}//end for
			return output;
	}//end method
	
	public String toString() {
		String output = "";
			for(int row = 0; row < songList.length; row++) {
				for(int col = 0; col < songList[0].length; col++) {
					output += (songList[row][col]);
				}//end for
			}//end for
	return output;
	}//end toString
}//end class

