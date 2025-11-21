/**
 * Abstarct class implementing the secondary methods for {@code MusicPlaylist}
 * Methods are being created by using only my kernel methods
 * add,remove,size,removeany
 *
 */
public abstract class MusicPlaylistSecondary implements MusicPlaylist {

    @Override
    public final Boolean contains(String s) {
        boolean flag = false;
        int l = this.size();
        String[] temp = new String[l];

        for (int i = 0; i < l; i++) {
            temp[i] = this.removeAny();
            if (temp[i].equals(s)) {
                flag = true;
            }

        }
        for (int i = 0; i < l; i++) {
            this.songAdd(temp[i]);

        }

        return flag;
    }

    @Override
    public final void shuffle() {
        int s = this.size();
        if (s <= 1) {
            return;
        }
        String[] temp = new String[s];
        for (int i = 0; i < s; i++) {
            temp[i] = this.removeAny();
        }
        for (int i = 0; i < s - 1; i++) {
            String random = temp[i];
            temp[i] = temp[i + 1];
            temp[i + 1] = random;

        }
        for (int i = 0; i < s; i++) {
            this.songAdd(temp[i]);

        }

    }

    @Override
    public final void removeDup() {

        int l = this.size();

        if (l <= 1) {
            return;
        }
        String[] temp = new String[l];

        for (int i = 0; i < l; i++) {
            temp[i] = this.removeAny();
        }

        for (int i = 0; i < l; i++) {
            boolean check = false;
            for (int j = 0; j < i; j++) {
                if (temp[i].equals(temp[j])) {
                    check = true;

                }
            }

            if (!check) {
                this.songAdd(temp[i]);

            }
        }
    }

}
