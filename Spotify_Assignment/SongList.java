// Import relevant libraries
import java.util.ArrayList;

public class SongList {
    // Create an ArrayList of songs
    ArrayList<Song> songs = new ArrayList<Song>();

    // Create a series of songs to begin the songList
    public SongList() {
        songs.add(new Song("I Think We're Alone Now", "Tiffany",216413459));
        songs.add(new Song("Combine Harvester", "The Wurzels", 1870196));
        songs.add(new Song("One For The Bristol City", "The Wurzels", 135336));
        songs.add(new Song("Eternal Love", "JLS", 6689466));
        songs.add(new Song("Gangnam Style", "PSY", 440139762));
        songs.add(new Song("Magic", "Olympic Ayres", 20416299));
        songs.add(new Song("Freed From Desire", "Gala Rizzatto", 409211614));
        songs.add(new Song("Dreaming", "Smallpools", 103639173));
        songs.add(new Song("Seven Nation Army", "The White Stripes", 1490794402));
        songs.add(new Song("Dancing in the Moonlight", "Toploader" , 781869863));
    }
    
    public void createSong(String songName, String songArtists, Integer songPlays) {
        // Create the song and add it to the ArrayList
        songs.add(new Song(songName, songArtists, songPlays));
        System.out.print(Main.colour_green + "The added song's name is ");
        System.out.print(songName);
        System.out.print(", the song's artist(s) is/are ");
        System.out.print(songArtists);
        System.out.print(", and the current play count of the song is ");
        System.out.println(songPlays + ".");
        System.out.println(Main.colour_reset);
    }
    
    public void printSongs() {
        // Uses for loop to cycle through items in ArrayList
        if (songs.size() != 0) {
            System.out.println(Main.colour_green);
            for (int i = 0; i < (songs.size()); i++) {
                // Outputs all aspects of each song
                System.out.print(songs.get(i).songTitle);
                System.out.print("     ");
                System.out.print(songs.get(i).artistName);         
                System.out.print("     ");
                System.out.print(songs.get(i).playCount);
                System.out.print("     Song number...  ");
                System.out.println(i + 1);
            }
            System.out.println(Main.colour_reset);
        }

        else {
            System.out.println(Main.colour_red + "\nUnfortunately, there are currently no songs.\n" + Main.colour_reset);
        }
    }

    public void removeSong(Integer songToRemove) {
        // Outputs the song that has been removed for the user's input
        System.out.print(Main.colour_yellow+ "The song you have removed is " + Main.colour_red);
        System.out.println(songs.get(songToRemove - 1).songTitle);
        System.out.println(Main.colour_reset);

        // Uses temporary variable to remove song from songList
        Song temp = songs.get(songToRemove - 1);
        songs.remove(temp);

    }

    public void songsAbove(Integer plays) {
        Integer numberSongs = 0;
        // Uses for loop to cycle through songs
        System.out.println(Main.colour_green);
        for (Integer a = 0; a < (songs.size()); a++) {
            // Checks if play count of the song is above minimum that user entered
            if (songs.get(a).playCount > plays) {
                // Output all attributes for songs that meet requirements
                System.out.print(songs.get(a).songTitle);
                System.out.print("     ");
                System.out.print(songs.get(a).artistName);         
                System.out.print("     ");
                System.out.println(songs.get(a).playCount);
                numberSongs ++;
            }
        }

        // Checks if there are no songs above the play count, if so displays a message
        if (numberSongs == 0) {
            System.out.print(Main.colour_red + "I'm afraid there are no songs with a play count of over ");
            System.out.println(plays + Main.colour_reset);
        }

        System.out.println(Main.colour_reset);
    }
}