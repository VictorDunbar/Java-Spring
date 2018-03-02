import java.util.*;


public class TrackListTest {
    public static void main(String[] args) {
        TrackList tracks = new TrackList();
        //Add tracks(4 songs)
        tracks.addSong("Ric Flair Drip", "Going to the jeweler, bust the AP, yeah. Slidin' on the water like a jet-ski, yeah..");
        tracks.addSong("Finesse", "Out here drippin' in finesse. You know it, you know it!");
        tracks.addSong("PROBLMS", "Remember that I tried to build ya, now I ain't worried 'bout shit. So I found me a new thang, I'm not as lost as you think..");
        tracks.addSong("Mood", "You don't wanna fall back. I don't want to fall back tonight. I just want my old baby..");
        //Pull one of the songs by title
        String lyrics4mood = tracks.getSong("Mood");
        System.out.println(lyrics4mood);
        //Print all track names and lyrics
        tracks.printTrackList();
    }
}