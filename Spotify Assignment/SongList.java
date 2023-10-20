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
    
    public void createSong(String title, String name, Integer count) {
        Scanner songCreate = new Scanner(System.in);
        System.out.print("What is the name of the song?     ");
        String songName = songCreate.nextLine();
        System.out.print("What is the name of the artist(s)?     ");
        String songArtist = songCreate.nextLine();
        System.out.print("What is the play count of the song?     ");
        Integer songCount = songCreate.nextInt();
        songs.add(new Song(songName, songArtist, songCount));
        songCreate.close();
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
    }

    public void songsAbove(Integer plays) {
        for (Integer a = 0; a < (songs.size()); a++) {
            if (songs.get(a).playCount > plays) {
            System.out.print(songs.get(a).songTitle);
            System.out.print("     ");
            System.out.print(songs.get(a).artistName);         
            System.out.print("     ");
            System.out.println(songs.get(a).playCount);
            }
        }
    }
}
