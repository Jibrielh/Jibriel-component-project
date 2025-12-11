
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public abstract class MusicTest {

    /**
     * JUnit test for MusicPlaylistOnArrayList kernel .
     *
     *
     */

    /**
     * @return a new MusicPlaylist for testing
     */
    protected abstract MusicPlaylistOnArrayList constructorTest();

    /**
     * @return a new reference MusicPlaylist
     */
    protected abstract MusicPlaylistOnArrayList constructorRef();

    /**
     * Test that constructor creates an empty playlist.
     */
    @Test
    public final void testConstructor() {
        MusicPlaylistOnArrayList test = this.constructorTest();
        MusicPlaylistOnArrayList ref = this.constructorRef();
        assertEquals(ref, test);
        assertEquals(0, test.size());
    }

    @Test
    public final void testconstruc2() {
        MusicPlaylistOnArrayList test = this.constructorTest();
        MusicPlaylistOnArrayList ref = this.constructorRef();
        assertEquals(ref, test);
    }

    /**
     * Test adding a song.
     */
    @Test
    public final void testAddOneSong() {
        MusicPlaylistOnArrayList p = this.constructorTest();
        p.songAdd("ohyee");
        assertEquals(1, p.size());
        assertTrue(p.contains("ohyee"));
    }

    @Test
    public final void testaddDup() {
        MusicPlaylistOnArrayList p = this.constructorTest();
        p.songAdd("x");
        p.songAdd("x");
        assertEquals(2, p.size());
        assertTrue(p.contains("x"));
    }

    /**
     * Test adding mult songs.
     */
    @Test
    public final void testAddTwoSongs() {
        MusicPlaylistOnArrayList p = this.constructorTest();
        p.songAdd("ohyee");
        p.songAdd("Hkk");
        assertEquals(2, p.size());
        assertTrue(p.contains("ohyee"));
        assertTrue(p.contains("Hkk"));
    }

    /**
     * Test remove a song.
     */
    @Test
    public final void testRemoveSong() {
        MusicPlaylistOnArrayList p = this.constructorTest();
        p.songAdd("A");
        p.songAdd("B");
        p.songRemove("A");
        assertEquals(1, p.size());
        assertFalse(p.contains("A"));
        assertTrue(p.contains("B"));
    }

    @Test
    public final void removesong2() {
        MusicPlaylistOnArrayList p = this.constructorTest();
        p.songAdd("A");
        p.songRemove("Z"); // not in playlist
        assertEquals(1, p.size());
        assertTrue(p.contains("A"));
    }
    // Test removeAny

    @Test
    public final void testRemoveAny() {
        MusicPlaylistOnArrayList p = this.constructorTest();
        p.songAdd("a");
        p.songAdd("b");
        p.songAdd("c");

        MusicPlaylistOnArrayList s = this.constructorTest();
        s.songAdd("a");
        s.songAdd("b");
        s.songAdd("c");

        String removed = p.removeAny();

        assertTrue(s.contains(removed));

        s.songRemove(removed);

        assertEquals(s, p);
    }

    @Test
    public final void testRemoveAnyMultiple() {

        MusicPlaylistOnArrayList p = this.constructorTest();
        MusicPlaylistOnArrayList p2 = this.constructorTest();

        p.songAdd("a");
        p.songAdd("b");
        p.songAdd("c");
        p2.songAdd("a");
        p2.songAdd("b");
        p2.songAdd("c");
        String removed = p.removeAny();
        assertTrue(p2.contains(removed));
        p2.songRemove(removed);
        assertEquals(p2, p);
    }

    //Size Test
    @Test
    public final void testSize() {
        MusicPlaylistOnArrayList p = this.constructorTest();
        p.songAdd("a");
        p.songAdd("b");
        assertEquals(2, p.size());
    }

    @Test
    public final void testSizeEmp() {
        MusicPlaylistOnArrayList p = this.constructorTest();
        assertEquals(0, p.size());
    }

    //clear
    @Test
    public final void testClear() {
        MusicPlaylistOnArrayList p = this.constructorTest();
        p.songAdd("jib");
        p.songAdd("B");
        p.clear();
        assertEquals(0, p.size());

    }

    @Test
    public final void testClearEmpty() {
        MusicPlaylistOnArrayList p = this.constructorTest();
        p.clear();
        assertEquals(0, p.size());
    }

    @Test
    public final void testNewInstance() {
        MusicPlaylistOnArrayList p = this.constructorTest();
        MusicPlaylistOnArrayList n = p.newInstance();

        assertEquals(0, n.size());

        assertEquals(p.getClass(), n.getClass());

    }

    @Test
    public final void testTransferFrom() {
        MusicPlaylistOnArrayList d = this.constructorTest();
        MusicPlaylistOnArrayList s = this.constructorTest();

        d.songAdd("heat");

        s.songAdd("jib");
        s.songAdd("jib2");

        d.transferFrom(s);

        assertEquals(2, d.size());
        assertFalse(d.contains("heat"));
        assertTrue(d.contains("jib"));
        assertTrue(d.contains("jib2"));

        assertEquals(0, s.size());
    }

    // Seconday methods Test
    @Test
    public final void contains() {
        MusicPlaylistOnArrayList p = this.constructorTest();
        p.songAdd("A");
        p.songAdd("J");
        assertTrue(p.contains("J"));
    }

    @Test
    public final void contains2() {
        MusicPlaylistOnArrayList p = this.constructorTest();
        p.songAdd("A");
        assertFalse(p.contains("J"));
    }

    @Test
    public final void testRemoveDup() {
        MusicPlaylistOnArrayList p = this.constructorTest();
        p.songAdd("x");
        p.songAdd("y");
        p.songAdd("x");
        p.songAdd("y");

        p.removeDup();

        assertEquals(2, p.size());
        assertTrue(p.contains("x"));
        assertTrue(p.contains("y"));
    }

    @Test
    public final void testremoveDup2() {
        MusicPlaylistOnArrayList p = this.constructorTest();
        p.songAdd("a");
        p.songAdd("b");
        p.songAdd("c");

        p.removeDup();

        assertEquals(3, p.size());
    }

    @Test
    public final void shuffle() {
        MusicPlaylistOnArrayList p = this.constructorTest();
        p.songAdd("a");
        p.songAdd("b");
        p.songAdd("c");

        MusicPlaylistOnArrayList p2 = this.constructorTest();
        p2.songAdd("a");
        p2.songAdd("b");
        p2.songAdd("c");

        p.shuffle();

        assertEquals(p2.size(), p.size());
        assertTrue(p.contains("a"));
        assertTrue(p.contains("b"));
        assertTrue(p.contains("c"));
    }

    @Test
    public final void equal1() {
        MusicPlaylistOnArrayList a = this.constructorTest();
        MusicPlaylistOnArrayList b = this.constructorTest();
        a.songAdd("j");
        a.songAdd("i");

        b.songAdd("j");
        b.songAdd("i");

        assertTrue(a.equals(b));
    }

    @Test
    public final void equal2() {
        MusicPlaylistOnArrayList a = this.constructorTest();
        a.songAdd("j");

        MusicPlaylistOnArrayList b = this.constructorTest();
        b.songAdd("i");

        assertFalse(a.equals(b));
    }

    @Test
    public final void tostringtest() {
        MusicPlaylistOnArrayList p = this.constructorTest();
        p.songAdd("j");
        p.songAdd("i");

        String result = p.toString();
        assertTrue(result.contains("j"));
        assertTrue(result.contains("i"));
    }

    @Test
    public final void hash() {
        MusicPlaylistOnArrayList a = this.constructorTest();
        a.songAdd("j");
        a.songAdd("i");

        MusicPlaylistOnArrayList b = this.constructorTest();
        b.songAdd("j");
        b.songAdd("i");

        assertEquals(a.hashCode(), b.hashCode());
    }
}
