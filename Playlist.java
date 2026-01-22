import java.util.ArrayList;

public class Playlist {

    private ArrayList<Song> songs;


    public Playlist() {
        songs = new ArrayList<Song>();
    }


    public void addSong(Song s) {
        songs.add(s);
        System.out.println("Added " + s.toString());
    }


    public void likeSong(int position) {
        int loc = position - 1; 
        if (loc >= 0 && loc < songs.size()) {
            songs.get(loc).like();
        } else {
            System.out.println("Cannot like ts song: position " + position + " out of range. Lock in.");
        }
    }

    public void removeSong(int position) {
        int loc = position - 1;
        if (loc >= 0 && loc < songs.size()) {
            songs.remove(loc);
        } else {
            System.out.println("Cannot remove ts song: position " + position + " out of range. Lock in.");
        }
    }

    public void printSongs() {
        for (int i = 0; i < songs.size(); i++) {
            Song s = songs.get(i);
            System.out.println(s.toString());
        }
    }

    public void printLikedSongs() {
        for (int i = 0; i < songs.size(); i++) {
            Song s = songs.get(i);
            if (s.isLiked()) {
                System.out.println(s.toString());
            }
        }
    }

    public String getTotalDurationString() {
        int totalSeconds = 0;
        for (int i = 0; i < songs.size(); i++) {
            totalSeconds = totalSeconds + songs.get(i).getDurationSeconds();
        }

        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        if (seconds < 10) {
            return minutes + ":0" + seconds;
        } else {
            return minutes + ":" + seconds;
        } //this took a while to figure out
    }

    
    public void removeUnlikedSongs() {
        for (int i = songs.size() - 1; i >= 0; i--) {
            if (!songs.get(i).isLiked()) {
                songs.remove(i); //this also took so long
            }
        }
    }

}
