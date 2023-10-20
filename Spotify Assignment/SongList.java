import java.util.ArrayList;
import java.util.Scanner;

public class SongList {
    
    ArrayList<Song> songs = new ArrayList<Song>();

    public static void main(String[] args) {
    }

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
        Scanner optionsA = new Scanner(System.in);
        System.out.print("What is the name of the song to add?     ");
        String songName = optionsA.nextLine();
        System.out.print("Who is/are the artist(s)?     ");
        String songArtists = optionsA.nextLine();
        System.out.print("What is the current play count of the song?     ");
        Integer songPlays = optionsA.nextInt();
        songs.add(new Song(songName, songArtists, songPlays));
        optionsA.close();
    }
    
    public void printSongs() {
        for (int i = 0; i < (songs.size()); i++) {
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
        System.out.print("Please enter the song number of the song you would like to delete");
        Integer songToRemove = rmSong.nextInt();
        System.out.println(songToRemove);
        Song temp = songs.get(songToRemove);
        songs.remove(temp);
        rmSong.close();
        this.printSongs();
    }

    public void songsAbove() {
        System.out.print("Enter the amount of plays which is the minimum you would like to display.     ");
        Scanner playC= new Scanner(System.in);
        Integer plays = playC.nextInt();
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
