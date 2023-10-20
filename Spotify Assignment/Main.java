import java.util.Scanner;
public class Main {
    public static void main(String[] Args) {
        SongList listOfSongs = new SongList();
        Scanner options = new Scanner(System.in); 
        Integer songOption;    
        while (true) {
            System.out.println("Please read the following options and enter the number.");
            System.out.println("Press 0 to add a song.");
            System.out.println("Press 1 to remove a song.");
            System.out.println("Press 2 to print a list of all the songs.");
            System.out.println("Press 3 to print a list of songs over a certain amount of plays.");
            System.out.println("Enter any other number to exit.");
            System.out.print("Which option would you like to pick?     ");
            Scanner newScanner = new Scanner(System.in);
            songOption = options.nextInt();
            newScanner.close();
            if (songOption == 0) {
                listOfSongs.createSong();
            }
            else if (songOption == 1) {
                listOfSongs.removeSong();
            }
            else if (songOption == 2) {
                listOfSongs.printSongs();
            }
            else if (songOption == 3) {
                listOfSongs.songsAbove();
            }
            else {
                break;
            }
            songOption = 0;
        }
        options.close();
    }
}