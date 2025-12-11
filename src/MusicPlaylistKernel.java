
/*
     *  Interface  defines the kernel methods in {@code MusicplaylistKernel}
     *
     *
     * @Author Jibriel Hassan
     */

public interface MusicPlaylistKernel extends Standard<MusicPlaylist> {

    /**
     *
     * Adds a song to this playlist.
     *
     * @param n
     *            is the song be added
     * @updates this
     *
     * @ensures n * #this
     */
    void songAdd(String n);

    /**
     *
     * Removes a specified song from this playlist.
     *
     * @param n
     *            is the song being removed
     *
     * @requires n is in playlist
     * @updates this
     * @ensures this = #this - n
     */
    void songRemove(String n);

    /**
     * Returns the number of songs in this playlist.
     *
     * @ensures |this| = size
     * @returns the amount of songs inside the playlist
     */
    int size();

    /**
     * Removes and returns an arbitrary song from this playlist.
     *
     * @requires this != null
     * @updates this
     * @ensures this = #this-n && removeAny = n;
     * @returns an arbritrary song
     */
    String removeAny();

}
