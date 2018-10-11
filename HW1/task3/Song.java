package task3;

// This class stores data about a song.

public class Song {

    private String title;  
    private String artist;  

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
    
    public String toString() {
        return title + " by " + artist + "\n";
    }
}
