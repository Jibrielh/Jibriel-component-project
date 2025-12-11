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
     * Randomly rearranges the order of the songs in this playlist. PLaylist is
     * shuffled after
     *
     * @updates this
     * @ensures order of this != #this
     **/
    void shuffle();

    /**
     * Determines whether a given song is contained in this playlist.
     *
     * @param n
     *            is the song will be checking to see if it is in the playlist
     * @requires n != null
     * @requires playlist > 0 Returns boolean statement if song is in
     * @ensures contains is equal to if Param n is in the playlist
     **/
    Boolean contains(String n);

    /**
     * Removes all duplicate songs from this playlist.
     *
     * @updates this
     * @ensures no element/song is in the playlist more than once
     */
    void removeDup();

    /**
     *
     * Removes and returns an arbitrary song from this playlist.
     *
     * @updates this
     * @ensures this = @this - m
     * @return an arbitrary song
     **/
    @Override
    String removeAny();

}
