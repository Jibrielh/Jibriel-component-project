
/*
     *  Interface  defines the kernel methods in {@code MusicplaylistKernel}
     *
     *
     * @Author Jibriel Hassan
     */

public interface MusicPlaylistKernel extends Standard<MusicPlaylistKernel> {

    /**
     *
     *
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
     *
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
     *
     *
     * @ensures |this| = size
     * @returns the amount of songs inside the playlist
     */
    int size();

}
