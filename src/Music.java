public class Music {

    private MusicPlaylistOnArrayList playlist;

    /**
     * This is playing around for use case part
     */

    public Music() {
        this.playlist = new MusicPlaylistOnArrayList();
    }

    public void addSong(String song) {
        this.playlist.songAdd(song);
    }

    public void removeSong(String song) {
        this.playlist.songRemove(song);
    }

    public int sizer() {
        return this.playlist.size();
    }

    public boolean containsSong(String song) {
        return this.playlist.contains(song);
    }

    public void removeDuplicates() {
        this.playlist.removeDup();
    }

    public void shufflePlaylist() {
        this.playlist.shuffle();
    }

    public void clearPlaylist() {
        this.playlist.clear();
    }

    public static void main(String[] args) {
        Music songs = new Music();

        songs.addSong("Heat");
        songs.addSong("Heat");
        songs.addSong("Commercial");

        System.out.println("playlist sizee. " + songs.sizer());
        System.out.println("Contains 'Heat" + songs.containsSong("Heat"));

        songs.removeDuplicates();
        System.out.println("Playlist size after " + songs.sizer());

        songs.removeSong("Commercial");
        System.out.println("Playlist size after we took out" + songs.sizer());

        songs.clearPlaylist();
        System.out.println("Playlist size after clearing: " + songs.sizer());
    }
}