// Import relevant libraries
import java.util.ArrayList;

public class SongList {
    // Create an ArrayList of songs
    ArrayList<Song> songs = new ArrayList<Song>();

    public static void main(String[] args) {
    }

    // Create a series of songs to begin the songList
    public SongList() {
        songs.add(new Song("Blinding Lights", "The Weeknd",385100000));
        songs.add(new Song("Shape of you", "Ed Sheeran", 365900000));
        songs.add(new Song("Someone you Loved", "Lewis Capaldi", 301900000));
        songs.add(new Song("Sunflower", "Post Malone & Swae Lee", 296400000));
        songs.add(new Song("Dance Monkey", "Tones and I", 292000000));
        songs.add(new Song("One Dance", "Drake, Wizkid & Kyla", 282300000));
        songs.add(new Song("Stay", "The Kid Laroi & Justin Bieber", 279400000));
        songs.add(new Song("Rockstar", "Post Malone & 21 Savage", 279300000));
        songs.add(new Song("Starboy", "The Weeknd & Daft Punk", 275100000));
        songs.add(new Song("As it was", "Harry Styles" , 274700000));
    }
    
    public void createSong(String songName, String songArtists, Integer songPlays) {
        // Create the song and add it to the ArrayList
        songs.add(new Song(songName, songArtists, songPlays));
        System.out.print("The added song's name is ");
        System.out.print(songName);
        System.out.print(", the song's artist(s) is/are ");
        System.out.print(songArtists);
        System.out.print(", and the current play count of the song is ");
        System.out.println(songPlays);
    }
    
    public void printSongs() {
        // Uses for loop to cycle through items in ArrayList
        for (int i = 0; i < (songs.size()); i++) {
            // Outputs all aspects of each song
            System.out.print(songs.get(i).songTitle);
            System.out.print("     ");
            System.out.print(songs.get(i).artistName);         
            System.out.print("     ");
            System.out.print(songs.get(i).playCount);
            System.out.print("     Song number...  ");
            System.out.println(i);
        }
    }

    public void removeSong(Integer songToRemove) {
        // Uses temporary variable to remove song from songList
        Song temp = songs.get(songToRemove - 1);
        songs.remove(temp);

        // Outputs the song that has been removed for the user's input
        System.out.print("The song you have removed is ");
        System.out.println(songs.get(songToRemove - 1).songTitle);
    }

    public void songsAbove(Integer plays) {
        Integer numberSongs = 0;
        // Uses for loop to cycle through songs
        for (Integer a = 0; a < (songs.size()); a++) {
            // Checks if play count of the song is above minimum that user entered
            if (songs.get(a).playCount > plays) {
                // Output all attributes for songs that meet requirements
                System.out.print(songs.get(a).songTitle);
                System.out.print("     ");
                System.out.print(songs.get(a).artistName);         
                System.out.print("     ");
                System.out.println(songs.get(a).playCount);
                numberSongs += 1;
            }
        }
        // Checks if there are no songs above the play count, if so displays a message
        if (numberSongs == 0) {
            System.out.print("I'm afraid there are no songs with a play count of over ");
            System.out.println(plays);
        }
    }
}