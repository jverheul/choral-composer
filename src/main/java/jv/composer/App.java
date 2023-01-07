package jv.composer;

import jm.JMC;
import jm.music.data.Part;
import jm.music.data.Phrase;
import jm.music.data.Score;
import jm.util.Write;

public class App implements JMC {

    public static void main(String[] args) {

        new App().compose();
    }

    public void compose() {

        Score score = new Score();
        Part p1 = new Part();
        p1.setKeyQuality(1);
        p1.setKeySignature(-1);

        Phrase phrase1 = new Phrase();
        int[] chord = { C4, F4 };
        phrase1.addChord(chord, QUARTER_NOTE);
        p1.addPhrase(phrase1);

        Part p2 = new Part();
        Phrase phrase1b = new Phrase();
        int[] chordb = { F3, A3 };
        phrase1b.addChord(chordb, QUARTER_NOTE);
        p2.addPhrase(phrase1b);

        score.add(p1);
        score.add(p2);

        //        Part p2 = new Part();
        //        p2.setKeyQuality(1);
        //        p2.setKeySignature(-1);
        //
        //        Note n2;
        //        n2 = new Note(F3, QUARTER_NOTE);
        //        Phrase phrase2 = new Phrase();
        //        phrase2.addNote(n2);
        //        p2.addPhrase(phrase2);
        //
        //        Note n2b;
        //        n2b = new Note(A4, QUARTER_NOTE);
        //        Phrase phrase2b = new Phrase();
        //        phrase2b.addNote(n2b);
        //        p2.addPhrase(phrase2b);
        //
        //        score.add(p2);
        //
        //        View.notate(score);
        Write.midi(score, "score.mid");
    }
}


