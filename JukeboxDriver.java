
public class JukeboxDriver {
	public static void main(String[] args){
		Jukebox o = new Jukebox();
		System.out.println(o);
		System.out.println("Random song: " + o.randomSong());
		System.out.println("Songs of rating 1: " + o.playSongOfRating(1));
	}//end main
}//end class