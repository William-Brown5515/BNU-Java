// Import relevant libraries
import java.util.Scanner;
public class Main {
    // Create main method
    public static void main(String[] Args) {
        // Create instance of SongList class
        SongList listOfSongs = new SongList();
        // Creates instance of Scanner class to enable inputs
        Scanner options = new Scanner(System.in); 
        // Inititialise variable for user to choose options
        int songOption = 0;    
        // Create while loop 
        do {
            // Series of outputs to give options to the user
            System.out.println("Please read the following options and enter the number.");
            System.out.println("Press 0 to add a song.");
            System.out.println("Press 1 to remove a song.");
            System.out.println("Press 2 to print a list of all the songs.");
            System.out.println("Press 3 to print a list of songs over a certain amount of plays.");
            System.out.println("Enter any other number to exit.");
            System.out.print("Which option would you like to pick?     ");
            // Ask for input to see what option they would like to pick
            songOption = options.nextInt();
            // Series of if loops to complete methods as requested by user
            if (songOption == 0) {
                // Series of outputs and inputs to retrive information needed to create song
                System.out.print("What is the name of the song to add?     ");
                System.out.print("this line works!");
                String songName = options.nextLine();
                System.out.print("So does this one!");
                System.out.print("Who is/are the artist(s)?     ");
                String songArtists = options.nextLine();
                System.out.print("What is the current play count of the song?     ");
                Integer songPlays = options.nextInt();
                listOfSongs.createSong(songName, songArtists, songPlays);
            }
            else if (songOption == 1) {
                listOfSongs.printSongs();
                // Request an integer for the song the user would like to delete
                System.out.print("Please enter the song number of the song you would like to delete");
                Integer songToRemove = options.nextInt();
                listOfSongs.removeSong(songToRemove);

            }
            else if (songOption == 2) {
                listOfSongs.printSongs();
            }
            else if (songOption == 3) {
                // Request an integer for the minimum amount of plays
                System.out.print("Enter the amount of plays which is the minimum you would like to display.     ");
                Integer plays = options.nextInt();
                listOfSongs.songsAbove(plays);               
            }
            // If input doesn't match any of the above, end while loop
            else {
                break;
            }
        }
        while(true);
    // Closing scanner object to avoid annoying error message
        options.close();
    }   
}