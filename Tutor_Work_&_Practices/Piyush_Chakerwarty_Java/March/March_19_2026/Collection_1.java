import java.util.ArrayList;
import java.util.List;

public class Collection_1 {
    public static void main(String[] args) {
        // Created an empty error list to add the playlist songs
        List<String> playlist = new ArrayList<>();

        // Uppending new playlists at the end of the ArrayList
        playlist.add("Bohomjam Rhapsody");
        playlist.add("Straight to Heaven");
        playlist.add("Hotel California");

        // Insert a song at the beginning
        playlist.add(0, "We Will Rock You");

        // Display the number of elements in the arraylist
        System.out.println(playlist.size());

        // Display the song present at position (index) 1
        playlist.get(1); // Bohomjam Rhapsody

        // Check if a specific song is in the list
        if (playlist.contains("Hotel California")) {
            // Find the index of a matching element 
            int position = playlist.indexOf("Hotel California");
            System.out.println("Hotel California is found at index: " + position);
        } // If it is present display the index of the song

        // Remove a song by its index
        playlist.remove(3);

        // Display the current playlist
        System.out.println("------ Current Playlist ------");
        for (String song : playlist) {
            System.out.println("-" + song);
        }

        // Clear the entrie playlist
        playlist.clear();
        System.out.println("\nPlaylist cleare. Is it empty? " + playlist.isEmpty());
    }

}
