import java.util.ArrayList;

/**
 * Implenting {@code Musicplaylist}
 *
 * Convention Playlist != null // playlist exist Every song in playlist != null
 *
 *
 *
 *
 *
 */

public class MusicPlaylistOnArrayList extends MusicPlaylistSecondary {

    private ArrayList<String> playlist;

    public MusicPlaylistOnArrayList() {
        this.playlist = new ArrayList<>();

    }

    @Override
    public void songAdd(String n) {
        assert n != null : "Violated the convention, the song cannot be null";
        this.playlist.add(n);

    }

    @Override
    public void songRemove(String n) {
        for (int i = 0; i < this.playlist.size(); i++) {
            if (this.playlist.get(i).equals(n)) {
                this.playlist.remove(n);
                return;
            }
        }
    }

    @Override
    public String removeAny() {

        int mid = this.playlist.size() / 2;

        return this.playlist.remove(mid);

    }

    @Override
    public int size() {

        return this.playlist.size();

    }

    @Override
    public MusicPlaylistOnArrayList newInstance() {
        return new MusicPlaylistOnArrayList();
    }

    @Override
    public void clear() {
        this.playlist.clear();
    }

    @Override
    public void transferFrom(MusicPlaylist t) {
        MusicPlaylistOnArrayList playlist2 = (MusicPlaylistOnArrayList) t;

        this.playlist = playlist2.playlist;
        playlist2.playlist.clear();

    }

}
