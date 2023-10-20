// Create class of song
public class Song {
    //Initiate attributes of class
    String songTitle;
    String artistName;
    Integer playCount;

    // Constructor to assign attributes
    public Song(String title, String name, Integer count) {
        this.songTitle = title;
        this.artistName = name;
        this.playCount = count;
    }   
}