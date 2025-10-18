import java.util.List;

public class Music {

    private List<String> playlist;

    /*
     * Working on possibe methods they are subject to change if this does not
     * work out well
     *
     * Add,remove,size,clear shuffle, contains,remove a dup
     *
     */

    public void playlistAdd(String n) {
        this.playlist.add(n);

    }

    public void playlistRemove(String n) {
        this.playlist.remove(n);

    }

    public int playlistSize() {
        return this.playlist.size();

    }

    public void empty() {
        this.playlist.clear();

    }

    public boolean isIN(String n) {
        boolean check = false;
        if (this.playlist.contains(n)) {
            check = true;
        }
        return check;
    }

    public void RemoveDup() {
        int i = 0;
        String n;
        while (i < this.playlistSize()) {
            n = this.playlist.get(i);
            int dup = i + 1;
            while (dup < this.playlistSize()) {
                if (this.playlist.get(i) == this.playlist.get(dup)) {
                    this.playlist.remove(dup);
                } else {
                    dup++;

                }
            }

        }

    }

    public static void main(String[] args) {
        Music jSongs = new Music();
        jSongs.playlistAdd("Heating up");
        jSongs.playlistRemove("Heating up");
        jSongs.playlistAdd("Commercial");
        int jSize = jSongs.playlistSize();
        Boolean isThere = jSongs.isIN("Heating up");
        jSongs.playlistAdd("commercial");
        jSongs.RemoveDup();
        jSongs.empty();

    }

}
