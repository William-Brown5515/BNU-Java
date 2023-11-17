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

        // Inititialise variables for user to choose options, and for whether to end the program
        Integer songOption = 0;
        Boolean end = false;

        // Start do while loop, which ends when user chooses to end program
        do {
            // Series of outputs to display options to the user
            System.out.println("Please read the following options and enter the number.");
            System.out.println("Press 0 to add a song.");
            System.out.println("Press 1 to remove a song.");
            System.out.println("Press 2 to print a list of all the songs.");
            System.out.println("Press 3 to print a list of songs over a certain amount of plays.");
            System.out.println("Press 4 to exit.");
            System.out.print("Which option would you like to pick?     ");

            // Initiate error variable
            Boolean errorOptions;

            // Use a do/while loop and a try/catch functions to ensure an integer is entered
            do {
                try {
                    // Makes error variable false, as it may have been true previously
                    errorOptions = false;

                    // Ask for input
                    songOption = options.nextInt();

                    // If the number isn't in the range that it has offered, throw an exception
                    if (songOption <= 0) {
                        throw new IndexOutOfBoundsException();
                    }
                    else if (songOption > 5) {
                        throw new IndexOutOfBoundsException();
                    }
                } catch (InputMismatchException e) {
                    // If an integer isn't entered, show relevant error message, and ask for another input
                    errorOptions = true;
                    System.out.print("Error, please enter an integer   ");
                    options.next();

                } catch (IndexOutOfBoundsException f) {
                    // Catch exception that was thrown as user selected integer that was not in the range, and output error
                    errorOptions = true;
                    System.out.print("Error, please enter an integer between 0 and 4     ");
                }

            } while (errorOptions != false);

            // Series of if loops to complete methods as requested by user
            if (songOption == 0) {

                // Series of outputs and inputs to retrive information needed to create song
                System.out.print("What is the name of the song to add?     ");
                options.nextLine();
                String songName = options.nextLine();
                System.out.print("Who is/are the artist(s)?     ");
                String songArtists = options.nextLine();

                // Prepare for try-catch function by displaying messages and initialising variables
                int songPlays = 0;
                System.out.print("What is the current play count of the song?     ");
                Boolean errorInt;

                // Use a do/while loop and a try/catch functions to ensure an integer is entered
                // This is similar to the try/catch used for the songOption input
                do {
                    try {
                        errorInt = false;
                        songPlays = options.nextInt();

                    } catch (Exception e) {
                        // Avoid user putting in a data type that isn't a variable
                        System.out.print("Error, please enter an integer     ");
                        errorInt = true;
                        options.next();
                    }
                } while (errorInt != false);

                // Use the createSong method to create the song 
                listOfSongs.createSong(songName, songArtists, songPlays);
            }

            if (songOption == 1) {

                // Check if list of songs is empty, if it is then don't remove song
                if (listOfSongs.songs.size() == 0) {
                    System.out.println("Apologies, however there are no songs in the list");

                }
                else {
                    // Print songs to enable user to choose which song to delete
                    listOfSongs.printSongs();

                    // Request an integer for the song the user would like to delete, initialise variable for try/catch
                    System.out.print("Please enter the song number of the song you would like to delete     ");
                    Boolean errorRemove;
                    int songToRemove = 0;

                    // Do-while and try-catch methods to ensure input is as expected
                    do {
                        try{
                            errorRemove = false;
                            songToRemove = options.nextInt();

                            // Throw exception if integer entered is out of range
                            if ((songToRemove - 1) > listOfSongs.songs.size()) {
                                throw new IndexOutOfBoundsException();
                            }
                        } catch (InputMismatchException e) {
                            // If user did not enter integer, show error message and try again
                            System.out.print("Error, please enter an integer     ");
                            errorRemove = true;
                            options.next();

                        } catch (IndexOutOfBoundsException f) {
                            // If index is out of list range, show error message and try again
                            System.out.print("Error, please enter an integer between 0 and ");
                            System.out.print(listOfSongs.songs.size() - 1);
                            System.out.print("     ");
                            errorRemove = true;

                        }
                    } while (errorRemove != false);

                    // Use a SongList method to remove the song chosen by the user
                    listOfSongs.removeSong(songToRemove);
                }
            }

            if (songOption == 2) {
                // Prints the songs in the list
                listOfSongs.printSongs();
            }

            if (songOption == 3) {
                // Request an integer for the minimum amount of plays, initialise variables for try/catch
                Boolean errorInt2 = false;
                int plays = 0;
                System.out.print("Enter the amount of plays which is the minimum you would like to display.     ");

                // Use do-while and try-catch to ensure inputs have correct data type
                do {
                    try {
                        errorInt2 = false;
                        plays = options.nextInt();
                    
                    } catch (Exception e) {
                        // If user did not enter integer, display error message and request new input
                        System.out.print("Error, please enter an integer     ");
                        options.next();
                        errorInt2 = true;

                    }
                } while (errorInt2 != false);
                listOfSongs.songsAbove(plays);
            }
            if (songOption == 4) {
                // Change variable end to true as that is what the user has requested
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