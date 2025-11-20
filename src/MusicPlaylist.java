/**
 * Interface extends {@code MusciPLaylistKernel} also includes the secondary
 * methods defines {@code Musicplaylist}
 *
 *
 * @Author Jibriel Hassan
 */
public interface MusicPlaylist extends MusicPlaylistKernel {

    /**
     *
     *
     * PLaylist is shuffled after
     *
     * @updates this
     * @ensures order of this != #this
     **/
    void shuffle();

    /**
     *
     * @param n
     *            is the song will be checking to see if it is in the playlist
     * @requires n != null
     * @requires playlist > 0 Returns boolean statement if song is in
     * @ensures contains is equal to if Param n is in the playlist
     **/
    Boolean contains(String n);

    /**
     * @updates this
     * @ensures no element/song is in the playlist more than once
     */
    void removeDup();

    /**
     * @updates this
     * @ensures no element/song is in the playlist more than once
     */
    String removeAny();

}
