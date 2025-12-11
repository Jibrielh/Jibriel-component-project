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

    @Override
    public boolean equals(Object o) {

        boolean flag = true;
        int n = this.size();

        if (this != o) {

            if (o.getClass() != this.getClass()) {
                flag = false;
            } else {

                MusicPlaylist other = (MusicPlaylist) o;

                if (this.size() != other.size()) {
                    flag = false;

                } else {

                    String[] songA = new String[n];
                    String[] songB = new String[n];

                    for (int i = 0; i < n; i++) {
                        songA[i] = this.removeAny();
                        songB[i] = other.removeAny();
                    }

                    for (int i = 0; i < n; i++) {
                        this.songAdd(songA[i]);
                        other.songAdd(songB[i]);
                    }

                    for (int i = 0; i < n; i++) {

                        boolean found = false;
                        for (int j = 0; j < n; j++) {
                            if (songA[i].equals(songB[j])) {
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            flag = false;
                        }
                    }
                }
            }
        }

        return flag;
    }

    @Override
    public String toString() {
        String res = "";
        int n = this.size();
        String[] temp = new String[n];
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < n; i++) {
            temp[i] = this.removeAny();
        }

        for (int i = 0; i < n; i++) {
            s.append(temp[i]);
            if (i < n - 1) {
                s.append(" , ");
            }
        }

        for (int i = 0; i < n; i++) {
            this.songAdd(temp[i]);
        }

        res = s.toString();
        return res;
    }

    @Override
    public int hashCode() {

        int n = this.size();
        String[] temp = new String[n];

        for (int i = 0; i < n; i++) {
            temp[i] = this.removeAny();
        }

        int total = 0;
        for (int i = 0; i < n; i++) {
            total += temp[i].hashCode();
        }

        for (int i = 0; i < n; i++) {
            this.songAdd(temp[i]);
        }

        return total;
    }
}
