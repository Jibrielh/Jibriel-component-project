public interface MusicPlaylist extends MusicPlaylistKernel {

    /*
     *
     *
     * PLaylist is shuffled after
     *
     * @ensures order of this != #this
     */
    void shuffle();

    /*
     *
     * @param n is the song will be checking to see if it is in the playlist
     *
     * @requires playlist > 0 Returns boolean statement if song is in
     */
    Boolean contains(String n);

    /**
     * @ensures no element/song is in the playlist more than once
     */
    void removeDup();

}
