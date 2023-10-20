public class Main {
    public static void main(String[] Args) {
        System.out.println("Working!");
        SongList listOfSongs = new SongList();
        listOfSongs.printSongs();
//        listOfSongs.removeSong();
//        listOfSongs.printSongs();
        listOfSongs.songsAbove(300000000);
    }
}