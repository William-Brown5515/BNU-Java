// Import relevant libraries
import java.util.ArrayList;
import java.util.Scanner;

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
    
    public void createSong() {
        // Create instance of Scanner class 
        Scanner options = new Scanner(System.in);
        // Series of outputs and inputs to retrive information needed to create song
        System.out.print("What is the name of the song to add?     ");
        String songName = options.nextLine();
        System.out.print("Who is/are the artist(s)?     ");
        String songArtists = options.nextLine();
        System.out.print("What is the current play count of the song?     ");
        Integer songPlays = options.nextInt();
        // Create the song and add it to the ArrayList
        songs.add(new Song(songName, songArtists, songPlays));
        options.close();
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

    public void removeSong() {
        this.printSongs();
        Scanner rmSong = new Scanner(System.in);
        // Request an integer for the song the user would like to delete
        System.out.print("Please enter the song number of the song you would like to delete");
        Integer songToRemove = rmSong.nextInt();
        // Uses temporary variable to remove song from songList
        System.out.println(songToRemove);
        Song temp = songs.get(songToRemove);
        songs.remove(temp);
        rmSong.close();
        this.printSongs();
    }

    public void songsAbove() {
        // Request an integer for the minimum amount of plays
        System.out.print("Enter the amount of plays which is the minimum you would like to display.     ");
        Scanner playC= new Scanner(System.in);
        Integer plays = playC.nextInt();
        // Uses for loop to cycle through songs
        for (Integer a = 0; a < (songs.size()); a++) {
            if (songs.get(a).playCount > plays) {
                System.out.print(songs.get(a).songTitle);
                System.out.print("     ");
                System.out.print(songs.get(a).artistName);         
                System.out.print("     ");
                System.out.println(songs.get(a).playCount);
        playC.close();
            }
        }
    }
}
