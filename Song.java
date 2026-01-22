/**
 * File for a Song class to be used in the Playlist Project
 * @author Jad and Edge
 * @version 1
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private String title;
    private String artist;
    private int durationSeconds; 
    private boolean liked; 
    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    
public Song(String title, String artist, int minutes, int seconds) {
        this.title = title;
        this.artist = artist;
        this.durationSeconds = minutes * 60 + seconds;
        this.liked = false; 
    }

public String getTitle() {
        return title;
    }
public String getArtist() {
        return artist;
    }
public int getDurationSeconds() {
        return durationSeconds;
    }
public boolean isLiked() {
        return liked;
    }
    
public void like() {
        liked = true;
    }

public void unlike() {
        liked = false;
    }

public String getDurationString() {
        int minutes = durationSeconds / 60;
        int seconds = durationSeconds % 60;
        return String.format("%d:%02d", minutes, seconds);
    }
    
public String toString() {
        String result = "\"" + title + "\" by " + artist + " (" + getDurationString() + ")";
        if (liked) {
            result += " -- liked";
        }
        return result;
    }
}

}
