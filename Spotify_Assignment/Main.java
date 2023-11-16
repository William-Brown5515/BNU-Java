// Import relevant libraries
import java.util.InputMismatchException;
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
        Boolean end = false;

        // Create do while loop
        do {
            // Series of outputs to give options to the user
            System.out.println("Please read the following options and enter the number.");
            System.out.println("Press 0 to add a song.");
            System.out.println("Press 1 to remove a song.");
            System.out.println("Press 2 to print a list of all the songs.");
            System.out.println("Press 3 to print a list of songs over a certain amount of plays.");
            System.out.println("Press 4 to exit.");
            System.out.print("Which option would you like to pick?     ");
            // Ask for input to see what option they would like to pick
            Boolean error;
            // Use a do/while loop and a try/catch functions to ensure an integer is entered
            do {
                try {
                    error = false;
                    songOption = options.nextInt();
                    if (songOption <= 0) {
                        throw new IndexOutOfBoundsException();
                    }
                    else if (songOption > 5) {
                        throw new IndexOutOfBoundsException();
                    }
                } catch (InputMismatchException e) {
                    System.out.print("Error, please enter an integer   ");
                    error = true;
                    options.next();
                } catch (IndexOutOfBoundsException f) {
                    error = true;
                    System.out.print("Error, please enter an integer between 0 and 4     ");
                }
            } while (error != false);
            // Series of if loops to complete methods as requested by user
            // switch (songOption) {
            //     case 0:
            if (songOption == 0) {
                // Series of outputs and inputs to retrive information needed to create song
                System.out.print("What is the name of the song to add?     ");
                options.nextLine();
                String songName = options.nextLine();
                System.out.print("Who is/are the artist(s)?     ");
                String songArtists = options.nextLine();
                Boolean errorInt;
                int songPlays = 0;
                System.out.print("What is the current play count of the song?     ");
                // Use a do/while loop and a try/catch functions to ensure an integer is entered
                do {
                    try {
                        errorInt = false;
                        songPlays = options.nextInt();
                    } catch (Exception e) {
                        System.out.print("Error, please enter an integer     ");
                        errorInt = true;
                        options.next();
                    }
                } while (errorInt != false);
                listOfSongs.createSong(songName, songArtists, songPlays);
            }
                // case 1:
            if (songOption == 1) {

                listOfSongs.printSongs();
                // Request an integer for the song the user would like to delete
                System.out.print("Please enter the song number of the song you would like to delete     ");
                Boolean error7;
                int songToRemove = 0;
                do {
                    try{
                        error7 = false;
                        songToRemove = options.nextInt();
                        if ((songToRemove - 1) > listOfSongs.songs.size()) {
                            throw new IndexOutOfBoundsException();
                        }
                    } catch (InputMismatchException e) {
                        System.out.print("Error, please enter an integer     ");
                        error7 = true;
                        options.next();
                    } catch (IndexOutOfBoundsException f) {
                        System.out.print("Error, please enter an integer between 0 and ");
                        System.out.print(listOfSongs.songs.size() - 1);
                        System.out.print("     ");
                        error7 = true;
                    }
                } while (error7 != false);
                listOfSongs.removeSong(songToRemove);
            }
                // case 2:
            if (songOption == 2) {
                listOfSongs.printSongs();
            }
                // case 3:
            if (songOption == 3) {

                // Request an integer for the minimum amount of plays
                Boolean errorInt2 = false;
                int plays = 0;
                System.out.print("Enter the amount of plays which is the minimum you would like to display.     ");
                do {
                    try {
                        errorInt2 = false;
                        plays = options.nextInt();
                    } catch (Exception e) {
                        System.out.println("Error, please enter an integer");
                        errorInt2 = true;
                        options.next();
                    }
                } while (errorInt2 != false);
                listOfSongs.songsAbove(plays);
            }
                // case 4:
            if (songOption == 4) {
                end = true;
            }
            if (end != false) {
                break;
            }
        } 
        while(end != true);
    // Closing scanner object to avoid irritating error message
        options.close();
    }
}