import java.util.ArrayList;

/**
 * {@code Musicplaylist} repersented using an
 * {@code ArrayList<String>  with implementations
 * for all kernel/standards file}
 *
 * @correspondence this = playlist
 * @convention Playlist is not null and playlist.get(i) != null also
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
        int i = (int) (Math.random() * this.playlist.size());
        return this.playlist.remove(i);
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
        MusicPlaylistOnArrayList src = (MusicPlaylistOnArrayList) t;

        this.playlist = src.playlist;

        src.playlist = new ArrayList<>();

    }

}
