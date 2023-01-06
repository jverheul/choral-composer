package jv.composer;

import jm.JMC;
import jm.music.data.Note;
import jm.music.data.Phrase;
import jm.util.View;

public class App implements JMC {

    public static void main(String[] args) {

        new App().compose();
    }

    public void compose() {

        Note n;
        n = new Note(C4, QUARTER_NOTE);
        Phrase phr = new Phrase();
        phr.addNote(n);

        View.notate(phr);
    }
}


