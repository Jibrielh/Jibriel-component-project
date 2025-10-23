public interface MusicPlaylistKernel extends Standard<MusicPlaylistKernel> {

    /*
     *
     *
     *
     * @param n is the song be added
     *
     * @ensures n * #this
     */
    void songAdd(String n);

    /*
     *
     *
     *
     * @param n is the song being removed
     *
     * @requires n is in playlist
     *
     * @ensures this = #this - n
     */
    void songRemove(String n);

    /*
     *
     *
     *
     * @returns the amount of songs inside the playlist
     */
    int size();

}
